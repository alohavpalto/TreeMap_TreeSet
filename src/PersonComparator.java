import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonComparator implements Comparator<Person> {

  private int maxCountWords;

  public PersonComparator(int maxCountWords) {
    this.maxCountWords = maxCountWords;
  }

  @Override
  public int compare(Person p1, Person p2) {
    List<String> surname1 = new ArrayList<>();
    surname1.addAll(List.of(p1.getSurname().split("\\P{IsAlphabetic}+")));
    List<String> surname2 = new ArrayList<>();
    surname2.addAll(List.of(p2.getSurname().split("\\P{IsAlphabetic}+")));

    if (p1.getWordsSurname() < maxCountWords || p2.getWordsSurname() < maxCountWords) {
      if (p1.getWordsSurname() < p2.getWordsSurname()) {
        return 1;
      } else if (p1.getWordsSurname() > p2.getWordsSurname()) {
        return -1;
      }
    }
    return Integer.compare(p2.getAge(), p1.getAge());
  }
}