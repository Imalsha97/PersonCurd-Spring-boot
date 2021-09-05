package newcurd.newcurd.repository;

import newcurd.newcurd.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository  extends CrudRepository<Person, Integer> {
    Optional<Object> getPersonById(int id);
}
