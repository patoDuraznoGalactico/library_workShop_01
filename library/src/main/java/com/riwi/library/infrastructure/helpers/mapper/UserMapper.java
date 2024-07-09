package com.riwi.library.infrastructure.helpers.mapper;

import com.riwi.library.api.dto.requests.UserRequest;
import com.riwi.library.api.dto.response.UserBasicResponse;
import com.riwi.library.api.dto.response.UserResponse;
import com.riwi.library.domain.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    User toEntity(UserRequest request);

    UserResponse toResponse(User user);

    List<UserBasicResponse> listToResponse(List<User> users);

    

}
