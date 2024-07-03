package com.learning.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public void printHello(){
        System.out.println("Hello From The @Component Vehicle");
    }
}

