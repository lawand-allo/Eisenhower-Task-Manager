package application.Person;

import Person.Person;
import Person.PersonRepository;

import java.util.List;
import java.util.UUID;

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

    public void updatePerson(Person person) {
        personRepository.updatePerson(person);
    }
}
