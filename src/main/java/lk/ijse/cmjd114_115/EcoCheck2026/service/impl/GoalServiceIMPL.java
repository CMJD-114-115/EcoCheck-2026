package lk.ijse.cmjd114_115.EcoCheck2026.service.impl;


import lk.ijse.cmjd114_115.EcoCheck2026.dto.GoalDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.service.GoalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalServiceIMPL implements GoalService {
    @Override
    public void createGoal(GoalDTO goal) {

    }

    @Override
    public GoalDTO getSelectedGoal(String goalId) {
        return null;
    }

    @Override
    public List<GoalDTO> getGoals() {
        return List.of();
    }

    @Override
    public void updateGoal(String goalId, GoalDTO goal) {

    }

    @Override
    public void deleteGoal(String goalId) {

    }
}
