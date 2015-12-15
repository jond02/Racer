package com.racer.java;

public abstract class Athlete implements RaceParticipant, Person {

    private int _racerId;
    private String _name;
    private int _age;

    public Athlete(){
        //default constructor
    }

    public Athlete(String name, int age, int racerId){
        _name = name;
        _age = age;
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
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @Override
    public int getAge() {
        return _age;
    }

    @Override
    public void setAge(int age) {
        _age = age;
    }

    /**
     * The race activity for the athlete
     * @return string representing the Athlete's race activity
     */

    public abstract String performRaceActivity();

    /**
     * Get the state of the Athlete as a String
     * @return String containing state of the Athlete
     */

    @Override
    public String toString(){
        return String.format("%s]\tName: %s\tAge: %d\tRacerID: %d\t"
                , getClass()
                , getName()
                , getAge()
                , getRacerId());
    }
}
