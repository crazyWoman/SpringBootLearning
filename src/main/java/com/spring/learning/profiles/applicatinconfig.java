package com.spring.learning.profiles;

import com.spring.learning.properties.RestConnect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
public class applicatinconfig {
    @Profile("qa")
    @Bean
    public Programmer programmer(){
        return new Programmer();
    }
}
