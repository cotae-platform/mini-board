package com.cotae.platform.board.practice.aggregate.login.api;

import com.cotae.platform.board.practice.aggregate.login.application.LoginService;
import com.cotae.platform.board.practice.aggregate.login.dto.UserDto;
import com.cotae.platform.board.practice.global.error.exceptions.ArgumentError;
import com.cotae.platform.board.practice.global.error.exceptions.LoginErrorCodeImpl;
import com.cotae.platform.board.practice.global.error.exceptions.LoginExceptions;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

@Slf4j
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> doRegister(
            @RequestBody ConcurrentHashMap<String, Object> body)
    {

        String email = (String) body.remove("email");
        log.debug("Register new user {}",email);
        String password = (String) body.remove("password");
        String userName = (String) body.remove("userName");

        //Email 이 정상적인 Email 형식인지를 검증한다.
        String regex = "^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$";
        List<ArgumentError> errors = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);

        //FIXME IF - ELSE 의 나열은 좋지 않음, Jackson 을 이용해서 직렬화 에러를 잡는게 훨씬 빠름, Jackson이 없기 때문에 우선 이렇게 처리.
        //If userEmail is Empty,
        if(email == null){
            ArgumentError error = new ArgumentError(
                    "email","null","Email is must required."
            );
            errors.add(error);
        }
        //Password is Empty,
        if(password == null){
            ArgumentError error = new ArgumentError(
                    "password","null","password is must required"
            );
            errors.add(error);
        }
        //userName is Empty
        if(userName == null){
            ArgumentError error = new ArgumentError(
                    "userName","null","UserName is must required."
            );
            errors.add(error);
        }
        //Argument Error is not empty-> means, exceptions.
        if(!errors.isEmpty()){
            throw new LoginExceptions(LoginErrorCodeImpl.USER_REQUIRED_PARAM_IS_EMPTY,errors);
        }
        //Email is Not valid.
        if(!pattern.matcher(email).matches()){
            ArgumentError error = new ArgumentError(
                    "email",email,"Email is not valid"
            );
            errors.add(error);
            throw new LoginExceptions(LoginErrorCodeImpl.USER_EMAIL_IS_NOT_VALID,errors);
        }
        // 입력변수 Check 하고 Register 수행. 익명 객체 활용.
        UserDto registeredUser = this.loginService.doRegister(
                new UserDto(email,password,userName)
        );

        return new ResponseEntity<>(registeredUser,HttpStatus.OK);
    }
}
