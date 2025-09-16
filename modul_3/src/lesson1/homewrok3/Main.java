package lesson1.homewrok3;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,5};
    try{
      System.out.print("Enter index for array:");
      int n = sc.nextInt();
      System.out.println(arr[n-1]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
    System.out.println("Code is processing");
  }

}
