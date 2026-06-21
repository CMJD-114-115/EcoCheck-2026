package lk.ijse.cmjd114_115.EcoCheck2026.service.impl;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import lk.ijse.cmjd114_115.EcoCheck2026.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceIMPL implements UserService {

    @Override
    public void saveUser(UserDTO user) {
        System.out.println("UserServiceIMPL saveUser is "+user);
    }

    @Override
    public UserDTO getSelectedUser(String userId) {
        return new UserDTO("U001","Kamal","Silva","kamal@mail.com","pw1111", Role.ADMIN);
    }

    @Override
    public List<UserDTO> getAllUsers() {
          List<UserDTO> userList = List.of(
                new UserDTO(
                        "U001",
                        "Kamal",
                        "Silva",
                        "kamal@mail.com",
                        "pw1111",
                        Role.ADMIN
                ),
                new UserDTO(
                        "U002",
                        "Nimal",
                        "Perera",
                        "nimal@mail.com",
                        "pw2222",
                        Role.USER
                ),
                new UserDTO(
                        "U003",
                        "Sahan",
                        "Silva",
                        "sahan@mail.com",
                        "pw1111",
                        Role.ADMIN
                ),
                new UserDTO(
                        "U004",
                        "Amali",
                        "Jayawardena",
                        "amali@mail.com",
                        "pw4444",
                        Role.ADMIN
                ));
          return userList;
    }

    @Override
    public void updateUser(String userId, UserDTO user) {
        System.out.println("Updated user id is " + userId +" and the user is: " + user.toString());
    }

    @Override
    public void deleteUser(String userId) {
        System.out.println("Deleted user id is " + userId);
    }
}
