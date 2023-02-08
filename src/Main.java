import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Anna", "Chernova", 50));
    persons.add(new Person("Dima", "Gulyaev", 40));
    persons.add(new Person("Tanya", "By-her", 20));
    persons.add(new Person("Kseha", "Through Dash", 30));
    System.out.println(persons);

    Comparator<Person> comparator = (p1, p2) -> {
      if (p1.getWordsSurname() < 3 || p2.getWordsSurname() < 3) {
        if (p1.getWordsSurname() < p2.getWordsSurname()) {
          return 1;
        } else if (p1.getWordsSurname() > p2.getWordsSurname()) {
          return -1;
        }
      }
      return Integer.compare(p2.getAge(), p1.getAge());
    };
    Collections.sort(persons, comparator);
    System.out.println(persons);
  }
}