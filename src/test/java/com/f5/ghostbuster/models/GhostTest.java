package com.f5.ghostbuster.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;

public class GhostTest {

        private Ghost ghost;
        private String name;
        private Ghost.Class ghostClass;
        private Ghost.DangerLevel dangerLevel;
        private String ability;

        @BeforeEach
        public void setUp() {
            name = "Espíritu del Pescador de Lastres";
            ghostClass = Ghost.Class.IV;
            dangerLevel = Ghost.DangerLevel.ALTO;
            ability = "Aparecer durante tormentas en la costa";
            ghost = new Ghost(name, ghostClass, dangerLevel, ability);
        }
    @Test
    @DisplayName("Initializing correctly ghost name")
    public void testInitialCorrectlyGhostName() {
        
        //Given
        String name = "Espíritu del Pescador de Lastres";
        Ghost ghost = new Ghost(name, Ghost.Class.IV, Ghost.DangerLevel.ALTO, "Aparecer durante tormentas en la costa");

        //Then
        assertThat(ghost.getName(), is(name));
    }
    
    @Test
    @DisplayName("Initializing correctly ability of ghost")
    public void testInitialCorrectlyGhostAbility(){
        
        //Then
        assertThat(ghost.getAbility(), is(ability));
    }

    @Test
    @DisplayName("Initializing correctly ghost class")

    public void testInitialCorrectlyGhostClass() {
        
        //Then
        assertThat(ghost.getGhostClass(), is(ghostClass));
    }

    @Test
    @DisplayName("Initializing correctly ghost danger level")
    public void testInitialCorrectlyGhostDangerLevel() {
        
        //Then
        assertThat(ghost.getDangerLevel(), is(dangerLevel));
    }

    @Test
    @DisplayName("Correctly initialize the date of capture of the ghost")
    public void testCorrectlyInitializeDateOfCapture() {
        
        //Then
        assertThat(ghost.getDateOfCapture(), is(notNullValue()));
    }

    @Test
    @DisplayName("The ghost's ID is greater than zero")
    public void testGhostIdGreaterThanZero() {
        
        //Then
        assertThat(ghost.getId(), is(not(0)));
    }

    @Test
    @DisplayName("Every Ghost has a different ID")
    public void testEveryGhostHasDifferentId() {
        
        //Given
        Ghost anotherGhost = new Ghost("Espíritu del Pescador de Lastres", Ghost.Class.IV, Ghost.DangerLevel.ALTO, "Aparecer durante tormentas en la costa");

        //Then
        assertThat(ghost.getId(), is(not(anotherGhost.getId())));
    }
}
