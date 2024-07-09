package com.riwi.library.api.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {

    private Long id;
    private String title;
    private String author;
    private int publication_year;
    private String genre;
    private String isbn;
    private List<ReservationBasicResponse> reservations;
    private List<LoanBasicResponse> loans;
}
