package com.testing.training.controller;

import com.testing.training.Service.PersonService;
import com.testing.training.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    //    let's get list of all entities
    @GetMapping("/person")
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    //    let's get specific entity according to id
    @GetMapping("/person/{personId}")
    public Person getPersonById(@PathVariable("personId") int personId) {
        return personService.getPersonById(personId);
    }

    //    deletes entity by id
    @DeleteMapping("/person/{personId}")
    public void deletePerson(@PathVariable("personId") int personId) {
        personService.deletePerson(personId);
    }

    //    saving entity in DB
    @PostMapping("/persons")
    public int savePerson(@RequestBody Person person) { //kodel metoda reikia sukti per int id, o ne per entity?
        personService.savePerson(person);
        return person.getId();
    }

    //    updating entity in DB
    @PutMapping("/persons")
    public Person update(@RequestBody Person person, int id) {
        personService.updatePerson(person, id);
        return person;
    }
}
