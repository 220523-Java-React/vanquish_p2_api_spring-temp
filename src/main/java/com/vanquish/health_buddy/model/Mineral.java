package com.vanquish.health_buddy.model;
import javax.persistence.*;
@Entity(name = "minerals")
public class Mineral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer mineralId;
    //@manytoOne here for User soon
    @Column(nullable = false)
    private Double Choline;
    @Column(nullable = false)
    private Double Magnesium;
    @Column(nullable = false)
    private Double Calcium;
    @Column(nullable = false)
    private Double Zinc;
    @Column(nullable = false)
    private Double Iron;
    @Column(nullable = false)
    private Double copper;
    @Column(nullable = false)
    private Double Selenium;
    @Column(nullable = false)
    private Double Manganese;
    @Column(nullable = false)
    private Double Phosphorus;
    @Column(nullable = false)
    private Double Potassium;
    @Column(nullable = false)
    private Double Iodine;
    @Column(nullable = false)
    private Double Chromium;
    @Column(nullable = false)
    private Double Flouride;
    @Column(nullable = false)
    private Double Sodium;
    @Column(nullable = false)
    private Double Chloride;

    public Integer getMineralId() {
        return mineralId;
    }
    public void setMineralId(Integer mineralId) {
        this.mineralId = mineralId;
    }
    public Double getCholine() {
        return Choline;
    }
    public void setCholine(Double choline) {
        Choline = choline;
    }
    public Double getMagnesium() {
        return Magnesium;
    }
    public void setMagnesium(Double magnesium) {
        Magnesium = magnesium;
    }
    public Double getCalcium() {
        return Calcium;
    }
    public void setCalcium(Double calcium) {
        Calcium = calcium;
    }
    public Double getZinc() {
        return Zinc;
    }
    public void setZinc(Double zinc) {
        Zinc = zinc;
    }
    public Double getIron() {
        return Iron;
    }
    public void setIron(Double iron) {
        Iron = iron;
    }
    public Double getCopper() {
        return copper;
    }
    public void setCopper(Double copper) {
        this.copper = copper;
    }
    public Double getSelenium() {
        return Selenium;
    }
    public void setSelenium(Double selenium) {
        Selenium = selenium;
    }
    public Double getManganese() {
        return Manganese;
    }
    public void setManganese(Double manganese) {
        Manganese = manganese;
    }
    public Double getPhosphorus() {
        return Phosphorus;
    }
    public void setPhosphorus(Double phosphorus) {
        Phosphorus = phosphorus;
    }
    public Double getPotassium() {
        return Potassium;
    }
    public void setPotassium(Double potassium) {
        Potassium = potassium;
    }
    public Double getIodine() {
        return Iodine;
    }
    public void setIodine(Double iodine) {
        Iodine = iodine;
    }
    public Double getChromium() {
        return Chromium;
    }
    public void setChromium(Double chromium) {
        Chromium = chromium;
    }
    public Double getFlouride() {
        return Flouride;
    }
    public void setFlouride(Double flouride) {
        Flouride = flouride;
    }
    public Double getSodium() {
        return Sodium;
    }
    public void setSodium(Double sodium) {
        Sodium = sodium;
    }
    public Double getChloride() {
        return Chloride;
    }
    public void setChloride(Double chloride) {
        Chloride = chloride;
    }
}