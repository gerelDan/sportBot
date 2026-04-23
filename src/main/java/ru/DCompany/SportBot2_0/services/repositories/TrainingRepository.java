package ru.DCompany.SportBot2_0.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.DCompany.SportBot2_0.services.entities.TrainingEntity;

public interface TrainingRepository extends JpaRepository<TrainingEntity, Long> {
}
