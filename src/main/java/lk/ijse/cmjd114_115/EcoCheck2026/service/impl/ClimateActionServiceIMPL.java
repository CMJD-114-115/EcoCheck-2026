package lk.ijse.cmjd114_115.EcoCheck2026.service.impl;


import jakarta.transaction.Transactional;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.ActionCategoryDao;
import lk.ijse.cmjd114_115.EcoCheck2026.dao.ClimateActionDao;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.ActionCategoryEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.ClimateActionEntity;
import lk.ijse.cmjd114_115.EcoCheck2026.exceptions.DataNotFoundException;
import lk.ijse.cmjd114_115.EcoCheck2026.util.Conversion;
import lk.ijse.cmjd114_115.EcoCheck2026.util.IDGenerate;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.ClimateActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.service.ClimateActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ClimateActionServiceIMPL implements ClimateActionService {

    private final ClimateActionDao climateActionDao;
    private final ActionCategoryDao actionCategoryDao;
    private final Conversion conversion;

    @Override
    public void createClimateAction(ClimateActionDTO climateActionDTO) {
        actionCategoryDao.findById(climateActionDTO.getActionCategoryId())
                .orElseThrow(() -> new DataNotFoundException("ActionCategory not found"));
        climateActionDTO.setClimateActionId(IDGenerate.climateActionId());
        climateActionDao.save(conversion.toClimateActionEntity(climateActionDTO));

    }

    @Override
    public ClimateActionDTO getSelectedClimateAction(String climateActionId) {
        ClimateActionEntity foundClimateAction = climateActionDao.findById(climateActionId)
                .orElseThrow(() -> new DataNotFoundException("Climate Action Not Found"));

        return conversion.toClimateActionDTO(foundClimateAction);
    }

    @Override
    public List<ClimateActionDTO> getClimateActions() {
       return conversion.toClimateActionDTOList(climateActionDao.findAll());
    }

    @Override
    public void updateClimateActions(String climateActionId, ClimateActionDTO climateActionDTO) {
        ActionCategoryEntity foundActionCategory = actionCategoryDao.findById(climateActionDTO.getActionCategoryId())
                .orElseThrow(() -> new DataNotFoundException("ActionCategory not found"));

        ClimateActionEntity foundClimateAction = climateActionDao.findById(climateActionId)
                .orElseThrow(() -> new DataNotFoundException("Climate Action Not Found"));

        foundClimateAction.setActionCategory(foundActionCategory);
        foundClimateAction.setTitle(climateActionDTO.getTitle());
        foundClimateAction.setDescription(climateActionDTO.getDescription());
        foundClimateAction.setPoints(climateActionDTO.getPoints());
        foundClimateAction.setEstimatedCO2Reduction(climateActionDTO.getEstimatedCO2Reduction());

    }

    @Override
    public void deleteClimateActions(String climateActionId) {
        climateActionDao.findById(climateActionId)
                .orElseThrow(() -> new DataNotFoundException("Climate Action Not Found"));
        climateActionDao.deleteById(climateActionId);
    }
}
