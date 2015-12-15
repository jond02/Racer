package com.racer.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwimmerTest {

    private Swimmer s;
    private int racerId = 123456;
    private String name = "TestName";
    private int age = 32;
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
        assertNotNull("Default Swimmer could not be created", s);

        Swimmer s2 = new Swimmer(name, age, racerId);
        assertNotNull("Explicit Swimmer could not be created", s2);
        assertEquals("Name not set correctly on s2"
                , name
                , s2.getName());
        assertEquals("Age not set correctly on s2"
                , age
                , s2.getAge());
        assertEquals("RacerID not set correctly on s2"
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
    public void testGetSetName(){
        s.setName(name);
        assertEquals("The name could not be set as expected"
                , name
                , s.getName());
    }

    @Test
    public void testGetSetAge(){
        s.setAge(age);
        assertEquals("The age could not be set as expected"
                , age
                , s.getAge());
    }

    @Test
    public void testPerformRaceActivity() throws Exception {
        String pra = s.performRaceActivity();
        assertTrue("performRaceActivity did not contain activity"
                , pra.contains(raceActivity));
    }

    @Test
    public void testToString() throws Exception {
        s.setRacerId(racerId);
        s.setAge(age);
        s.setName(name);
        String rts = s.toString();

        assertTrue("toString does not contain racerId"
                , rts.contains(String.format("%d", racerId)));
        assertTrue("toString does not contain name"
                , rts.contains(name));
        assertTrue("toString does not contain age"
                , rts.contains(String.format("%d", age)));

        String rc = s.getClass().toString();
        assertTrue("toString does note contain class"
                , rts.contains(rc));
        assertTrue("toString does not contain performRaceActivity"
                , rts.contains(raceActivity));
    }
}