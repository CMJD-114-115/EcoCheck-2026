package lk.ijse.cmjd114_115.EcoCheck2026.util;

import com.thanu.home.intro.entities.ActionCategoryEntity;
import com.thanu.home.intro.model.ActionCategoryDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Mapping {
     private final ModelMapper modelMapper;
    //ActionCategory

    public ActionCategoryDTO actionCategoryDTO(ActionCategoryEntity actionCategoryEntity) {
        return modelMapper.map(actionCategoryEntity, ActionCategoryDTO.class);
    }
    public ActionCategoryEntity actionCategoryEntity(ActionCategoryDTO actionCategoryDTO) {
        return modelMapper.map(actionCategoryDTO, ActionCategoryEntity.class);
    }
}
