package com.riwi.library.infrastructure.services;

import com.riwi.library.api.dto.requests.BookRequest;
import com.riwi.library.api.dto.response.BookResponse;
import com.riwi.library.api.dto.response.LoanBasicResponse;
import com.riwi.library.api.dto.response.ReservationBasicResponse;
import com.riwi.library.domain.entities.Book;
import com.riwi.library.domain.repositories.BookRepository;
import com.riwi.library.infrastructure.abstract_services.IBookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class BookService implements IBookService {

    @Autowired
    private final BookRepository bookRepository;

    @Override
    public BookResponse create(BookRequest request) {

        Book book = this.requestToEntity(request);
        return this.entityToResp(this.bookRepository.save(book));
    }

    @Override
    public BookResponse get(Long aLong) {

        return this.entityToResp(this.find(aLong));
    }

    @Override
    public BookResponse update(BookRequest request, Long aLong) {

        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Page<BookResponse> getAll(int page, int size) {
        return null;
    }

    private BookResponse entityToResp(Book entity){
        BookResponse bookResponse = new BookResponse();
        BeanUtils.copyProperties(entity,bookResponse);

        List<ReservationBasicResponse> reservationBasicList = new ArrayList<>();
        List<LoanBasicResponse> loanBasiclist = new ArrayList<>();
        bookResponse.setLoans(loanBasiclist);
        bookResponse.setReservations(reservationBasicList);
        return bookResponse;
    }

    private Book requestToEntity(BookRequest request){
        Book book = new Book();
        BeanUtils.copyProperties(request,book);
        return book;
    }

    private Book find(Long id){
        return this.bookRepository.findById(id)
                .orElseThrow(()-> new BadRequestException("Book"));
    }
}
