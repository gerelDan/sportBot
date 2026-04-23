package ru.DCompany.SportBot2_0.services.entities;

import jakarta.persistence.*;
import ru.DCompany.SportBot2_0.services.records.Sex;

import java.time.LocalDate;

@Table(name="users")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="tg_id")
    Long tgId;

    @Column(name="name")
    String name;

    @Enumerated(EnumType.STRING)
    @Column(name="sex")
    Sex sex;

    @Column(name="birthday")
    LocalDate birthday;

    @Column(name="phone_number")
    String phoneNumber;

    public UserEntity() {
    }

    public UserEntity(Long id, Long tgId, String name, Sex sex, LocalDate birthday, String phoneNumber) {
        this.id = id;
        this.tgId = tgId;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTgId() {
        return tgId;
    }

    public void setTgId(Long tgId) {
        this.tgId = tgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
