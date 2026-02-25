package com.jp.person.controller;

import com.jp.person.model.Person;
import com.jp.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")   // Base URL added (Best Practice)
public class PersonController {

    @Autowired
    private PersonService service;

    // Home API
    @GetMapping("/")
    public String home() {
        return "Person CRUD API is running.";
    }

    // Save Person
    @PostMapping("/save")
    public Person save(@RequestBody Person person) {
        return service.savePerson(person);
    }

    // Get Person by ID
    @GetMapping("/get")
    public Person findById(@RequestParam int id) {
        return service.findById(id);
    }

    // Get All Persons
    @GetMapping("/all")
    public List<Person> findAll() {
        return service.findAllPerson();
    }

    // Update Person
    @PutMapping("/update")
    public Person update(@RequestBody Person person) {
        return service.updatePerson(person);
    }

    // Delete Person
    @DeleteMapping("/delete")
    public String delete(@RequestParam int id) {
        service.deletePerson(id);
        return "Deleted Successfully";
    }
}
