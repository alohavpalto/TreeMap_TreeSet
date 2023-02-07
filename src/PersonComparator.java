import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

  private int maxCountWords;

  public PersonComparator(int maxCountWords) {
    this.maxCountWords = maxCountWords;
  }

  @Override
  public int compare(Person p1, Person p2) {
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


