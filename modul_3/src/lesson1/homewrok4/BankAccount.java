package lesson1.homewrok4;

public class BankAccount {
  private Integer amount;

  public BankAccount(Integer amount) {
    this.amount = amount;
  }

  public void withdraw(Integer withdrawAmount) {
    if (this.amount >= withdrawAmount) {
      this.amount -= withdrawAmount;
    }else{
      throw new InsufficientBalanceException("Don't have enough balance in your account.");
    }
  }
}
