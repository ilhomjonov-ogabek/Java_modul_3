package lesson1.homework.homewrok1;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
      System.out.print("Enter number:");
      int a = sc.nextInt();
      System.out.print("Enter number:");
      int b = sc.nextInt();
      int num = a/b;
      System.out.println(num);
    }catch(ArithmeticException e){
      System.out.println(e);
    }
    System.out.println("Code is processing");
  }

}
