package com.racer.java;

public class Swimmer extends Athlete {

    public Swimmer(){
        //default constructor
    }

    public Swimmer(String name, int age, int racerId){
       super(name, age, racerId);
    }

    @Override
    public String performRaceActivity() {
        return "Swimming";
    }

    @Override
    public String toString(){
        return String.format("%s %s]\tActivity: %s\n"
                , super.toString()
                , getClass()
                , performRaceActivity());
    }
}
