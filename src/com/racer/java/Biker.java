package com.racer.java;

public class Biker implements RaceParticipant {

    private int _racerId;

    public Biker(){
        //default constructor
    }

    public Biker(int racerId){
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
        return "Biking";
    }

    @Override
    public String toString(){
        return String.format("%s]\tRacerID: %d\tActivity: %s\n"
                , getClass()
                , getRacerId()
                , performRaceActivity());
    }
}
