package com.example.project01.dto.member;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginForm {

    @NotEmpty(message = "필수 입력 값입니다")
    private String memberEmail;

    @NotEmpty(message = "필수 입력 값입니다")
    private String memberPwd;
}
