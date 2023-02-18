package org.resys.app.config;

import jakarta.annotation.Resource;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class RestTemplateConfig {


    @Bean
    @LoadBalanced // 负载均衡在集群下的情况下
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
