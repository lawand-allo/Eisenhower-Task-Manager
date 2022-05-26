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

    public void addPerson(Person person) {
        personRepository.addPerson(person);
    }

    public void deletePerson(Person person) {
        personRepository.removePerson(person);
    }
}
