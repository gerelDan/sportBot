package ru.DCompany.SportBot2_0.services.entities;

import jakarta.persistence.*;
import ru.DCompany.SportBot2_0.services.records.TypeResult;

public class ResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "user_id")
    Long userId;

    @Enumerated(EnumType.STRING)
    @Column(name = "tye_result")
    TypeResult typeResult;

    @Column(name = "result")
    Float result;

    public ResultEntity() {
    }

    public ResultEntity(Long id, Long userId, TypeResult typeResult, Float result) {
        this.id = id;
        this.userId = userId;
        this.typeResult = typeResult;
        this.result = result;
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

    public TypeResult getTypeResult() {
        return typeResult;
    }

    public void setTypeResult(TypeResult typeResult) {
        this.typeResult = typeResult;
    }

    public Float getResult() {
        return result;
    }

    public void setResult(Float result) {
        this.result = result;
    }
}
