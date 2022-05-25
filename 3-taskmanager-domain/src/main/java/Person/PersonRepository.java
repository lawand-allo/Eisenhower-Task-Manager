package Person;


import java.util.List;
import java.util.UUID;

public interface PersonRepository {

    List<Person> getAllPersons();

    Person getPersonByUuid(UUID uuid);

    void addPerson(Person person);

    void removePerson(Person person);
}
