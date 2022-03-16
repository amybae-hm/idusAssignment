package com.idus.assignment.domain.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {
    private Integer memNo;
    private String name;
    private String id;
    private String password;
    private Integer hp;
    private String email;
    private String sex;
}
