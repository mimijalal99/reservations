package com.sadan.reservations.domain;

public class StandardTable extends DiningTable {
    public StandardTable(String label, int seats, Zone zone, Position
                position) {
            super(label, seats, zone, position);
        }
        @Override
        public boolean canSeat(int partySize){
            int seats = getSeats();
            if(partySize>=1&&partySize<=seats) {
                return true;
            }
            else{
                return false;
            }
        }
    }

