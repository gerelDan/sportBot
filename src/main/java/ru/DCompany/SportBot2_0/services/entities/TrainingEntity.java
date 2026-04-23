package ru.DCompany.SportBot2_0.services.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

public class TrainingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "user_id")
    Long userId;

    @Column(name = "exercise_id")
    Long exerciseId;

    @Column(name = "weight")
    Float weight;

    @Column(name = "iteration")
    Integer iteration;

    @Column(name = "date")
    LocalDate date;

    public TrainingEntity() {
    }

    public TrainingEntity(Long id, Long userId, Long exerciseId, Float weight, Integer iteration, LocalDate date) {
        this.id = id;
        this.userId = userId;
        this.exerciseId = exerciseId;
        this.weight = weight;
        this.iteration = iteration;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Long exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getIteration() {
        return iteration;
    }

    public void setIteration(Integer iteration) {
        this.iteration = iteration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
