package com.vanquish.health_buddy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class BodyFeedback {

    @Id
    private Integer userId;

    @Enumerated
    @Column(nullable = false)
    private BmiRead bmiRead;

    @Enumerated
    @Column(nullable = false)
    private BodyFatPercentageRead bodyFatPercentageRead;

    @Enumerated
    @Column(nullable = false)
    private WaistToHeightRead waistToHeightRead;

    @Enumerated
    @Column(nullable = false)
    private WaistToHipRead waistToHipRead;

    //getters and setters

    public Integer getUserId() {
        return userId;
    }

    public BodyFeedback setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public BmiRead getBmiRead() {
        return bmiRead;
    }

    public BodyFeedback setBmiRead(BmiRead bmiRead) {
        this.bmiRead = bmiRead;
        return this;
    }

    public BodyFatPercentageRead getBodyFatPercentageRead() {
        return bodyFatPercentageRead;
    }

    public BodyFeedback setBodyFatPercentageRead(BodyFatPercentageRead bodyFatPercentageRead) {
        this.bodyFatPercentageRead = bodyFatPercentageRead;
        return this;
    }

    public WaistToHeightRead getWaistToHeightRead() {
        return waistToHeightRead;
    }

    public BodyFeedback setWaistToHeightRead(WaistToHeightRead waistToHeightRead) {
        this.waistToHeightRead = waistToHeightRead;
        return this;
    }

    public WaistToHipRead getWaistToHipRead() {
        return waistToHipRead;
    }

    public BodyFeedback setWaistToHipRead(WaistToHipRead waistToHipRead) {
        this.waistToHipRead = waistToHipRead;
        return this;
    }
}
