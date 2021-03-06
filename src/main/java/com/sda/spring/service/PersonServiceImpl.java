package com.sda.spring.service;

import com.sda.spring.person.Person;
import com.sda.spring.repository.PersonDao;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    private PersonDao personDao;

    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }
    @Override
    public List<Person> getAll() {
        return personDao.getAll();
    }

    @Override
    public Person getById(int personId) {

        return personDao.getById(personId);
    }

    @Override
    public List<Person> getByFirstName(String firstName) {
        if(firstName == null || "".equals(firstName)) {
            return new ArrayList<>();
        }
        return personDao.getByFirstName(firstName);
    }

    @Override
    public List<Person> getByLastName(String lastName) {
        return personDao.getByLastName(lastName);
    }

    @Override
    public List<Person> getByBirthDateBetween(LocalDate from, LocalDate to) {
        return personDao.getByBirthDateBetween(from,to);
    }

    @Override
    public List<Person> getBySalaryBetween(double from, double to) {
        return personDao.getBySalaryBetween(from,to);
    }

    @Override
    public Person add(Person person) {
        return personDao.add(person);
    }

    @Override
    public Person modify(int personId, Person person) {
        return personDao.modify(personId,person);
    }

    @Override
    public Person remove(int personId) {
        return personDao.remove(personId);
    }
}
