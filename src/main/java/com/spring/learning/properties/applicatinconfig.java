package com.spring.learning.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:foo.properties")
//@PropertySource("classpath:boo.properties")
@PropertySources({
        @PropertySource("classpath:foo.properties"),
        @PropertySource("classpath:boo.properties")
})
public class applicatinconfig {
    @Bean
    public RestConnect restConnect(@Value( "${app1.url}") final String Url,@Value( "${app1.password}") final String pswd){
        return new RestConnect(Url,pswd);
    }
}
