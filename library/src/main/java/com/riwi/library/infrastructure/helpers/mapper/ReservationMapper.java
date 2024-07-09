package com.riwi.library.infrastructure.helpers.mapper;

import com.riwi.library.api.dto.response.BookBasicResponse;
import com.riwi.library.api.dto.response.BookResponse;
import com.riwi.library.api.dto.response.ReservationBasicResponse;
import com.riwi.library.api.dto.response.ReservationResponse;
import com.riwi.library.domain.entities.Book;
import com.riwi.library.domain.entities.Reservation;

import java.util.List;

public interface ReservationMapper {
    ReservationResponse toResponse(Reservation reservation);

    Reservation toEntity(ReservationResponse reservationResponse);

    List<ReservationBasicResponse> listToResponse(List<Reservation> reservations);
}
