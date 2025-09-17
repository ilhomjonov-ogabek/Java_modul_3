package lesson2.homeworks.homework2;

public class TripleBox <T1, T2, T3> {
  private T1 first;
  private T2 second;
  private T3 third;

  public TripleBox(T1 obj1, T2 obj2, T3 obj3) {
    this.first = obj1;
    this.second = obj2;
    this.third = obj3;
  }

  public void printAll(){
    System.out.println(this.first);
    System.out.println(this.second);
    System.out.println(this.third);
  }
}
