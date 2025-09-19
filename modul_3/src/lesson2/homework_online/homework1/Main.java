package lesson2.homework_online.homework1;

public class Main {

  public static void main(String[] args) {
    Cat Cat = new Cat("asd");
    AnimalHouse<Cat> cats = new AnimalHouse<>(Cat);
    cats.setGeneric(new Cat("asd"));
    System.out.println(cats.getGeneric().getName());
  }

}
