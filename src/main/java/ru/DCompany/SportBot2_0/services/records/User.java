package ru.DCompany.SportBot2_0.services.records;

import java.time.LocalDate;

public record User(
        Long id,
        Long tgId,
        String name,
        Sex sex,
        LocalDate birthday,
        String phoneNumber
) {
}
