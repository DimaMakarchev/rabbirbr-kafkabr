package com.storebr.storebr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
public class StorebrApplication {


    public static void main(String[] args) {
        SpringApplication.run(StorebrApplication.class, args);
    }

}
