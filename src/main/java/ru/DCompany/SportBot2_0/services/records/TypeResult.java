package ru.DCompany.SportBot2_0.services.records;

public enum TypeResult {
    Waist("Талия"),
    СhestCircumference("Обхват груди"),
    Weight("Вес"),
    BicepGirth("Обхват бицепса"),
    QuadricepsGirth("Обхват квадрицепса");

    public final String name;

    TypeResult(String name) {
        this.name = name;
    }
}
