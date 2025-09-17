package lesson2.homeworks.homework3;

public class Main {

  public static void main(String[] args) {
    Swapper <Integer> swapper = new Swapper<Integer>(12,42);
    System.out.println(swapper.getFirst());
    System.out.println(swapper.getSecond());
  }

}
