import Person.Person;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {


    @Test
    void createPerson() {
        String personName = "max";
        String personSurname = "mustermann";

        Person toBeTestedPerson = new Person(personName,personSurname);

        assertNotNull(toBeTestedPerson);
        assertEquals(toBeTestedPerson.getName(),personName);
        assertEquals(toBeTestedPerson.getSurname(),personSurname);

        assertEquals(toBeTestedPerson.toString(),personName+" "+personSurname);

        String otherPersonName = "Anna";
        String otherPersonSurname = "Musterfrau";
        toBeTestedPerson.setName(otherPersonName);
        toBeTestedPerson.setSurname(otherPersonSurname);
        assertEquals(toBeTestedPerson.getName(),otherPersonName);
        assertEquals(toBeTestedPerson.getSurname(),otherPersonSurname);
    }

    @Test
    void comparePersons() {
        String personName = "max";
        String personSurname = "mustermann";

        Person toBeTestedPerson = new Person(personName,personSurname);
        Person toBeTestedPerson2 = new Person(personName,personSurname);

        assertNotEquals(toBeTestedPerson,toBeTestedPerson2);
        assertNotEquals(toBeTestedPerson.hashCode(),toBeTestedPerson2.hashCode());

        assertNotEquals(toBeTestedPerson.getUuid(), toBeTestedPerson2.getUuid());

    }


}
