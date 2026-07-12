package lk.ijse.cmjd114_115.EcoCheck2026.dao;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserActionDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserActionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserActionDao extends JpaRepository<UserActionEntity,String> {
}
