package lk.ijse.cmjd114_115.EcoCheck2026.service.impl;


import jakarta.transaction.Transactional;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.ClimateActionDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.UserActionDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.UserDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.ClimateActionEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserActionEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.exceptions.DataNotFoundException;
import lk.ijse.cmjd114_115.EcoCheck2026.service.UserActionService;
import lk.ijse.cmjd114_115.EcoCheck2026.util.Conversion;
import lk.ijse.cmjd114_115.EcoCheck2026.util.IDGenerate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class UserActionServiceIMPL implements UserActionService {
    private final UserActionDao userActionDao;
    private final UserDao userDao;
    private final ClimateActionDao climateActionDao;
    private final Conversion conversion;



    @Override
    public void createUserAction(UserActionDTO userAction) {
        userDao.findById(userAction.getUserId())
                        .orElseThrow(()-> new DataNotFoundException("User Not Found"));
        climateActionDao.findById(userAction.getActionId())
                        .orElseThrow(()-> new DataNotFoundException("Climate Action Not Found"));
        userAction.setUserActionId(IDGenerate.userActionId());
        userActionDao.save(conversion.toUserActionEntity(userAction));
    }

    @Override
    public UserActionDTO getSelectedUserAction(String userActionId) {
        UserActionEntity foundUserAction =
                userActionDao.findById(userActionId).orElseThrow(() -> new DataNotFoundException("User Not Found"));

        return conversion.toUserActionDTO(foundUserAction);
    }

    @Override
    public List<UserActionDTO> getAllUserActions() {
        return conversion.toUserActionDTOList(userActionDao.findAll());
    }

    @Override
    public void updateUserAction(String userActionId, UserActionDTO userActionDTO) {
        UserEntity foundUserEntity = userDao.findById(userActionDTO.getUserId())
                .orElseThrow(() -> new DataNotFoundException("User Not Found"));
        ClimateActionEntity foundClimateActionEntity = climateActionDao.findById(userActionDTO.getActionId())
                .orElseThrow(() -> new DataNotFoundException("Climate Action Not Found"));
        UserActionEntity foundUserActionEntity = userActionDao.findById(userActionId)
                .orElseThrow(() -> new DataNotFoundException("User Action Not Found"));

        foundUserActionEntity.setClimateAction(foundClimateActionEntity);
        foundUserActionEntity.setUser(foundUserEntity);
        foundUserActionEntity.setQuantity(userActionDTO.getQuantity());
        foundUserActionEntity.setTotalReduction(userActionDTO.getTotalReduction());

    }
    @Override
    public void deleteUserAction(String userActionId) {
     userActionDao.findById(userActionId)
                .orElseThrow(() -> new DataNotFoundException("User Action Not Found"));
       userActionDao.deleteById(userActionId);
    }
}
