package com.racer.java;

public class Runner implements RaceParticipant{

    private int _racerId;

    public Runner(){
        //default constructor
    }

    public Runner(int racerId){
        _racerId = racerId;
    }

    @Override
    public void setRacerId(int racerId) {
        _racerId = racerId;
    }

    @Override
    public int getRacerId() {
        return _racerId;
    }

    @Override
    public String performRaceActivity() {
        return "Running";
    }

    @Override
    public String toString(){
        return String.format("%s]\tRacerID: %d\tActivity: %s\n"
                                , getClass()
                                , getRacerId()
                                , performRaceActivity());
    }
}
