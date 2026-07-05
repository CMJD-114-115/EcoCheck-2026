package lk.ijse.cmjd114_115.EcoCheck2026.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "action-categories")
public class ActionCategoryEntity implements Serializable {
    @Id
    private String categoryId;
    private String name;
    private String description;

    @OneToMany(mappedBy = "actionCategory")
    @JsonIgnore
    private List<ClimateActionEntity> climateActions;
}
