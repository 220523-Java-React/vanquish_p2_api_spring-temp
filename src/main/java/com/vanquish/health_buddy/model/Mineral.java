package com.vanquish.health_buddy.model;
import javax.persistence.*;
@Entity(name = "minerals")
public class Mineral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer mineralId;
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

    public Integer getMineralId() {
        return mineralId;
    }
    public void setMineralId(Integer mineralId) {
        this.mineralId = mineralId;
    }
    public Double getCholine() {
        return choline;
    }
    public void setCholine(Double choline) {
        this.choline = choline;
    }
    public Double getMagnesium() {
        return magnesium;
    }
    public void setMagnesium(Double magnesium) {
        this.magnesium = magnesium;
    }
    public Double getCalcium() {
        return calcium;
    }
    public void setCalcium(Double calcium) {
        this.calcium = calcium;
    }
    public Double getZinc() {
        return zinc;
    }
    public void setZinc(Double zinc) {
        this.zinc = zinc;
    }
    public Double getIron() {
        return iron;
    }
    public void setIron(Double iron) {
        this.iron = iron;
    }
    public Double getCopper() {
        return copper;
    }
    public void setCopper(Double copper) {
        this.copper = copper;
    }
    public Double getSelenium() {
        return selenium;
    }
    public void setSelenium(Double selenium) {
        this.selenium = selenium;
    }
    public Double getManganese() {
        return manganese;
    }
    public void setManganese(Double manganese) {
        this.manganese = manganese;
    }
    public Double getPhosphorus() {
        return phosphorus;
    }
    public void setPhosphorus(Double phosphorus) {
        this.phosphorus = phosphorus;
    }
    public Double getPotassium() {
        return potassium;
    }
    public void setPotassium(Double potassium) {
        this.potassium = potassium;
    }
    public Double getIodine() {
        return iodine;
    }
    public void setIodine(Double iodine) {
        this.iodine = iodine;
    }
    public Double getChromium() {
        return chromium;
    }
    public void setChromium(Double chromium) {
        this.chromium = chromium;
    }
    public Double getFlouride() {
        return flouride;
    }
    public void setFlouride(Double flouride) {
        this.flouride = flouride;
    }
    public Double getSodium() {
        return sodium;
    }
    public void setSodium(Double sodium) {
        this.sodium = sodium;
    }
    public Double getChloride() {
        return chloride;
    }
    public void setChloride(Double chloride) {
        this.chloride = chloride;
    }
}