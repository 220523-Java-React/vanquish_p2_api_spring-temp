package com.vanquish.health_buddy.model.bodyFeedback;

import javax.persistence.*;

@Entity(name = "bodyfeedback")
public class BodyFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bodyFeedbackId;

    @Column(nullable = false)
    private Integer userId;

    @Enumerated
    @Column(nullable = false)
    private BodyMassIndex bodyMassIndex;

    @Enumerated
    @Column(nullable = false)
    private BodyFatPercentage bodyFatPercentage;

    @Enumerated
    @Column(nullable = false)
    private WaistToHeight waistToHeight;

    @Enumerated
    @Column(nullable = false)
    private WaistToHip waistToHip;

    //getters and setters


    public Integer getBodyFeedbackId() {
        return bodyFeedbackId;
    }

    public BodyFeedback setBodyFeedbackId(Integer bodyFeedbackId) {
        this.bodyFeedbackId = bodyFeedbackId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public BodyFeedback setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public BodyMassIndex getBodyMassIndex() {
        return bodyMassIndex;
    }

    public BodyFeedback setBodyMassIndex(BodyMassIndex bodyMassIndex) {
        this.bodyMassIndex = bodyMassIndex;
        return this;
    }

    public BodyFatPercentage getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public BodyFeedback setBodyFatPercentage(BodyFatPercentage bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
        return this;
    }

    public WaistToHeight getWaistToHeight() {
        return waistToHeight;
    }

    public BodyFeedback setWaistToHeight(WaistToHeight waistToHeight) {
        this.waistToHeight = waistToHeight;
        return this;
    }

    public WaistToHip getWaistToHip() {
        return waistToHip;
    }

    public BodyFeedback setWaistToHip(WaistToHip waistToHip) {
        this.waistToHip = waistToHip;
        return this;
    }
}
