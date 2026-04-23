package ru.DCompany.SportBot2_0.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.DCompany.SportBot2_0.services.entities.ExerciseEntity;

public interface ExerciseRepository extends JpaRepository<ExerciseEntity, Long> {
}
