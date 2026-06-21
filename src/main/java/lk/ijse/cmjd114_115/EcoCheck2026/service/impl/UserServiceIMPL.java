package lk.ijse.cmjd114_115.EcoCheck2026.service.impl;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.service.UserService;

import java.util.List;

public class UserServiceIMPL implements UserService {

    @Override
    public void saveUser(UserDTO user) {
        System.out.println("UserServiceIMPL saveUser is "+user);
    }

    @Override
    public UserDTO getSelectedUser(String userId) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return List.of();
    }

    @Override
    public void updateUser(String userId, UserDTO user) {

    }

    @Override
    public void deleteUser(String userId) {

    }
}
