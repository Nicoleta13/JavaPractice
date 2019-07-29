package com.nicole;

public class Additional {

    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private  boolean onion;

    public Additional(boolean lettuce, boolean tomato, boolean carrot, boolean onion) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.onion = onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isOnion() {
        return onion;
    }
}
