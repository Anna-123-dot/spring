package com.sda.spring.configuration;

import com.sda.spring.person.Dom;
import com.sda.spring.person.PersonInt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Autowired
    PersonInt personInt;

    @Bean
    public Dom createDom() {
        Dom dom = new Dom();
        dom.setPerson(personInt);
        return dom;

    }
    @Bean
    public Logger getLogger(InjectionPoint injectionPoint) {
        return LoggerFactory.getLogger(injectionPoint.getMethodParameter().getContainingClass());
    }
}
