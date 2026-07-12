package lk.ijse.cmjd114_115.EcoCheck2026.dao;

import lk.ijse.cmjd114_115.EcoCheck2026.entities.ClimateActionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClimateActionDao extends JpaRepository<ClimateActionEntity,String> {
}
