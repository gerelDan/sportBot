package ru.DCompany.SportBot2_0.services.entities;


import jakarta.persistence.*;
import ru.DCompany.SportBot2_0.services.records.MusculeGroup;

import javax.annotation.processing.Generated;

@Table(name = "exercises")
@Entity
public class ExerciseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "muscule_group")
    MusculeGroup musculeGroup;

    public ExerciseEntity() {
    }

    public ExerciseEntity(Long id, String name, MusculeGroup musculeGroup) {
        this.id = id;
        this.name = name;
        this.musculeGroup = musculeGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MusculeGroup getMusculeGroup() {
        return musculeGroup;
    }

    public void setMusculeGroup(MusculeGroup musculeGroup) {
        this.musculeGroup = musculeGroup;
    }
}
