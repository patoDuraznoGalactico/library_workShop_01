package com.riwi.library.infrastructure.abstract_services;

import com.riwi.library.api.dto.requests.UserRequest;
import com.riwi.library.api.dto.response.UserResponse;

public interface IUserService extends CrudService<UserRequest, UserResponse, Long>{
}
