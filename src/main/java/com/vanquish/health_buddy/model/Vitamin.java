package com.vanquish.health_buddy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "vitamins")
public class Vitamin {

    @Id
    private Integer userId;

    @Column(nullable = false)
    private Double vitaminA;

    @Column(nullable = false)
    private Double vitaminC;

    @Column(nullable = false)
    private Double vitaminD;

    @Column(nullable = false)
    private Double vitaminE;

    @Column(nullable = false)
    private Double vitaminK;

    @Column(nullable = false)
    private Double vitaminB1;

    @Column(nullable = false)
    private Double vitaminB2;

    @Column(nullable = false)
    private Double vitaminB3;

    @Column(nullable = false)
    private Double vitaminB5;

    @Column(nullable = false)
    private Double vitaminB6;

    @Column(nullable = false)
    private Double vitaminB7;

    @Column(nullable = false)
    private Double vitaminB9;

    @Column(nullable = false)
    private Double vitaminB12;

    //getters and setters

    public Integer getUserId() {
        return userId;
    }

    public Vitamin setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Double getVitaminA() {
        return vitaminA;
    }

    public Vitamin setVitaminA(Double vitaminA) {
        this.vitaminA = vitaminA;
        return this;
    }

    public Double getVitaminC() {
        return vitaminC;
    }

    public Vitamin setVitaminC(Double vitaminC) {
        this.vitaminC = vitaminC;
        return this;
    }

    public Double getVitaminD() {
        return vitaminD;
    }

    public Vitamin setVitaminD(Double vitaminD) {
        this.vitaminD = vitaminD;
        return this;
    }

    public Double getVitaminE() {
        return vitaminE;
    }

    public Vitamin setVitaminE(Double vitaminE) {
        this.vitaminE = vitaminE;
        return this;
    }

    public Double getVitaminK() {
        return vitaminK;
    }

    public Vitamin setVitaminK(Double vitaminK) {
        this.vitaminK = vitaminK;
        return this;
    }

    public Double getVitaminB1() {
        return vitaminB1;
    }

    public Vitamin setVitaminB1(Double vitaminB1) {
        this.vitaminB1 = vitaminB1;
        return this;
    }

    public Double getVitaminB2() {
        return vitaminB2;
    }

    public Vitamin setVitaminB2(Double vitaminB2) {
        this.vitaminB2 = vitaminB2;
        return this;
    }

    public Double getVitaminB3() {
        return vitaminB3;
    }

    public Vitamin setVitaminB3(Double vitaminB3) {
        this.vitaminB3 = vitaminB3;
        return this;
    }

    public Double getVitaminB5() {
        return vitaminB5;
    }

    public Vitamin setVitaminB5(Double vitaminB5) {
        this.vitaminB5 = vitaminB5;
        return this;
    }

    public Double getVitaminB6() {
        return vitaminB6;
    }

    public Vitamin setVitaminB6(Double vitaminB6) {
        this.vitaminB6 = vitaminB6;
        return this;
    }

    public Double getVitaminB7() {
        return vitaminB7;
    }

    public Vitamin setVitaminB7(Double vitaminB7) {
        this.vitaminB7 = vitaminB7;
        return this;
    }

    public Double getVitaminB9() {
        return vitaminB9;
    }

    public Vitamin setVitaminB9(Double vitaminB9) {
        this.vitaminB9 = vitaminB9;
        return this;
    }

    public Double getVitaminB12() {
        return vitaminB12;
    }

    public Vitamin setVitaminB12(Double vitaminB12) {
        this.vitaminB12 = vitaminB12;
        return this;
    }
}
