package com.andpoint.andpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
@EnableBinding(Sink.class)
public class AndpointApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndpointApplication.class, args);
    }

}
