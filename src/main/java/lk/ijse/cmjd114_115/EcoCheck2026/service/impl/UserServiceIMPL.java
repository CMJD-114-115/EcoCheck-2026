package lk.ijse.cmjd114_115.EcoCheck2026.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.UserDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.service.UserService;
import lk.ijse.cmjd114_115.EcoCheck2026.util.Conversion;
import lk.ijse.cmjd114_115.EcoCheck2026.util.IDGenerate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceIMPL implements UserService {
    private final UserDao userDao;
    private final Conversion conversion;

    @Override
    public void saveUser(UserDTO user) {
//        -----Generate User Id
        user.setUserId(IDGenerate.userId());
//        -----Save the data
//        UserEntity userEntity = conversion.toUserEntity(user);
//        userDao.save(userEntity);
          userDao.save(conversion.toUserEntity(user));
    }
    @Override
    public UserDTO getSelectedUser(String userId) {
        UserEntity userEntity = userDao.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found!"));
        return conversion.toUserDTO(userEntity);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return conversion.toUserDTOList(userDao.findAll());
    }

    @Override
    public void updateUser(String userId, UserDTO user) {
        UserEntity foundUser = userDao.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found!"));
        foundUser.setFirstName(user.getFirstName());
        foundUser.setLastName(user.getLastName());
        foundUser.setEmail(user.getEmail());
        foundUser.setPassword(user.getPassword());
        foundUser.setRole(user.getRole());
    }

    @Override
    public void deleteUser(String userId) {
        System.out.println("Deleted user id is " + userId);
    }
}
