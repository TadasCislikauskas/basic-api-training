package Service;


import Repository.PersonRepository;
import entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> getAllPeople() {
        List<Person> people = new ArrayList<>();
//        personRepository.findAll().forEach(person -> people.add(person));
//        personRepository.findAll().forEach(people::add);
        people.addAll(personRepository.findAll());
        return people;
    }

public Person getPersonById(int id){
//        return personRepository.getById(id);
    return personRepository.findById(id).get(); //need to add logic for not existing id
}
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    public void deletePerson(int id){
        personRepository.deleteById(id);
    }

    public void updatePerson(Person person, int id){
        personRepository.save(person);
    }

}
