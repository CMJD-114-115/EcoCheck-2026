package lk.ijse.cmjd114_115.EcoCheck2026.service;



import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserActionDTO;

import java.util.List;

public interface UserActionService {
    void createUserAction(UserActionDTO userAction);
    UserActionDTO getSelectedUserAction(String userActionId);
    List<UserActionDTO> getAllUserActions();
    void updateUserAction(String userId, UserActionDTO userActionDTO);
    void deleteUserAction(String userActionId);
}
