package com.riwi.library.domain.repositories;

import com.riwi.library.domain.entities.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository  extends JpaRepository<Reservation,Long> {
}
