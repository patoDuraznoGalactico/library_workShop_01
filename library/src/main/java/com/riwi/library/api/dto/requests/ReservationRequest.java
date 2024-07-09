package com.riwi.library.api.dto.requests;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {
    @FutureOrPresent(message = "Date and time have to be in the future")
    @NotNull(message = "Date and time id required")
    private LocalDateTime reservation_date;
    @NotBlank(message = "Stutus is required")
    @Size(
            min = 1,
            max = 20,
            message = "Status must to have between 1 and 20"
    )
    private String status;
    @NotBlank(message = "Required User id!")
    private Long userId;
    @NotBlank(message = "Required Book id!")
    private Long bookId;
}
