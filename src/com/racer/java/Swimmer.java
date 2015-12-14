package com.racer.java;

public class Swimmer implements RaceParticipant {

    private int _racerId;

    public Swimmer(){
        //default constructor
    }

    public Swimmer(int racerId){
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
        return "Swimming";
    }

    @Override
    public String toString(){
        return String.format("%s]\tRacerID: %d\tActivity: %s\n"
                , getClass()
                , getRacerId()
                , performRaceActivity());
    }
}
