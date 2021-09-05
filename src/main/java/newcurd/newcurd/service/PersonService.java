package newcurd.newcurd.service;

import newcurd.newcurd.model.Person;
import newcurd.newcurd.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    //create get all perso class

    @Autowired
    public PersonRepository personRepository;

    public List<Person> getAllPersons(){
    List<Person> persons = new ArrayList<>();
    personRepository.findAll().forEach(persons::add);
    return persons;
    }


    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public void updatePerson(int id, Person person) {
        personRepository.save(person);
    }

    public void deletePerson(int id) {
        personRepository.deleteById(id);
    }

    public Optional<Object> getPersonById(int id) {
        return personRepository.getPersonById(id);
    }
}
