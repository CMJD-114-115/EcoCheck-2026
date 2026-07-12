package lk.ijse.cmjd114_115.EcoCheck2026.util;

import lk.ijse.cmjd114_115.EcoCheck2026.dao.ActionCategoryDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.ActionCategoryDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.ClimateActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.ActionCategoryEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.ClimateActionEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserActionEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Conversion {
    private final ModelMapper mapper;

    //    User-Conversion
    public UserDTO toUserDTO(UserEntity userEntity) {
        return mapper.map(userEntity, UserDTO.class);
    }

    public UserEntity toUserEntity(UserDTO userDTO) {
        return mapper.map(userDTO, UserEntity.class);
    }

    public List<UserDTO> toUserDTOList(List<UserEntity> userEntityList) {
        return mapper.map(userEntityList,
                new TypeToken<List<UserDTO>>() {
                }.getType()
        );
    }

    //    User-Action-Conversion

    public UserActionDTO toUserActionDTO(UserActionEntity userActionEntity) {
        return mapper.map(userActionEntity, UserActionDTO.class);
    }

    public UserActionEntity toUserActionEntity(UserActionDTO userActionDTO) {
        return mapper.map(userActionDTO, UserActionEntity.class);
    }

    public List<UserActionDTO> toUserActionDTOList(List<UserActionEntity> userActionEntities) {
        return mapper.map(userActionEntities,
                new TypeToken<List<UserActionDTO>>() {
                }.getType()
        );

    }
    //    Climate-Action-Conversion

    public ClimateActionDTO toClimateActionDTO(ClimateActionEntity climateActionEntity) {
        return mapper.map(climateActionEntity, ClimateActionDTO.class);
    }

    public ClimateActionEntity toClimateActionEntity(ClimateActionDTO climateActionDTO) {
        return mapper.map(climateActionDTO, ClimateActionEntity.class);
    }

    public List<ClimateActionDTO> toClimateActionDTOList(List<ClimateActionEntity> climateActionEntities) {
        return mapper.map(climateActionEntities,
                new TypeToken<List<ClimateActionDTO>>() {
                }.getType()
        );
    }
    //    Action Category-Conversion

    public ActionCategoryDTO toActionCategoryDTO(ActionCategoryEntity actionCategoryEntity) {
        return mapper.map(actionCategoryEntity, ActionCategoryDTO.class);

    }

    public ActionCategoryEntity toActionCategoryEntity(ActionCategoryDTO actionCategoryDTO) {
        return mapper.map(actionCategoryDTO, ActionCategoryEntity.class);
    }

    public List<ActionCategoryDTO> actionCategoryDTOList(List<ActionCategoryEntity> actionCategoryEntities) {
        return mapper.map(actionCategoryEntities,
                new TypeToken<List<ActionCategoryDTO>>() {
                }.getType()
        );
    }
}
