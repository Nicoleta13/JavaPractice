package com.nicole;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Toyota toyota = new Toyota("Toyota", 6);
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        BMV bmv = new BMV("BMV", 6);
        System.out.println(bmv.startEngine());
        System.out.println(bmv.accelerate());
        System.out.println(bmv.brake());
    }
}
