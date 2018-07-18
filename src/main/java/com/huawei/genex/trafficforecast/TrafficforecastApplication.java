package com.huawei.genex.trafficforecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TrafficforecastApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrafficforecastApplication.class, args);
    }
}
