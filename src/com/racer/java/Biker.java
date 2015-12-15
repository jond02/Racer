package com.racer.java;

public class Biker extends Athlete {

    private boolean _usesClips;

    public Biker(){
        //default constructor
    }

    public Biker(String name, int age, int racerId, boolean usesClips){
        super(name, age, racerId);
        _usesClips = usesClips;
    }

    public boolean getUsingClips() {
        return _usesClips;
    }

    public void setUsingClips(boolean usesClips) {
        _usesClips = usesClips;
    }

    @Override
    public String performRaceActivity() {
        return "Biking";
    }

    @Override
    public String toString(){
        return String.format("%s %s]\tActivity: %s\tIs biking with clips: %s\n"
                , super.toString()
                , getClass()
                , performRaceActivity()
                , getUsingClips());
    }
}
