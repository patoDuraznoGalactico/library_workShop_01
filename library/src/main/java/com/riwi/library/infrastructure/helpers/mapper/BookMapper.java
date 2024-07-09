package com.riwi.library.infrastructure.helpers.mapper;

import com.riwi.library.api.dto.response.BookBasicResponse;
import com.riwi.library.api.dto.response.BookResponse;
import com.riwi.library.api.dto.response.UserBasicResponse;
import com.riwi.library.domain.entities.Book;
import com.riwi.library.domain.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookMapper {

    BookResponse toResponse(Book book);

    Book toEntity(BookResponse bookResponse);

    List<BookBasicResponse> listToResponse(List<Book> books);
}
