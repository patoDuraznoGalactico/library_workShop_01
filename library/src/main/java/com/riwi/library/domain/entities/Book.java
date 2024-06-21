package com.riwi.library.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.List;

@Entity(name = "book")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private int publication_year;
    @Column(nullable = false ,length = 50)
    private String genre;
    @Column(nullable = false ,length = 20)
    private String isbn;

    @OneToMany(mappedBy = "book_id",cascade = CascadeType.ALL,orphanRemoval = false,fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "book_id",cascade = CascadeType.ALL,orphanRemoval = false,fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Loan> loans;
}
