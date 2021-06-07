package com.andpoint.andpoint;

import com.andpoint.andpoint.dao.DaoBrImpl;
import com.andpoint.andpoint.model.OrderBR;
import com.andpoint.andpoint.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
@EnableBinding(Sink.class)
public class AndpointApplicationNewBr implements CommandLineRunner {
    Logger logger = Logger.getLogger(AndpointApplicationNewBr.class.getName());

    private List<OrderBR> orderBRS;

    public AndpointApplicationNewBr() {
        this.orderBRS = Arrays.asList(
                new OrderBR(1, "BRO", new BigDecimal(111.00), Status.OK),
                new OrderBR(1, "Ti", new BigDecimal(111.00), Status.NO),
                new OrderBR(1, "Ma", new BigDecimal(111.00), Status.NO),
                new OrderBR(1, "Ta", new BigDecimal(111.00), Status.OK)
        );
    }

    @Qualifier("daoBrImpl")
    @Autowired
    private DaoBrImpl daoBr;

    public static void main(String[] args) {
        SpringApplication.run(AndpointApplicationNewBr.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        daoBr.creatDBBR();
        daoBr.saveDateINDBBR(orderBRS);
    }
}
