package lesson1.homework.homewrok4;

public class BankAccount {
  private Integer amount;

  public BankAccount(Integer amount) {
    this.amount = amount;
  }

  public void withdraw(double withdrawAmount)throws InsufficientBalanceException {
    if (this.amount >= withdrawAmount) {
      this.amount -= (int) withdrawAmount;
    }else{
      throw new InsufficientBalanceException("Don't have enough balance in your account.");
    }
  }
}
