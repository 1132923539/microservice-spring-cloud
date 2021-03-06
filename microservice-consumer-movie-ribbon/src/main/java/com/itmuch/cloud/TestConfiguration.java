package com.itmuch.cloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ExcludeFromComponentScan
public class TestConfiguration {
//  @Autowired
//  private IClientConfig config;

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
