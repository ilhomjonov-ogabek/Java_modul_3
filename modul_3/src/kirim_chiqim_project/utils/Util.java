package kirim_chiqim_project.utils;

import java.util.Scanner;

public class Util {
  public static Scanner scInt = new Scanner(System.in);
  public static Scanner scStr = new Scanner(System.in);
  public static Scanner scD = new Scanner(System.in);

  public static int getInt(String text){
    System.out.printf("%s: ", text);

    return scInt.nextInt();
  }

 public static double getD(String text){
    System.out.println("%s"+text);

    return scD.nextDouble();
  }

 public static String getStr(String text){
    System.out.println("%s"+text);

    return scStr.nextLine();
  }

}
