package ru.DCompany.SportBot2_0.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.DCompany.SportBot2_0.services.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
