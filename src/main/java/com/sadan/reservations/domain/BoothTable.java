package com.sadan.reservations.domain;

public class BoothTable extends DiningTable {
    public BoothTable(String label, int seats, Zone zone, Position
                position) {

        super(label, seats, zone, position);
        }


    @Override
    public boolean canSeat(int partySize) {


        int seats = getSeats();
        if (partySize >= 3 && partySize <= seats) {

            return true;
            }
        else {
            return false;
            }

        }
    }



