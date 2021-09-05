package newcurd.newcurd.controller;

import newcurd.newcurd.model.Person;
import newcurd.newcurd.service.PersonService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/persons")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();

    }
    @RequestMapping(method = RequestMethod.POST,value = "/persons")
    public  void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/persons/{id}")
    public  void updatePerson(@PathVariable int id,@RequestBody Person person){
        personService.updatePerson(id , person);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/persons/{id}")
    public void deletePerson(@PathVariable int id){
        personService.deletePerson(id);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/persons/{id}")
    public Optional<Object> getPersonById(@PathVariable("id") int id){
       return personService.getPersonById(id);

    }
}
