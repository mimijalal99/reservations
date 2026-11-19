package com.sadan.reservations.domain;
import java.time.LocalDateTime;
public record TimeSlot(LocalDateTime start, LocalDateTime end) {
    public TimeSlot {
        if (!start.isBefore(end)) {
            throw new IllegalArgumentException("the start must be before the end");
        }
    }
    public boolean overlaps(TimeSlot other){
        return start.isBefore(other.end()) && end.isAfter(other.start());
    }
}
