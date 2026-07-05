package lk.ijse.cmjd114_115.EcoCheck2026.service;


import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO user);
    UserDTO getSelectedUser(String userId) throws ChangeSetPersister.NotFoundException;
    List<UserDTO> getAllUsers();
    void updateUser(String userId,UserDTO user);
    void deleteUser(String userId);
}
