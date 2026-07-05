package lk.ijse.cmjd114_115.EcoCheck2026.util;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
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
    public UserDTO toUserDTO(UserEntity userEntity){
        return mapper.map(userEntity, UserDTO.class);
    }
    public UserEntity toUserEntity(UserDTO userDTO){
        return mapper.map(userDTO, UserEntity.class);
    }
    public List<UserDTO> toUserDTOList(List<UserEntity> userEntityList){
        return mapper.map(userEntityList,
                new TypeToken<List<UserDTO>>(){}.getType()
                );
    }
}
