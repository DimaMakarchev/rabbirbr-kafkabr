package com.orderbr.orderbr;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class OrderBR {
    private Integer id;
    private String name;
    private BigDecimal cost;
    private String status;
}
