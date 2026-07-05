package lk.ijse.cmjd114_115.EcoCheck2026.entities;

import jakarta.persistence.*;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UserEntity implements Serializable {
    @Id
    private String useId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(unique = true,nullable = false)
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}
