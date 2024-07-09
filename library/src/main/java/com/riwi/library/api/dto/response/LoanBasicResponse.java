package com.riwi.library.api.dto.response;

import com.riwi.library.domain.entities.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanBasicResponse {
        private Long id;
        private LocalDateTime loan_date;
        private LocalDateTime return_date;
        private String status;
}
