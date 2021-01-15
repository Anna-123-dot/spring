package com.sda.spring;

import com.sda.spring.repository.PersonDao;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class ProgStart implements CommandLineRunner {

    Logger logger;
    MessageSource messageSource;
    PersonDao personDao;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(personDao.getByFirstName("chlo"));
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Autowired
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }
}
