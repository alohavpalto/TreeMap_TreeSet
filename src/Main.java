import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Anna", "Chernova", 50));
    persons.add(new Person("Dima", "Gulyaev",40 ));
    persons.add(new Person("Tanya", "By-her", 20));
    persons.add(new Person("Kseha", "Through Dash",30 ));

    System.out.println(persons);
    Collections.sort(persons, new PersonComparator(2));
    System.out.println(persons);
  }
}