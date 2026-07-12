package lk.ijse.cmjd114_115.EcoCheck2026.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.ActionCategoryDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.ActionCategoryDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.ActionCategoryEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.exceptions.DataNotFoundException;
import lk.ijse.cmjd114_115.EcoCheck2026.service.ActionCategoryService;
import lk.ijse.cmjd114_115.EcoCheck2026.util.Conversion;
import lk.ijse.cmjd114_115.EcoCheck2026.util.IDGenerate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ActionCategoryIMPL implements ActionCategoryService {
    private final ActionCategoryDao  actionCategoryDao;
    private final Conversion conversion;

    @Override
    public void saveActionCategory(ActionCategoryDTO actionCategory) {
        actionCategory.setCategoryId(IDGenerate.actionCategoryId());
        actionCategoryDao.save(conversion.toActionCategoryEntity(actionCategory));
    }

    @Override
    public ActionCategoryDTO getSelectedActionCategory(String actionCategoryId) {
        ActionCategoryEntity foundActionCategory= actionCategoryDao.findById(actionCategoryId)
                .orElseThrow(() -> new DataNotFoundException("Action Category Not Found"));
        return conversion.toActionCategoryDTO(foundActionCategory);

    }

    @Override
    public List<ActionCategoryDTO> getAllActionCategories() {
      return conversion.actionCategoryDTOList(actionCategoryDao.findAll());
    }

    @Override
    public void updateActionCategory(String actionCategoryId, ActionCategoryDTO actionCategory) {
        ActionCategoryEntity foundActionCategory= actionCategoryDao.findById(actionCategoryId)
                .orElseThrow(() -> new DataNotFoundException("Action Category Not Found"));

        foundActionCategory.setName(actionCategory.getName());
        foundActionCategory.setDescription(actionCategory.getDescription());

    }

    @Override
    public void deleteActionCategory(String actionCategoryId) {
         actionCategoryDao.findById(actionCategoryId)
                .orElseThrow(() -> new DataNotFoundException("Action Category Not Found"));
         actionCategoryDao.deleteById(actionCategoryId);
    }
}
