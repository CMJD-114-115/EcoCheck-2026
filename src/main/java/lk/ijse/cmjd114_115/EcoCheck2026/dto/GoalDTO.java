package lk.ijse.cmjd114_115.EcoCheck2026.dto;


import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.GoalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoalDTO implements Serializable {
    private String id;
    private String title;
    private double targetReduction;
    private LocalDate targetDate;
    private GoalStatus status;
    private String userId;
}