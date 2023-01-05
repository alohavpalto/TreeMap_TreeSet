import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Anna", "Chernova Sanior", 30));
    persons.add(new Person("Dori", "Rybkin's youngest daughter ", 10));
    persons.add(new Person("Dima", "Gulyaev", 25));
    persons.add(new Person("Tanya", "By her own", 40));
    persons.add(new Person("Kseha", "Through-Dash", 40));
    persons.add(new Person("Hino", "Head of-the family", 40));
    System.out.println(persons);
    Collections.sort(persons, new PersonComparator(2));
    System.out.println(persons);
  }
}