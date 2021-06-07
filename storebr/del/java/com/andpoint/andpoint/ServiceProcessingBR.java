package com.andpoint.andpoint;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Sink.class)
@MessageEndpoint
public class ServiceProcessingBR {

    @StreamListener(Sink.INPUT)
    public void methodGet(OrderBR orderBR){
        System.out.println(orderBR.toString());
    }

}
