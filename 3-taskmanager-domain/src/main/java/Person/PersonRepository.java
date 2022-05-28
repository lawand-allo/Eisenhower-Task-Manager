package Person;


import java.util.List;
import java.util.UUID;

public interface PersonRepository {

    List<Person> getAllPersons();


    void addPerson(Person person);

    void removePerson(Person person);

    void updatePerson(Person person);
}
