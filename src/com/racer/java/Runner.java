package com.racer.java;

public class Runner extends Athlete {

    private String _shoeBrand;

    public Runner(){
        //default constructor
    }

    public Runner(String name, int age, int racerId, String brand){
        super(name, age, racerId);
        _shoeBrand = brand;
    }

    public String getShoeBrand() {
        return _shoeBrand;
    }

    public void setShoeBrand(String shoeBrand) {
        _shoeBrand = shoeBrand;
    }

    @Override
    public String performRaceActivity() {
        return "Running";
    }

    @Override
    public String toString(){
        return String.format("%s %s]\tActivity: %s\tIs running with the shoes: %s\n"
                , super.toString()
                , getClass()
                , performRaceActivity()
                , getShoeBrand());
    }
}
