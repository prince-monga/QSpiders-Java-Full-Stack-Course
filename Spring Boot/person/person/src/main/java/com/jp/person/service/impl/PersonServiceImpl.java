package com.jp.person.service.impl;

import com.jp.person.model.Person;
import com.jp.person.repository.PersonRepository;
import com.jp.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repository;

    @Override
    public Person savePerson(Person person) {
        return repository.save(person);
    }

    @Override
    public Person findById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found"));
    }

    @Override
    public List<Person> findAllPerson() {
        return repository.findAll();
    }

    @Override
    public Person updatePerson(Person person) {

        Person existingPerson = repository.findById(person.getId())
                .orElseThrow(() -> new RuntimeException("Person not found"));

        // Update fields manually
        existingPerson.setName(person.getName());

        existingPerson.setEmail(person.getEmail());

        return repository.save(existingPerson);
    }

    @Override
    public void deletePerson(int id) {

        Person person = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found"));

        repository.delete(person);
    }
}