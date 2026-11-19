package com.sadan.reservations.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoothTableTest {

    @Test
    void rejectsPartyOf2(){
        BoothTable b = new BoothTable("B1", 6, Zone.WINDOW, new Position(2, 1));
        assertFalse(b.canSeat(2));


    }

    @Test
    void acceptsPartyOf3(){
        BoothTable b = new BoothTable("B1", 6, Zone.WINDOW, new Position(2, 1));
        assertTrue(b.canSeat(3));
    }





}
