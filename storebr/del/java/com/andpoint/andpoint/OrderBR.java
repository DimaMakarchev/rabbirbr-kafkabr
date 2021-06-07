package com.andpoint.andpoint;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderBR {
    private Integer id;
    private String name;
    private Integer cost;
    private String status;

}
