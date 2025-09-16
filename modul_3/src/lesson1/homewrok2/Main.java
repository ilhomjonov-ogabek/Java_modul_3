package lesson1.homewrok2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
      System.out.print("Enter string number to parse:");
      String s = sc.nextLine();
      int num = Integer.parseInt(s);
      System.out.println(num);
    }catch(NumberFormatException e){
      System.out.println(e.getMessage());
    }

    System.out.println("Code processing");
  }

}
