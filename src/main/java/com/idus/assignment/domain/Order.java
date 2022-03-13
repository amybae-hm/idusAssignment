package com.idus.assignment.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Order {
    private String orderNo;
    private String productNm;
    private Timestamp orderDt;

}
