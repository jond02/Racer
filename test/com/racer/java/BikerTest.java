package com.racer.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikerTest {

    private Biker b;
    private int racerId = 123456;
    private String name = "TestName";
    private int age = 32;
    private String raceActivity = "Biking";
    private boolean usesClips = false;

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
        assertNotNull("Default Biker could not be created", b);

        Biker b2 = new Biker(name, age, racerId, usesClips);
        assertNotNull("Explicit Biker could not be created", b2);
        assertEquals("Name not set correctly on b2"
                , name
                , b2.getName());
        assertEquals("Age not set correctly on b2"
                , age
                , b2.getAge());
        assertEquals("RacerID not set correctly on b2"
                , racerId
                , b2.getRacerId());
        assertEquals("UsesClips not set correctly on b2"
                , usesClips
                , b2.getUsingClips());
    }

    @Test
    public void testGetSetRacerId() throws Exception {
        b.setRacerId(racerId);
        assertEquals("The racerId could not be set as expected"
                , racerId
                , b.getRacerId());
    }

    @Test
    public void testGetSetName(){
        b.setName(name);
        assertEquals("The name could not be set as expected"
                , name
                , b.getName());
    }

    @Test
    public void testGetSetAge(){
        b.setAge(age);
        assertEquals("The age could not be set as expected"
                , age
                , b.getAge());
    }

    @Test
    public void testGetSetUsingClips(){
        b.setUsingClips(usesClips);
        assertEquals("The clips could not be set as expected"
                , usesClips
                , b.getUsingClips());
    }

    @Test
    public void testPerformRaceActivity() throws Exception {
        String pra = b.performRaceActivity();
        assertTrue("performRaceActivity did not contain activity"
                , pra.contains(raceActivity));
    }

    @Test
    public void testToString() throws Exception {
        b.setRacerId(racerId);
        b.setAge(age);
        b.setName(name);
        b.setUsingClips(usesClips);
        String rts = b.toString();

        assertTrue("toString does not contain racerId"
                , rts.contains(String.format("%d", racerId)));
        assertTrue("toString does not contain name"
                , rts.contains(name));
        assertTrue("toString does not contain age"
                , rts.contains(String.format("%d", age)));
        assertTrue("toString does not contain clips"
                , rts.contains(String.format("%b", usesClips)));

        String rc = b.getClass().toString();
        assertTrue("toString does note contain class"
                , rts.contains(rc));
        assertTrue("toString does not contain performRaceActivity"
                , rts.contains(raceActivity));
    }
}