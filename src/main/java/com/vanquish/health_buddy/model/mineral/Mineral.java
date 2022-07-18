package com.vanquish.health_buddy.model.mineral;
import javax.persistence.*;
@Entity(name = "minerals")
public class Mineral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer mineralId;

    @Column(nullable = false)
    private Integer userId;

    //@manytoOne here for User soon
    @Column(nullable = false)
    private Double choline;
    @Column(nullable = false)
    private Double magnesium;
    @Column(nullable = false)
    private Double calcium;
    @Column(nullable = false)
    private Double zinc;
    @Column(nullable = false)
    private Double iron;
    @Column(nullable = false)
    private Double copper;
    @Column(nullable = false)
    private Double selenium;
    @Column(nullable = false)
    private Double manganese;
    @Column(nullable = false)
    private Double phosphorus;
    @Column(nullable = false)
    private Double potassium;
    @Column(nullable = false)
    private Double iodine;
    @Column(nullable = false)
    private Double chromium;
    @Column(nullable = false)
    private Double flouride;
    @Column(nullable = false)
    private Double sodium;
    @Column(nullable = false)
    private Double chloride;

    public Integer getMineralslId() {
        return mineralId;
    }

    public Mineral setMineralslId(Integer mineralslId) {
        this.mineralId = mineralslId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Mineral setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Double getCholine() {
        return choline;
    }

    public Mineral setCholine(Double choline) {
        this.choline = choline;
        return this;
    }

    public Double getMagnesium() {
        return magnesium;
    }

    public Mineral setMagnesium(Double magnesium) {
        this.magnesium = magnesium;
        return this;
    }

    public Double getCalcium() {
        return calcium;
    }

    public Mineral setCalcium(Double calcium) {
        this.calcium = calcium;
        return this;
    }

    public Double getZinc() {
        return zinc;
    }

    public Mineral setZinc(Double zinc) {
        this.zinc = zinc;
        return this;
    }

    public Double getIron() {
        return iron;
    }

    public Mineral setIron(Double iron) {
        this.iron = iron;
        return this;
    }

    public Double getCopper() {
        return copper;
    }

    public Mineral setCopper(Double copper) {
        this.copper = copper;
        return this;
    }

    public Double getSelenium() {
        return selenium;
    }

    public Mineral setSelenium(Double selenium) {
        this.selenium = selenium;
        return this;
    }

    public Double getManganese() {
        return manganese;
    }

    public Mineral setManganese(Double manganese) {
        this.manganese = manganese;
        return this;
    }

    public Double getPhosphorus() {
        return phosphorus;
    }

    public Mineral setPhosphorus(Double phosphorus) {
        this.phosphorus = phosphorus;
        return this;
    }

    public Double getPotassium() {
        return potassium;
    }

    public Mineral setPotassium(Double potassium) {
        this.potassium = potassium;
        return this;
    }

    public Double getIodine() {
        return iodine;
    }

    public Mineral setIodine(Double iodine) {
        this.iodine = iodine;
        return this;
    }

    public Double getChromium() {
        return chromium;
    }

    public Mineral setChromium(Double chromium) {
        this.chromium = chromium;
        return this;
    }

    public Double getFlouride() {
        return flouride;
    }

    public Mineral setFlouride(Double flouride) {
        this.flouride = flouride;
        return this;
    }

    public Double getSodium() {
        return sodium;
    }

    public Mineral setSodium(Double sodium) {
        this.sodium = sodium;
        return this;
    }

    public Double getChloride() {
        return chloride;
    }

    public Mineral setChloride(Double chloride) {
        this.chloride = chloride;
        return this;
    }
}