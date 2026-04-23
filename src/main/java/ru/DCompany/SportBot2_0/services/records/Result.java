package ru.DCompany.SportBot2_0.services.records;

public record Result(
        Long id,
        Long userId,
        TypeResult typeResult,
        Float result
) {
}
