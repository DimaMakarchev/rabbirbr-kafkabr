package com.orderbr.orderbr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.math.BigDecimal;
import java.util.Random;
import java.util.logging.Logger;

@EnableScheduling
@EnableBinding(Source.class)
public class ServiceOrderBR {
    Logger logger=Logger.getLogger(ServiceOrderBR.class.getName());
    @Autowired
    private Source source;


    @Scheduled(fixedRate = 3000)
    public void methodSend() {
        Random random=new Random();
        OrderBR bro_car = new OrderBR(random.nextInt(10), "BRO car", new BigDecimal(1111.12), null);
        logger.info(bro_car.toString());
        source.output().send(MessageBuilder.withPayload(bro_car).build());
    }


}
