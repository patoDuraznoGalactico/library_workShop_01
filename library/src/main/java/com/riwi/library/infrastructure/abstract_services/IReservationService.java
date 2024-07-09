package com.riwi.library.infrastructure.abstract_services;

import com.riwi.library.api.dto.requests.ReservationRequest;
import com.riwi.library.api.dto.response.ReservationResponse;

public interface IReservationService extends CrudService<ReservationRequest, ReservationResponse, Long>{
}
