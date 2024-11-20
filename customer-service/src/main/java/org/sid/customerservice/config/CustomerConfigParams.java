package org.sid.customerservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("customer.params")

public record CustomerConfigParams(int x , int y) {
}
