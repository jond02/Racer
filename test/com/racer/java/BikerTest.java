package com.racer.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikerTest extends AthleteTest {

    private Biker b;
    private String raceActivity = "Biking";
    private boolean usesClips = false;

    @Override
    public Athlete getAthlete() {
        return new Biker();
    }

    @Override
    public Athlete getExplicitAthlete() {
        return new Biker(_name, _age, _racerId, usesClips);
    }

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

        super.testConstructors();
        Biker b2 = new Biker(_name, _age, _racerId, usesClips);
        assertNotNull("Explicit Biker could not be created", b2);
        assertEquals("UsesClips not set correctly on b2"
                , usesClips
                , b2.getUsingClips());
    }

    @Test
    public void testGetSetUsingClips(){
        b.setUsingClips(usesClips);
        assertEquals("The clips could not be set as expected"
                , usesClips
                , b.getUsingClips());
    }

    @Test
    public void testPerformRaceActivity() {
        String pra = b.performRaceActivity();
        assertTrue("performRaceActivity did not contain activity"
                , pra.contains(raceActivity));
    }

    @Test
    public void testToString() throws Exception {

        super.testToString();
        b.setRacerId(_racerId);
        b.setAge(_age);
        b.setName(_name);
        b.setUsingClips(usesClips);
        String rts = b.toString();

        assertTrue("toString does not contain clips"
                , rts.contains(String.format("%b", usesClips)));
        String rc = b.getClass().toString();
        assertTrue("toString does note contain class"
                , rts.contains(rc));
        assertTrue("toString does not contain performRaceActivity"
                , rts.contains(raceActivity));
    }
}