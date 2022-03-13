package com.idus.assignment.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    private String name;
    private String nickname;
    private String password;
    private Integer phone;
    private String email;
    private String sex;
}
