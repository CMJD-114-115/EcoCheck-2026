package lk.ijse.cmjd114_115.EcoCheck2026.dao;

import lk.ijse.cmjd114_115.EcoCheck2026.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserEntity, String> {
}
