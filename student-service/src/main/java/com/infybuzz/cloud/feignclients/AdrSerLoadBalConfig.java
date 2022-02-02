// ゲートウェイを通る処理には不要
/*
package com.infybuzz.cloud.feignclients;

import feign.Feign;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

// load balancer config
@LoadBalancerClient(value = "address-service")
public class AdrSerLoadBalConfig {

    @LoadBalanced
    @Bean
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
*/