package lesson2.homeworks.homework5;

public class Main {

  public static void main(String[] args) {
    GenericList<Integer,String> list = new GenericList<>();
    list.add(1,"hello");
    list.add(2,"hello2");
    list.add(10,"hello3");
    list.get(10);
  }

}
