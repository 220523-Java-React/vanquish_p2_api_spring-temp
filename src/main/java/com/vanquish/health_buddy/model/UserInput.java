package com.vanquish.health_buddy.model;

import javax.persistence.*;

@Entity
public class UserInput {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer inputId;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private Double height;
    @Column(nullable = false)
    private Double weight;
    @Column(nullable = false)
    private Double waist;
    @Column(nullable = false)
    private Double neck;
    @Column(nullable = false)
    private Double hip;


    @Enumerated
    @Column(nullable = false)
    private UnitOfMeasurement unitOfMeasurement;

    @Enumerated
    @Column(nullable = false)
    private Gender gender;

    @Enumerated
    @Column(nullable = false)
    private ActivityLevel activityLevel;

    @Enumerated
    @Column(nullable = false)
    private WeightGoal weightGoal;

    public Integer getInputId() {
        return inputId;
    }

    public UserInput setInputId(Integer inputId) {
        this.inputId = inputId;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserInput setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Double getHeight() {
        return height;
    }

    public UserInput setHeight(Double height) {
        this.height = height;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public UserInput setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Double getWaist() {
        return waist;
    }

    public UserInput setWaist(Double waist) {
        this.waist = waist;
        return this;
    }

    public Double getNeck() {
        return neck;
    }

    public UserInput setNeck(Double neck) {
        this.neck = neck;
        return this;
    }

    public Double getHip() {
        return hip;
    }

    public UserInput setHip(Double hip) {
        this.hip = hip;
        return this;
    }

    public UnitOfMeasurement getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public UserInput setUnitOfMeasurement(UnitOfMeasurement unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public UserInput setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }

    public UserInput setActivityLevel(ActivityLevel activityLevel) {
        this.activityLevel = activityLevel;
        return this;
    }

    public WeightGoal getWeightGoal() {
        return weightGoal;
    }

    public UserInput setWeightGoal(WeightGoal weightGoal) {
        this.weightGoal = weightGoal;
        return this;
    }
}
