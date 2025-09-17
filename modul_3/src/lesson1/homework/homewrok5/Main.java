package lesson1.homework.homewrok5;

public class Main {

  public static void main(String[] args) {
    String[] array = new String[5];
    array[0] = "hello";
    array[1] = "world";
    array[2] = null;
    array[3] = "world";
    array[4] = "hello";
    for (int i = 0; i < array.length; i++) {
      try {
        System.out.println(array[i].substring(0));
      } catch (NullPointerException e) {
        System.out.println(e);
      }
    }
  }

}
