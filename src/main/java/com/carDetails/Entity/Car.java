package com.carDetails.Entity;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "vin", unique = true)
    private String vin;
    @Column( name="brand" )
    private String brand;

    @Column( name="year" )
    private Integer year;

    @Column( name="Color" )
    private String Color;

    public Car() {
    }

    public Car(Integer id, String vin, String brand, Integer year, String color) {
        this.id = id;
        this.vin = vin;
        this.brand = brand;
        this.year = year;
        Color = color;
    }

    public Car(String vin, String brand, Integer year, String color) {
        this.vin = vin;
        this.brand = brand;
        this.year = year;
        Color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", vin='" + vin + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", Color='" + Color + '\'' +
                '}';
    }
}
