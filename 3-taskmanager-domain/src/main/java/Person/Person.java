package Person;

import java.util.Objects;
import java.util.UUID;

public class Person {

    private String name;
    private String surname;
    private final UUID uuid;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        uuid = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(uuid, person.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, uuid);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
