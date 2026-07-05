package lk.ijse.cmjd114_115.EcoCheck2026.service;



import lk.ijse.cmjd114_115.EcoCheck2026.dto.GoalDTO;

import java.util.List;

public interface GoalService {
    void createGoal(GoalDTO goal);
    GoalDTO getSelectedGoal(String goalId);
    List<GoalDTO> getGoals();
    void updateGoal(String goalId,GoalDTO goal);
    void deleteGoal(String goalId);
}
