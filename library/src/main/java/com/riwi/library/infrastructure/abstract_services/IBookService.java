package com.riwi.library.infrastructure.abstract_services;

import com.riwi.library.api.dto.requests.BookRequest;
import com.riwi.library.api.dto.response.BookResponse;

public interface IBookService extends CrudService<BookRequest, BookResponse, Long>{

}
