package lesson2.homeworks.homework3;

public class Swapper <T>{
private T first;
private T second;

public Swapper(T first,T second){
  T temp = first;
  this.first=second;
  this.second=temp;
}

  public T getFirst() {
    return first;
  }


  public T getSecond() {
    return second;
  }

}
