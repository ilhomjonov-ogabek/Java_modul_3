package kirim_chiqim_project.entity;

public class UserEntity extends Parent{

  private String fullName;
  private String userName;
  private String password;

  public UserEntity(String id, String fullName, String userName, String password) {
    super(id);
    this.fullName = fullName;
    this.userName = userName;
    this.password = password;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


}
