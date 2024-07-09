package com.riwi.library.infrastructure.services;

import com.riwi.library.api.dto.requests.ReservationRequest;
import com.riwi.library.api.dto.response.ReservationResponse;
import com.riwi.library.infrastructure.abstract_services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    @Override
    public ReservationResponse create(ReservationRequest request) {
        return null;
    }

    @Override
    public ReservationResponse get(Long aLong) {
        return null;
    }

    @Override
    public ReservationResponse update(ReservationRequest request, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Page<ReservationResponse> getAll(int page, int size) {
        return null;
    }
}
