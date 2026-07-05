package lk.ijse.cmjd114_115.EcoCheck2026.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String userId;
    private String actionId;
}