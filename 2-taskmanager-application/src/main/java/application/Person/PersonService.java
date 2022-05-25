package application.Person;

import Person.Person;
import Person.PersonRepository;

import java.util.List;

public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.getAllPersons();
    }
}
