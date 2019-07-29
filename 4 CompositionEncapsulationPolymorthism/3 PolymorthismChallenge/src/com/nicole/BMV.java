package com.nicole;

public class BMV extends Car{

    public BMV(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "BMV -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "BMV -> accelerate()";    }

    @Override
    public String brake() {
        return "BMV -> brake()";
    }
}
