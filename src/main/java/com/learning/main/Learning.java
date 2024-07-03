package com.learning.main;

import com.learning.beans.Vehicle;
import com.learning.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Learning {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component vehicle name from Spring context is : " + vehicle.getName());
        vehicle.printHello();

    }
}
