package lk.ijse.cmjd114_115.EcoCheck2026.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserActionEntity implements Serializable {

    private String userActionId;
    private int quantity;
    private double totalReduction;
    private LocalDate completedDate;
    private String userId;
    private String actionId;
}