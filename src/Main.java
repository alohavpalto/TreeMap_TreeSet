import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {

  public static void main(String[] args) {

    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Anna", "Chernova", 50));
    persons.add(new Person("Olga", "Worky", 15));
    persons.add(new Person("Dima", "Gulyaev", 40));
    persons.add(new Person("Tanya", "By-her", 20));
    persons.add(new Person("Kseha", "Through Dash", 30));
    persons.add(new Person("Vadimr", "Dangerv Oly", 13));

    System.out.println(persons);
    Collections.sort(persons, new PersonComparator(2));
    System.out.println(persons);

    Predicate<Person> predicate = person -> person.getAge() < 18;
    persons.removeIf(predicate);
    System.out.println(persons);
  }
}