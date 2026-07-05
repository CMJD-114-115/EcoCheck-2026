package lk.ijse.cmjd114_115.EcoCheck2026.service.impl;

import com.thanu.home.intro.model.UserActionDTO;
import com.thanu.home.intro.service.UserActionService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserActionServiceIMPL implements UserActionService {
    @Override
    public void createUserAction(UserActionDTO userAction) {

    }

    @Override
    public UserActionDTO getSelectedUserAction(String userActionId) {
        return null;
    }

    @Override
    public List<UserActionDTO> getAllUserActions() {
        return List.of();
    }

    @Override
    public void updateUserAction(String userId, UserActionDTO userActionDTO) {

    }

    @Override
    public void deleteUserAction(String userActionId) {

    }
}
