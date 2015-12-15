package com.racer.java;

public class Runner implements RaceParticipant, Person {

    private int _racerId;
    private String _name;
    private int _age;

    public Runner(){
        //default constructor
    }

    public Runner(String name, int age, int racerId){
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

    @Override
    public String performRaceActivity() {
        return "Running";
    }

    @Override
    public String toString(){
        return String.format("%s]\tName: %s\tAge: %d\tRacerID: %d\tActivity: %s\n"
                , getClass()
                , getName()
                , getAge()
                , getRacerId()
                , performRaceActivity());
    }
}
