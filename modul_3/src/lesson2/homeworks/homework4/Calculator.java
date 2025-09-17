package lesson2.homeworks.homework4;

public class Calculator <T extends Number>{
  private  T num1;
  private  T num2;

  public Calculator() {
  }

  public void printNum(T num1,T num2){
    System.out.println(num1.doubleValue()+num2.doubleValue());
  }
}
