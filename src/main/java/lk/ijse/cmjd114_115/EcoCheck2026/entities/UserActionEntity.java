package lk.ijse.cmjd114_115.EcoCheck2026.entities;

import jakarta.persistence.*;
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
@Builder
@Table(name = "user-actions")
public class UserActionEntity implements Serializable {
    @Id
    private String userActionId;
    private int quantity;
    private double totalReduction;
    private LocalDate completedDate;
//    private String actionId;

    @ManyToOne
    @JoinColumn (name = "climate_action_id")
    private ClimateActionEntity climateAction;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private UserEntity user;
}