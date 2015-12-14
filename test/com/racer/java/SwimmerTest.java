package com.racer.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwimmerTest {

    private Swimmer s;
    private int racerId = 123456;
    private String raceActivity = "Swimming";

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
        assertNotNull("Default Runner could not be created", s);

        Swimmer s2 = new Swimmer(racerId);
        assertNotNull("Explicit Runner could not be created", s2);
        assertEquals("RacerID not set correctly on R2"
                , racerId
                , s2.getRacerId());
    }

    @Test
    public void testGetSetRacerId() throws Exception {
        s.setRacerId(racerId);
        assertEquals("The racerId could not be set as expected"
                , racerId
                , s.getRacerId());
    }

    @Test
    public void testPerformRaceActivity() throws Exception {
        String pra = s.performRaceActivity();
        assertTrue("performRaceActivity did not contain activity"
                ,pra.contains(raceActivity));
    }

    @Test
    public void testToString() throws Exception {
        s.setRacerId(racerId);
        String sts = s.toString();
        assertTrue("toString does not contain racerId"
                , sts.contains(String.format("%d", racerId)));
        String sc = s.getClass().toString();
        assertTrue("toString does note contain class"
                , sts.contains(sc));
        assertTrue("toString does not contain performRaceActivity"
                , sts.contains(raceActivity));
    }
}