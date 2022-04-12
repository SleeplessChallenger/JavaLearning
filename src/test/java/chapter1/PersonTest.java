package chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person daniil = new Person();
        assertEquals("Hello World", daniil.helloWorld());
    }

    @Test
    public void shouldReturnHelloDaniil() {
        Person person = new Person();
        assertEquals("Hello Daniil", person.hello("Daniil"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person myPerson = new Person();

        assertEquals(5, Person.numberOfPersons());
    }

    @Test
    public void demonstrateBoolean() {
        int i = 4;
        int j = 3;

        Person person = new Person();
        assertTrue(person.isBigger(i, j));
    }
}
