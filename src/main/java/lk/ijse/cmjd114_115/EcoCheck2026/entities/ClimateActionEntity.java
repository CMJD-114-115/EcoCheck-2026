package lk.ijse.cmjd114_115.EcoCheck2026.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClimateActionEntity implements Serializable {
    private String climateActionId;
    private String title;
    private String description;
    private double estimatedCO2Reduction;
    private int points;
}
