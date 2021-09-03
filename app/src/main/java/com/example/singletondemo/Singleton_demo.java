package com.example.singletondemo;

public class Singleton_demo {

    private static Singleton_demo INSTANCE = null;

    // other instance variables can be here
    private int val=0;

    private Singleton_demo() {};

    public static Singleton_demo getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton_demo();
        }
        return(INSTANCE);
    }

    // other instance methods can follow
    public int get(){return val;}
    public void inc(){val++;}
}

