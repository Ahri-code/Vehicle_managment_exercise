package com.vehicle.singletone;

public class MySingleTone {

    private static MySingleTone instance = null;

    public static MySingleTone getInstance() {
        if(instance == null) {
            instance = new MySingleTone();
        }
        return instance;
    }
}
