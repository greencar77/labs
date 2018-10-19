package labs.streams;

import labs.streams.domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repo {
    private List<Person> personList = Arrays.asList(new Person[] {
            new Person("Alfred", 20, 1000),
            new Person("Beatrice", 30, 2000),
            new Person("Chris", 45, 8800),
            new Person("Denise", 20, 3500),
    });

    public List<Person> getPersonList() {
        return personList;
    }
}
