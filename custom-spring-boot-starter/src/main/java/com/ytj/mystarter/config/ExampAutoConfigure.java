package com.ytj.mystarter.config;

import com.ytj.mystarter.business.ExampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ExampService.class)
@EnableConfigurationProperties(ExampServiceProperties.class)
public class ExampAutoConfigure {

    private final ExampServiceProperties properties;

    @Autowired
    public ExampAutoConfigure(ExampServiceProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "ytj.service", value = "enabled",havingValue = "true")

    ExampService stringService() {
        return new ExampService(properties.getPrefix(), properties.getSuffix());
    }
}
