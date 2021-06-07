package com.andpoint.andpoint.dao;

import com.andpoint.andpoint.model.OrderBR;

import java.util.List;

public interface DaoBr {
    /*create*/
    void creatDBBR();

    /*insert*/
    void saveDateINDBBR(List<OrderBR> orderBRList);

    /*update*/
    void updateDBBR(String name,int id);

    /*getAll*/
    List<OrderBR> selectAll(List<Integer> id);

    OrderBR selectONId();
}
