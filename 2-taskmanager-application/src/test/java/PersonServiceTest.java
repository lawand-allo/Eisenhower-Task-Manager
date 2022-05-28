import Person.Person;
import Person.PersonRepository;
import application.Person.PersonService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class PersonServiceTest {

    @Test
    void creatService() {
        PersonRepository mockPersonRepository = mock(PersonRepository.class);
        PersonService personService = new PersonService(mockPersonRepository);
        personService.addPerson(mock(Person.class));
    }
}
