package lesson2.homework_online.homework1;

public class AnimalHouse <T extends Animal> {

  private T generic;
  public AnimalHouse(T generic) {
    this.generic = generic;
  }

  public T getGeneric() {
    return (T) generic;
  }

  public void setGeneric(T generic) {
    this.generic = generic;
  }
}
