package com.andpoint.andpoint.dao;

import com.andpoint.andpoint.model.OrderBR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("daoBrImpl")
public class DaoBrImpl implements DaoBr {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void creatDBBR() {
        jdbcTemplate.execute("drop table  if exists bro ");
        jdbcTemplate.execute("create table bro\n" +
                "(\n" +
                "    id   int unsigned   not null primary key auto_increment,\n" +
                "    name varchar(50)    not null default 'BRODEFAULT',\n" +
                "    cost decimal(10, 0) not null default 0.00,\n" +
                "    status enum('ok','no') not null default 'no',\n" +
                "    birthday DATETIME DEFAULT CURRENT_TIMESTAMP  );\n");
    }

    @Override
    public void saveDateINDBBR(List<OrderBR> orderBRList) {
        orderBRList.stream().forEach(orderBR -> {
            jdbcTemplate.update("insert into bro(name,cost,status) values (?,?,?)",
                   orderBR.getName(), orderBR.getCost(),String.valueOf(orderBR.getStatus())) ;
        });

    }

    @Override
    public void updateDBBR(OrderBR orderBR) {

    }

    @Override
    public ArrayList<OrderBR> selectAll() {
        return null;
    }

    @Override
    public OrderBR selectONId() {
        return null;
    }
}
