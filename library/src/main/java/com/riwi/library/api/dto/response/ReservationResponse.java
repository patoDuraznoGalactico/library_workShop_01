package com.riwi.library.api.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationResponse {
    private Long id;
    private LocalDateTime reservation_date;
    private String status;
    private UserBasicResponse user;
    private BookBasicResponse book;
}
