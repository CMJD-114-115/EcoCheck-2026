package lk.ijse.cmjd114_115.EcoCheck2026.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ActionCategoryEntity implements Serializable {
    private String categoryId;
    private String name;
    private String description;
}
