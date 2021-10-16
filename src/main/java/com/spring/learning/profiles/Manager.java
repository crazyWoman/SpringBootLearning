package com.spring.learning.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class Manager {
    public Manager(@Value( "${app1.name}") String name) {
        System.out.println("Manager"+name);
    }
}
