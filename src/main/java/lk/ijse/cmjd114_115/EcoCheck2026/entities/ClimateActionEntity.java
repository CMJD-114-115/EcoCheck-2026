package lk.ijse.cmjd114_115.EcoCheck2026.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "climate-actions")
@Builder
public class ClimateActionEntity implements Serializable {
    @Id
    private String climateActionId;
    private String title;
    private String description;
    private double estimatedCO2Reduction;
    private int points;

    @ManyToOne
    @JoinColumn(name = "action-id")
    private ActionCategoryEntity actionCategory;

    @JsonIgnore
    @OneToMany(mappedBy = "climateAction")
    private List<UserActionEntity> userActions;

}
