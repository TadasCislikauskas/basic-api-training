package controller;

import Service.PersonService;
import entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    //    let's get list of all entities
    @GetMapping("/person")
    private List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    //    let's get specific entity according to id
    @GetMapping("/person/{personId}")
    private Person getPersonById(@PathVariable("personId") int personId) {
        return personService.getPersonById(personId);
    }

    //    deletes entity by id
    @DeleteMapping("/person/{personId}")
    private void deletePerson(@PathVariable("personId") int personId) {
        personService.deletePerson(personId);
    }

    //    saving entity in DB
    @PostMapping("/persons")
    private int savePerson(@RequestBody Person person) { //kodel metoda reikia sukti per int id, o ne per entity?
        personService.savePerson(person);
        return person.getId();
    }

    //    updating entity in DB
    @PutMapping("/persons")
    private Person update(@RequestBody Person person, int id) {
        personService.updatePerson(person, id);
        return person;
    }
}
