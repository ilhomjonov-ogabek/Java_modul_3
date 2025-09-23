package kirim_chiqim_project.entity;

import kirim_chiqim_project.enums.TypeEnam;

public class IncomeAndExpenseEntity extends Parent{

  private String userId;
  private double amount;
  private String date;
  private String description;
  private TypeEnam type;

  public IncomeAndExpenseEntity(String id, String userId, double amount, String date,
      String description, TypeEnam type) {
    super(id);
    this.userId = userId;
    this.amount = amount;
    this.date = date;
    this.description = description;
    this.type = type;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TypeEnam getType() {
    return type;
  }

  public void setType(TypeEnam type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "IncomeAndExpenseEntity{" +
        "amount=" + amount +
        ", date='" + date + '\'' +
        ", description='" + description + '\'' +
        '}';
  }
}
