package com.andpoint.andpoint.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderBR {
    private Integer id;
    private String name;
    private BigDecimal cost;
    private Status status;

}

