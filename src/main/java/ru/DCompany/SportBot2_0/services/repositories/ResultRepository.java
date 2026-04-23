package ru.DCompany.SportBot2_0.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.DCompany.SportBot2_0.services.entities.ResultEntity;

public interface ResultRepository extends JpaRepository<ResultEntity, Long> {
}
