package com.vanquish.health_buddy.model.progress;

import com.vanquish.health_buddy.model.userInput.ActivityLevel;
import com.vanquish.health_buddy.model.userInput.Gender;
import com.vanquish.health_buddy.model.userInput.UnitOfMeasurement;
import com.vanquish.health_buddy.model.userInput.WeightGoal;

import javax.persistence.*;

@Entity(name = "progress")
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer progressId;

    @Column(nullable = false)
    private Integer userId;

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

    public Integer getProgressId() {
        return progressId;
    }

    public Progress setProgressId(Integer progressId) {
        this.progressId = progressId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Progress setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Progress setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Double getHeight() {
        return height;
    }

    public Progress setHeight(Double height) {
        this.height = height;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public Progress setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Double getWaist() {
        return waist;
    }

    public Progress setWaist(Double waist) {
        this.waist = waist;
        return this;
    }

    public Double getNeck() {
        return neck;
    }

    public Progress setNeck(Double neck) {
        this.neck = neck;
        return this;
    }

    public Double getHip() {
        return hip;
    }

    public Progress setHip(Double hip) {
        this.hip = hip;
        return this;
    }

    public UnitOfMeasurement getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public Progress setUnitOfMeasurement(UnitOfMeasurement unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Progress setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }

    public Progress setActivityLevel(ActivityLevel activityLevel) {
        this.activityLevel = activityLevel;
        return this;
    }

    public WeightGoal getWeightGoal() {
        return weightGoal;
    }

    public Progress setWeightGoal(WeightGoal weightGoal) {
        this.weightGoal = weightGoal;
        return this;
    }
}