package lk.ijse.cmjd114_115.EcoCheck2026.entities;


import jakarta.persistence.*;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.GoalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "goals")
@Builder
public class GoalEntity implements Serializable {
    @Id
    private String id;
    private String title;
    private double targetReduction;
    private LocalDate targetDate;
    @Enumerated(EnumType.STRING)
    private GoalStatus status;
    private String userId;
}