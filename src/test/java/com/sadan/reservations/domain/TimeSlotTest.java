package com.sadan.reservations.domain;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class TimeSlotTest {
    @Test
            void overlappingSlotsOverlap() {
        TimeSlot a = new TimeSlot(LocalDateTime.of(2026, 11, 20, 19, 0), LocalDateTime.of(2026, 11, 20, 21, 0));
        TimeSlot b = new TimeSlot(LocalDateTime.of(2026, 11, 20, 20, 0), LocalDateTime.of(2026, 11, 20, 22, 0));
        assertTrue(a.overlaps(b));
    }
    @Test
            void touchingSlotsDoNotOverlap(){
        TimeSlot c= new TimeSlot(LocalDateTime.of(2026,11,20,19,0),LocalDateTime.of(2026,11,20,21,0));
        TimeSlot d= new TimeSlot(LocalDateTime.of(2026,11,20,21,0),LocalDateTime.of(2026,11,20,22,0));
        assertFalse(c.overlaps(d));
    }
    @Test
    void SlotInsideAnotherOverlaps() {
        TimeSlot a = new TimeSlot(LocalDateTime.of(2026, 11, 20, 19, 0), LocalDateTime.of(2026, 11, 20, 21, 0));
        TimeSlot b = new TimeSlot(LocalDateTime.of(2026, 11, 20, 19, 30), LocalDateTime.of(2026, 11, 20, 20, 30));
        assertTrue(a.overlaps(b));
    }
    @Test
    void separateSlotsDoNotOverLap() {
        TimeSlot a = new TimeSlot(LocalDateTime.of(2026, 11, 20, 19, 0), LocalDateTime.of(2026, 11, 20, 21, 0));
        TimeSlot b = new TimeSlot(LocalDateTime.of(2026, 11, 20, 5, 0), LocalDateTime.of(2026, 11, 20, 7, 0));
        assertFalse(a.overlaps(b));
    }
    @Test
    void identicalSlotsOverlap() {
        TimeSlot a = new TimeSlot(LocalDateTime.of(2026, 11, 20, 19, 0), LocalDateTime.of(2026, 11, 20, 21, 0));
        TimeSlot b = new TimeSlot(LocalDateTime.of(2026, 11, 20, 19, 0), LocalDateTime.of(2026, 11, 20, 21, 0));
        assertTrue(a.overlaps(b));
    }
}