package repositiories;

import Category.Category;
import Person.Person;
import Person.PersonRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class PersonRepositoryImplementation implements PersonRepository {
    private final List<Person> personList;

    public PersonRepositoryImplementation() {
        this.personList = new ArrayList<>();
    }

    @Override
    public List<Person> getAllPersons() {
        return personList;
    }

    @Override
    public Person getPersonByUuid(UUID uuid) {
        for (Person person: personList) {
            if (person.getUuid() == uuid) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {
        personList.remove(person);
    }

    @Override
    public void updatePerson(Person updatedPerson) {
        for (Iterator<Person> it = personList.iterator(); it.hasNext(); ) {
            Person person = it.next();
            if (person.getUuid() == updatedPerson.getUuid()) {
                it.remove();
            }
        }
        personList.add(updatedPerson);
    }

    @Override
    public void addPerson(Person person) {
        personList.add(person);
    }
}
