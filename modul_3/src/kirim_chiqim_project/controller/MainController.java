package kirim_chiqim_project.controller;

import kirim_chiqim_project.dto.UserDTO;
import kirim_chiqim_project.service.MainService;
import kirim_chiqim_project.utils.Util;

public class MainController {
  private MainService service = new MainService();

    public void start(){
     while(true){
       System.out.println("""
          1.Sign in
          2.Sign up
          0.Exit""");

       String menu = Util.getStr("Choose one");

       switch(menu){
         case "1"->{ signIn(); }
         case "2"->{ signUp(); }
         case "0"->{return;}
       }
     }
    }

  private void signUp() {
      String fullName = Util.getStr("Enter full name");
      String userName = Util.getStr("Enter username");
      String password1 = Util.getStr("Enter new password");
      String password2 = Util.getStr("Confirm your password");
      UserDTO userDTO = new UserDTO(fullName, userName, password1);
      UserDTO res = service.registration(userDTO);


  }

  private void signIn() {


  }

}
