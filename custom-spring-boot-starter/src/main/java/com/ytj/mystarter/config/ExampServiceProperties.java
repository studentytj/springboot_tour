package com.ytj.mystarter.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("ytj.service")
@Getter
@Setter
public class ExampServiceProperties {
    private String prefix;
    private String suffix;
}
