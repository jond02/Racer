package com.racer.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikerTest {

    private Biker b;
    private int racerId = 123456;
    private String raceActivity = "Biking";

    @Before
    public void setUp() throws Exception {
        b = new Biker();
    }

    @After
    public void tearDown() throws Exception {
        b = null;
    }

    @Test
    public void testConstructors(){
        assertNotNull("Default Runner could not be created", b);

        Biker b2 = new Biker(racerId);
        assertNotNull("Explicit Runner could not be created", b2);
        assertEquals("RacerID not set correctly on R2"
                , racerId
                , b2.getRacerId());
    }

    @Test
    public void testGetSetRacerId() throws Exception {
        b.setRacerId(racerId);
        assertEquals("The racerId could not be set as expected"
                , racerId
                , b.getRacerId());
    }

    @Test
    public void testPerformRaceActivity() throws Exception {
        String pra = b.performRaceActivity();
        assertTrue("performRaceActivity did not contain activity"
                ,pra.contains(raceActivity));
    }

    @Test
    public void testToString() throws Exception {
        b.setRacerId(racerId);
        String bts = b.toString();
        assertTrue("toString does not contain racerId"
                , bts.contains(String.format("%d", racerId)));
        String bc = b.getClass().toString();
        assertTrue("toString does note contain class"
                , bts.contains(bc));
        assertTrue("toString does not contain performRaceActivity"
                , bts.contains(raceActivity));
    }
}