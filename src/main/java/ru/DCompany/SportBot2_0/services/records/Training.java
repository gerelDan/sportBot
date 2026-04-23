package ru.DCompany.SportBot2_0.services.records;

import java.time.LocalDate;

public record Training(
        Long id,
        Long userId,
        Long exerciseId,
        Float weight,
        Integer iteration,
        LocalDate date
) {
}
