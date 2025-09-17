package lesson2.homeworks.homework1;

public class Main {

  public static void main(String[] args) {
    MultiPrinter <String> multiPrinter = new MultiPrinter<>();
    multiPrinter.print("Hello");
    multiPrinter.print("Olimjon");
    multiPrinter.print("Diyor");
    System.out.println(multiPrinter.getPrintedCount());

    MultiPrinter <Integer> multiPrinter2 = new MultiPrinter<>();
    multiPrinter2.print(10);
    System.out.println(multiPrinter2.getPrintedCount());


  }

}
