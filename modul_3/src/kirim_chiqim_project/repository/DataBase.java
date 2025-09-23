package kirim_chiqim_project.repository;

import java.util.ArrayList;
import kirim_chiqim_project.dto.UserDTO;

public class DataBase {
  ArrayList<UserDTO> userList;

  public void saveUser(UserDTO userDTO) {
    userList.add(userDTO);

  }

}
