package com.spring.learning.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix="mmm")
public class MmmProperties {
    String name;
    String daughter;
    String son;

}
