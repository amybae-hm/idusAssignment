package com.idus.assignment.domain.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    private String orderNo;
    private Integer orderSeq;
    private String productNm;
    private Timestamp orderDt;

}
