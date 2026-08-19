package br.com.foodbridge.modules.user.db.repository;

import br.com.foodbridge.modules.user.db.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity,UUID> {
}
