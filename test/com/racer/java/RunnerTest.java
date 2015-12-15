package com.racer.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {

    private Runner r;
    private int racerId = 123456;
    private String name = "TestName";
    private int age = 32;
    private String raceActivity = "Running";
    private String shoes = "Any shoe brand";

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

        Runner r2 = new Runner(name, age, racerId, shoes);
        assertNotNull("Explicit Runner could not be created", r2);
        assertEquals("Name not set correctly on R2"
                        , name
                        , r2.getName());
        assertEquals("Age not set correctly on R2"
                , age
                , r2.getAge());
        assertEquals("RacerID not set correctly on R2"
                , racerId
                , r2.getRacerId());
        assertEquals("Shoes not set correctly on R2"
                , shoes
                , r2.getShoeBrand());
    }

    @Test
    public void testGetSetRacerId() throws Exception {
        r.setRacerId(racerId);
        assertEquals("The racerId could not be set as expected"
                        , racerId
                        , r.getRacerId());
    }

    @Test
    public void testGetSetName(){
        r.setName(name);
        assertEquals("The name could not be set as expected"
                , name
                , r.getName());
    }

    @Test
    public void testGetSetAge(){
        r.setAge(age);
        assertEquals("The age could not be set as expected"
                , age
                , r.getAge());
    }

    @Test
    public void testGetSetShoeBrand(){
        r.setShoeBrand(shoes);
        assertEquals("The shoe brand could not be set as expected"
                , shoes
                , r.getShoeBrand());
    }

    @Test
    public void testPerformRaceActivity() throws Exception {
        String pra = r.performRaceActivity();
        assertTrue("performRaceActivity did not contain activity"
                        , pra.contains(raceActivity));
    }

    @Test
    public void testToString() throws Exception {
        r.setRacerId(racerId);
        r.setAge(age);
        r.setName(name);
        r.setShoeBrand(shoes);
        String rts = r.toString();

        assertTrue("toString does not contain racerId"
                    , rts.contains(String.format("%d", racerId)));
        assertTrue("toString does not contain name"
                , rts.contains(name));
        assertTrue("toString does not contain age"
                , rts.contains(String.format("%d", age)));
        assertTrue("toString does not contain shoes"
                , rts.contains(shoes));
        String rc = r.getClass().toString();
        assertTrue("toString does note contain class"
                    , rts.contains(rc));
        assertTrue("toString does not contain performRaceActivity"
                    , rts.contains(raceActivity));
    }
}