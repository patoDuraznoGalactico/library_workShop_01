package com.riwi.library.api.dto.requests;

import java.time.LocalDateTime;


import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanRequest{
    @NotNull(message = "Date and time are required")
    private LocalDateTime loan_date;
    @FutureOrPresent(message = "Date and time have to be in the future")
    @NotNull(message = "Date and time return are required")
    private LocalDateTime return_date;
    @NotNull(message = "Status are required")
    private String status;
    @NotBlank(message = "UserId required")
    private Long userId;
    @NotBlank(message = "BookId required")
    private Long book_id;

}