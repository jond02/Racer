package com.racer.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {

    private Runner r;
    private int racerId = 123456;
    private String raceActivity = "Running";

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
        assertNotNull("Default Runner could not be created", r);

        Runner r2 = new Runner(racerId);
        assertNotNull("Explicit Runner could not be created", r2);
        assertEquals("RacerID not set correctly on R2"
                        , racerId
                        , r2.getRacerId());
    }

    @Test
    public void testGetSetRacerId() throws Exception {
        r.setRacerId(racerId);
        assertEquals("The racerId could not be set as expected"
                        , racerId
                        , r.getRacerId());
    }

    @Test
    public void testPerformRaceActivity() throws Exception {
        String pra = r.performRaceActivity();
        assertTrue("performRaceActivity did not contain activity"
                        ,pra.contains(raceActivity));
    }

    @Test
    public void testToString() throws Exception {
        r.setRacerId(racerId);
        String rts = r.toString();
        assertTrue("toString does not contain racerId"
                    , rts.contains(String.format("%d", racerId)));
        String rc = r.getClass().toString();
        assertTrue("toString does note contain class"
                    , rts.contains(rc));
        assertTrue("toString does not contain performRaceActivity"
                    , rts.contains(raceActivity));
    }
}