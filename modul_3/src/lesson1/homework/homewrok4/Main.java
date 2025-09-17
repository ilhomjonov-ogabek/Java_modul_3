package lesson1.homework.homewrok4;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BankAccount account = new BankAccount(1000);
    System.out.print("Enter amount for withdraw:");
    int withdrawAmount = sc.nextInt();
    try {
      account.withdraw(withdrawAmount);
    } catch (InsufficientBalanceException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Code is processing");
  }

}
