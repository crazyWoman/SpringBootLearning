package com.spring.learning.bean.postprocessor.beanPostprocessor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Service
public class RohanBean implements BeanPostProcessor, InitializingBean, DisposableBean {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            {
                System.out.println("Hi I'm called before initilization");
                System.out.println("bean name"+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            {
                System.out.println("Hi I'm called after initilization");
        return bean;
    }

    public RohanBean() {
        System.out.println("*******************rohan instance created");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("*******************destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("*******************rafterPropertiesSet");

    }
}
