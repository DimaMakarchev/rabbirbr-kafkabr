package com.andpoint.andpoint.services;

import com.andpoint.andpoint.dao.DaoBr;
import com.andpoint.andpoint.dao.DaoBrImpl;
import com.andpoint.andpoint.model.OrderBR;
import com.andpoint.andpoint.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;

import java.util.Collections;
import java.util.Set;

@EnableBinding(Sink.class)
@MessageEndpoint
public class ServiceProcessingBR {
    private static final Set<Integer> SET_INT = Set.of(1, 2, 7, 9);

//    @Qualifier("daoBrImpl")
    @Autowired
    private DaoBrImpl daoBr;

    public ServiceProcessingBR(DaoBrImpl daoBr) {
        this.daoBr=daoBr;
        daoBr.creatDBBR();
    }

    @StreamListener(Sink.INPUT)
    public void methodGet(OrderBR orderBR) {
        daoBr.saveDateINDBBR(Collections.singletonList(orderBR));

        if (SET_INT.contains(orderBR.getId())) {
            methodStatusOK(orderBR);
        } else {
            methodStatusNO(orderBR);
        }
        System.out.println(orderBR.toString());
    }

    private void methodStatusOK(OrderBR orderBR) {
        orderBR.setStatus(Status.OK);
    }

    private void methodStatusNO(OrderBR orderBR) {
        orderBR.setStatus(Status.OK);
    }
}
