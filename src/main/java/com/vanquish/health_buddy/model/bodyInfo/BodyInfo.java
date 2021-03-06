package com.vanquish.health_buddy.model.bodyInfo;

import javax.persistence.*;

@Entity(name = "bodyinfo")
public class BodyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bodyInfoId;

    @Column(nullable = false)
    private Integer userId;

    @Column(nullable = false)
    private Double bodyMassIndex;

    @Column(nullable = false)
    private Double bodyFatPercentage;

    @Column(nullable = false)
    private Double fatMass;

    @Column(nullable = false)
    private Double leanMass;

    @Column(nullable = false)
    private Double waistToHeightRatio;

    @Column(nullable = false)
    private Double waistToHipRatio;

    @Column(nullable = false)
    private Double basalMetabolicRate;

    @Column(nullable = false)
    private Double idealBodyWeight;


    //Getters and Setters


    public Integer getBodyInfoId() {
        return bodyInfoId;
    }

    public BodyInfo setBodyInfoId(Integer bodyInfoId) {
        this.bodyInfoId = bodyInfoId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public BodyInfo setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Double getBodyMassIndex() {
        return bodyMassIndex;
    }

    public BodyInfo setBodyMassIndex(Double bodyMassIndex) {
        this.bodyMassIndex = bodyMassIndex;
        return this;
    }

    public Double getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public BodyInfo setBodyFatPercentage(Double bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
        return this;
    }

    public Double getFatMass() {
        return fatMass;
    }

    public BodyInfo setFatMass(Double fatMass) {
        this.fatMass = fatMass;
        return this;
    }

    public Double getLeanMass() {
        return leanMass;
    }

    public BodyInfo setLeanMass(Double leanMass) {
        this.leanMass = leanMass;
        return this;
    }

    public Double getWaistToHeightRatio() {
        return waistToHeightRatio;
    }

    public BodyInfo setWaistToHeightRatio(Double waistToHeightRatio) {
        this.waistToHeightRatio = waistToHeightRatio;
        return this;
    }

    public Double getWaistToHipRatio() {
        return waistToHipRatio;
    }

    public BodyInfo setWaistToHipRatio(Double waistToHipRatio) {
        this.waistToHipRatio = waistToHipRatio;
        return this;
    }

    public Double getBasalMetabolicRate() {
        return basalMetabolicRate;
    }

    public BodyInfo setBasalMetabolicRate(Double basalMetabolicRate) {
        this.basalMetabolicRate = basalMetabolicRate;
        return this;
    }

    public Double getIdealBodyWeight() {
        return idealBodyWeight;
    }

    public BodyInfo setIdealBodyWeight(Double idealBodyWeight) {
        this.idealBodyWeight = idealBodyWeight;
        return this;
    }
}
