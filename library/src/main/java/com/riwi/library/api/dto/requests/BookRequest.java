package com.riwi.library.api.dto.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
public class BookRequest {

    @NotBlank(message = "Title is required")
    @Size(
            min = 1,
            max = 100,
            message = "Title must to have between 1 and 100"
    )
    private String title;
    @NotBlank(message = "Author is required")
    @Size(
            min = 1,
            max = 100,
            message = "The author must be between 1 and 100 characters"
    )
    private String author;
    @Min(value = 1)
    @Max(value = 11)
    @NotNull(message = "Publication year is required")
    private Integer publication_year;
    @NotBlank(message = "Genre is required")
    @Size(
            min = 1,
            max = 50,
            message = "The genre must be between 1 and 50 characters"
    )
    private String genre;
    @NotBlank(message = "Isbn is required")
    @Size(
            min = 1,
            max = 20,
            message = "The isbn must be between 1 and 50 characters"
    )
    private String isbn;

}