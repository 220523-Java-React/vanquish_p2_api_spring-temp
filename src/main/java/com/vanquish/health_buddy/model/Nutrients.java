package com.vanquish.health_buddy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "nutrients")
public class Nutrients {

    @Id
    private Integer userId;

    @Column(nullable = false)
    private Integer protein;

    @Column(nullable = false)
    private Integer calories;

    @Column(nullable = false)
    private Integer fat;

    @Column(nullable = false)
    private Integer water;

    @Column(nullable = false)
    private Integer carbs;

    public Integer getUserId() {
        return userId;
    }

    public Nutrients setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getProtein() {
        return protein;
    }

    public Nutrients setProtein(Integer protein) {
        this.protein = protein;
        return this;
    }

    public Integer getCalories() {
        return calories;
    }

    public Nutrients setCalories(Integer calories) {
        this.calories = calories;
        return this;
    }

    public Integer getFat() {
        return fat;
    }

    public Nutrients setFat(Integer fat) {
        this.fat = fat;
        return this;
    }

    public Integer getWater() {
        return water;
    }

    public Nutrients setWater(Integer water) {
        this.water = water;
        return this;
    }

    public Integer getCarbs() {
        return carbs;
    }

    public Nutrients setCarbs(Integer carbs) {
        this.carbs = carbs;
        return this;
    }
}
