package com.huawei.genex.trafficforecast.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ConfigurationProperties(prefix = "BPM")
public class BPM {
    String remote_address;
    Security security;

    @Data
    class Security{
        String username;
        List<String> roles;
    }
}

