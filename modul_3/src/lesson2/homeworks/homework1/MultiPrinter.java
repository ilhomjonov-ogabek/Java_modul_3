package lesson2.homeworks.homework1;

public class MultiPrinter<T> {

  private int counter = 0;

  public void print(T obj) {
    counter++;
    System.out.println(obj);
  }


  public int getPrintedCount() {
    return counter;
  }
}
