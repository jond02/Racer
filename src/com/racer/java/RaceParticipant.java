package com.racer.java;

public interface RaceParticipant {

    /**
     *Set the racer ID
     *@param int racerId is the id for the racer
     */
    void setRacerId(int racerId);

    /**
     * get the racer ID
     */

    int getRacerId();

    /**
     * Perform the racing activity
     * @return String the race activity being performed
     */

    String performRaceActivity();
}
