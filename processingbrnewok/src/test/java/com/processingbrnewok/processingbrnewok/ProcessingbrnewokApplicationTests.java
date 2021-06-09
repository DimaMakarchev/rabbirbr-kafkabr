//package com.processingbrnewok.processingbrnewok;
//
//import com.andpoint.andpoint.dao.DaoBrImpl;
//import com.andpoint.andpoint.model.OrderBR;
//import com.andpoint.andpoint.model.Status;
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;
//import org.springframework.test.util.ReflectionTestUtils;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.when;
//
//
////@SpringBootTest
//class ProcessingbrnewokApplicationTests {
//    @Mock
//    Service service;
//
//    @Mock
//    JdbcTemplate jdbcTemplate;
//
//
//    @Test
//    public void testGetUserNames() {
//
//        List<String> userNames = new ArrayList<String>();
//        userNames.add("bob");
//
//        when(service.getJdbcTemplate()).thenReturn(jdbcTemplate);
//        when(jdbcTemplate.query(anyString(), anyObject()).thenReturn(userNames);
//
//        String retVal = Class.getUserNames("test");
//        assertEquals("bob", retVal);
//    }
//    @Mock
//    private JdbcTemplate jdbcTemplate;
////
////    @Mock
////    private DaoBrImpl daoBr;
//
//    @Test
//    void contextLoads() {
//        DaoBrImpl daoBr=new DaoBrImpl();
//        OrderBR bro = new OrderBR(1, "BRO", new BigDecimal(111.00));
//        ReflectionTestUtils.setField(daoBr, "jdbcTemplate", jdbcTemplate);
//        when(jdbcTemplate.queryForObject("select * from bro where id = 3", OrderBR.class))
//                .thenReturn(bro);
//
//        assertEquals(bro, daoBr.selectONId());
//    }
//}
