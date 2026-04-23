package ru.DCompany.SportBot2_0.services.records;

public enum MusculeGroup {
    Rhomboid("Ромбовидные мышцы"),
    Trapezius("Трапециевидные мышцы"),
    Deltoid("Дельтовидные мышцы"),
    Pectoral("Грудные мышцы"),
    BroadestBack("Широчайшие мышцы спины"),
    Arm("Мышцы рук"),
    Forearm("Мышцы предплечья"),
    Abdominal("Мышцы живота"),
    Gluteal("Ягодичные мышцы"),
    Quadriceps("Четырехглавые мышцы"),
    Calf("Икроножные мышцы");

    public final String name;

    MusculeGroup(String name) {
        this.name = name;
    }
}
