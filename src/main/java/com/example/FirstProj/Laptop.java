package com.example.FirstProj;

import org.springframework.stereotype.Component;

//giving name to the object created by spring
@Component("lap1")
public class Laptop {
    private int lid;
    private String brand;

    public void compile(){
        System.out.println("Compiling");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                '}';
    }

    public int getLid() {
        return lid;
    }


    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
