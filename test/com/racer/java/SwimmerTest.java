package com.racer.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwimmerTest extends AthleteTest{

    private Swimmer s;
    private String raceActivity = "Swimming";

    @Override
    public Athlete getAthlete() {
        return new Swimmer();
    }

    @Override
    public Athlete getExplicitAthlete() {
        return new Swimmer(_name, _age, _racerId);
    }

    @Before
    public void setUp() throws Exception {
        s = new Swimmer();
    }

    @After
    public void tearDown() throws Exception {
        s = null;
    }

    @Test
    public void testConstructors(){
        super.testConstructors();
    }

    @Test
    public void testPerformRaceActivity() {
        String pra = s.performRaceActivity();
        assertTrue("performRaceActivity did not contain activity"
                , pra.contains(raceActivity));
    }

    @Test
    public void testToString() throws Exception {
        super.testToString();
        s.setRacerId(_racerId);
        s.setAge(_age);
        s.setName(_name);
        String rts = s.toString();

        String rc = s.getClass().toString();
        assertTrue("toString does note contain class"
                , rts.contains(rc));
        assertTrue("toString does not contain performRaceActivity"
                , rts.contains(raceActivity));
    }
}