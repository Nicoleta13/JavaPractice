package com.nicole;

public class Mercedes extends Car {

    public Mercedes(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mercedes -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mercedes -> accelerate()";    }

    @Override
    public String brake() {
        return "Mercedes -> brake()";
    }
}
