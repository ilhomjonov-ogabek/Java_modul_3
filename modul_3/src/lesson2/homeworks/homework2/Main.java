package lesson2.homeworks.homework2;

public class Main {

  public static void main(String[] args) {
    TripleBox<String,Integer,Double> tripleBox = new TripleBox<>("Hello",12,12.5);
    tripleBox.printAll();
  }

}
