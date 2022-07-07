package com.vanquish.health_buddy.model;

import javax.persistence.*;

@Entity(name = "body_info")
public class BodyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer info_id;

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

    public Integer getInfo_id() {
        return info_id;
    }

    public BodyInfo setInfo_id(Integer info_id) {
        this.info_id = info_id;
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

    public Double getWaistToHipRatio() {
        return waistToHipRatio;
    }

    public BodyInfo setWaistToHipRatio(Double waistToHipRatio) {
        this.waistToHipRatio = waistToHipRatio;
        return this;
    }

    public BodyInfo setWaistToHeightRatio(Double waistToHeightRatio) {
        this.waistToHeightRatio = waistToHeightRatio;
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
