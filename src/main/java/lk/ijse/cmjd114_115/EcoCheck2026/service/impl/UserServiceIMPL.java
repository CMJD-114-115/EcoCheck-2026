package lk.ijse.cmjd114_115.EcoCheck2026.service.impl;

import lk.ijse.cmjd114_115.EcoCheck2026.dao.UserDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.service.UserService;
import lk.ijse.cmjd114_115.EcoCheck2026.util.Conversion;
import lk.ijse.cmjd114_115.EcoCheck2026.util.IDGenerate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceIMPL implements UserService {
    private final UserDao userDao;
    private final Conversion conversion;

    @Override
    public void saveUser(UserDTO user) {
//        -----Generate User Id
        user.setUseId(IDGenerate.userId());
//        -----Save the data
//        UserEntity userEntity = conversion.toUserEntity(user);
//        userDao.save(userEntity);
          userDao.save(conversion.toUserEntity(user));
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
