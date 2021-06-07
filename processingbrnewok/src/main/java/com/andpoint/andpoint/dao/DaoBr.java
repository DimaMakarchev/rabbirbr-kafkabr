package com.andpoint.andpoint.dao;

import com.andpoint.andpoint.model.OrderBR;

import java.util.ArrayList;
import java.util.List;

public interface DaoBr {
    /*create*/
    void creatDBBR();

    /*insert*/
    void saveDateINDBBR(List<OrderBR> orderBRList);

    /*update*/
    void updateDBBR(OrderBR orderBR);

    /*getAll*/
    ArrayList<OrderBR> selectAll();

    /*getOnID*/
    OrderBR selectONId();
}
