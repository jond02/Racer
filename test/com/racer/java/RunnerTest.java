package com.racer.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest extends AthleteTest {

    private Runner r;
    private String raceActivity = "Running";
    private String shoes = "Any shoe brand";

    @Override
    public Athlete getAthlete() {
        return new Runner();
    }

    @Override
    public Athlete getExplicitAthlete() {
        return new Runner(_name, _age, _racerId, shoes);
    }

    @Before
    public void setUp() throws Exception {
        r = new Runner();
    }

    @After
    public void tearDown() throws Exception {
        r = null;
    }

    @Test
    public void testConstructors(){

        super.testConstructors();
        Runner r2 = new Runner(_name, _age, _racerId, shoes);
        assertNotNull("Explicit Runner could not be created", r2);
        assertEquals("Shoes not set correctly on R2"
                , shoes
                , r2.getShoeBrand());
    }

    @Test
    public void testGetSetShoeBrand(){
        r.setShoeBrand(shoes);
        assertEquals("The shoe brand could not be set as expected"
                , shoes
                , r.getShoeBrand());
    }

    @Test
    public void testPerformRaceActivity() {
        String pra = r.performRaceActivity();
        assertTrue("performRaceActivity did not contain activity"
                        , pra.contains(raceActivity));
    }

    @Test
    public void testToString() throws Exception {

        super.testToString();
        r.setRacerId(_racerId);
        r.setAge(_age);
        r.setName(_name);
        r.setShoeBrand(shoes);
        String rts = r.toString();

        assertTrue("toString does not contain shoes"
                , rts.contains(shoes));
        String rc = r.getClass().toString();
        assertTrue("toString does note contain class"
                , rts.contains(rc));
        assertTrue("toString does not contain performRaceActivity"
                , rts.contains(raceActivity));
    }


}