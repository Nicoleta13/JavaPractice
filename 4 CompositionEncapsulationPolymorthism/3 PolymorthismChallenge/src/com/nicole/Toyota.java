package com.nicole;

public class Toyota extends Car {

    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        //return "Toyota -> startEngine()";
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        //return "Toyota -> accelerate()";
        return getClass().getSimpleName() + " -> startAccelerate()";
    }

    @Override
    public String brake() {
        //return "Toyota -> brake()";
        return getClass().getSimpleName() + " -> startBrake()";
    }
}
