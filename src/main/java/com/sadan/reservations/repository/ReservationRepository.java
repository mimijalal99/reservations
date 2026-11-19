package com.sadan.reservations.repository;

import com.sadan.reservations.domain.Reservation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ReservationRepository {
    void save(Reservation reservation);
    Optional<Reservation>  findById(String id);
    List<Reservation>  findByDate(LocalDate date);
    void delete(String id);

}
