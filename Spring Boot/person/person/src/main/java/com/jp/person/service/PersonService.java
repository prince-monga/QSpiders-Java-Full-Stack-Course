package com.jp.person.service;

import com.jp.person.model.Person;

import java.util.List;

public interface PersonService {

    Person savePerson(Person person);

    Person findById(int id);

    List<Person> findAllPerson();

    Person updatePerson(Person person);

    void deletePerson(int id);
}