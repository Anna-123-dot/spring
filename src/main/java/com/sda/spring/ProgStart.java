package com.sda.spring;

import com.sda.spring.person.Dom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProgStart implements CommandLineRunner {

    Logger logger;

    @Autowired
    Dom dom;


    @Override
    public void run(String... args) throws Exception {
        //logger.info("wyswietlam {}", dom);
        logger.info("Logger info");
        logger.debug("Logger debug");
        logger.error("logger error");
        logger.trace("Logger trace");

    }
    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
