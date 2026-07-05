package lk.ijse.cmjd114_115.EcoCheck2026.service.impl;


import lk.ijse.cmjd114_115.EcoCheck2026.util.IDGenerate;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.ClimateActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.service.ClimateActionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClimateActionServiceIMPL implements ClimateActionService {

    @Override
    public void createClimateAction(ClimateActionDTO climateActionDTO) {
        climateActionDTO.setClimateActionId(IDGenerate.climateActionId());
        System.out.println(climateActionDTO);
    }

    @Override
    public ClimateActionDTO getSelectedClimateAction(String climateActionId) {
        return null;
    }

    @Override
    public List<ClimateActionDTO> getClimateActions() {
        return List.of();
    }

    @Override
    public void updateClimateActions(String climateActionId, ClimateActionDTO climateActionDTO) {

    }

    @Override
    public void deleteClimateActions(String climateActionId) {

    }
}
