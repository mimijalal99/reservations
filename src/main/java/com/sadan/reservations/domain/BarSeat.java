package com.sadan.reservations.domain;


public class BarSeat extends DiningTable {
    public BarSeat(String label, int seats, Zone zone, Position
                position) {

        super(label, seats, zone, position);
        if (seats > 2) {
                throw new IllegalArgumentException("Invalid seat count");
            }

        }

        @Override
        public boolean canSeat(int partySize) {
            int seats = getSeats();
            if (partySize>=1&&partySize<=seats) {
                return true;
            }
            else{

                return false;
            }

        }
    }


