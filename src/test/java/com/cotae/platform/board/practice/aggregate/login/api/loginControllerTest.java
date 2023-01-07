package com.cotae.platform.board.practice.aggregate.login.api;


import com.cotae.platform.board.practice.aggregate.login.application.LoginService;
import com.cotae.platform.board.practice.aggregate.login.dto.UserDto;
import com.cotae.platform.board.practice.global.error.exceptions.LoginErrorCodeImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@ActiveProfiles("local")
public class loginControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private LoginService loginService;

    //Test Data 선언.
    private List<String> wrongEmail;
    private String validEmail;
    private String password;
    private String userName;
    private UserDto userDto;

    @BeforeEach
    void setUp(){
        //단일 Data configure
        this.password = "1234";
        this.userName = "testUser";
        this.validEmail = "test@gamil.com";
        this.userDto = new UserDto(this.validEmail,this.password,this.userName);

        this.wrongEmail = new ArrayList<>();
        //Email 의 정규식을 통과하지 못하는 Email 데이터.
        this.wrongEmail.add("test");
        this.wrongEmail.add("test@");
        this.wrongEmail.add("SELECT * FROM USER;");
        this.wrongEmail.add("##!@#$vmdkkv#");
        this.wrongEmail.add("@gmail.com");
        this.wrongEmail.add("test@gmail,com");
    }

    @Test
    @DisplayName("필요한 파라미터가 없으면, 회원가입이 실패한다.")
    void failRegisterIfRequiredParamIsEmpty() throws Exception{
        //given
        //FIXME NEED MORE TEST CASES
        ConcurrentHashMap<String,String> body = new ConcurrentHashMap<>();
        body.put("password",password);
        //when
        when(this.loginService.doRegister(any()))
                .thenReturn(this.userDto);
        //then
        this.mockMvc.perform(post("/api/user/register").accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(this.objectMapper.writeValueAsString(body)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("message").value(LoginErrorCodeImpl.USER_REQUIRED_PARAM_IS_EMPTY.getMessage()));
    }
}
