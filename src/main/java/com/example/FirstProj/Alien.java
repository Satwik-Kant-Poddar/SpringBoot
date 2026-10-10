package com.example.FirstProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//component - spring will give object for this class
@Component
//scope - spring will create object when asked for bean creation
@Scope(value = "prototype")
public class Alien {
    static int i =0;
    private int aid;
    private String aname;
    private String tech ;
    //autowired  - find the object by type (class)
    @Autowired
    //Qualifier - giving the required name to find
    @Qualifier("lap1")
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Alien(){
        System.out.println( " object alien created "+ i);
        i++;
    }
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show(){
        System.out.println("show alien.");
        laptop.compile();
    }
}
