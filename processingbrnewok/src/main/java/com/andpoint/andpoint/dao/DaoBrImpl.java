package com.andpoint.andpoint.dao;

import com.andpoint.andpoint.model.OrderBR;
import com.andpoint.andpoint.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
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
                "    birthday DATETIME DEFAULT CURRENT_TIMESTAMP ,\n" +
                "   \n" +
                "    index  name_index_search (name));\n");
    }

    @Override
    public void saveDateINDBBR(List<OrderBR> orderBRList) {
        orderBRList.stream().forEach(orderBR -> {
            jdbcTemplate.update("insert into bro(name,cost,status) values (?,?,?)",
                    orderBR.getName(), orderBR.getCost(), String.valueOf(orderBR.getStatus()));
        });

    }

    @Override
    @Transactional
    public void updateDBBR(String name,int id) {
        jdbcTemplate.update("update bro set name = ? where id = ? ",
                name,id);
    }

    @Override
    public List<OrderBR> selectAll(List<Integer> ids) {
        return jdbcTemplate.query("select * from bro WHERE id IN (?,?,?)",
                ids.toArray(),(rs, rowNum)->new OrderBR(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getBigDecimal("cost")
                        ));


    }

    @Override
    public OrderBR selectONId() {
        return null;
    }

}
