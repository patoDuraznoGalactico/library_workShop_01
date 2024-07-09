package com.riwi.library.infrastructure.services;

import com.riwi.library.api.dto.requests.UserRequest;
import com.riwi.library.api.dto.response.UserResponse;
import com.riwi.library.domain.entities.User;
import com.riwi.library.domain.repositories.UserRepository;
import com.riwi.library.infrastructure.abstract_services.IUserService;
import com.riwi.library.infrastructure.helpers.mapper.UserMapper;
import com.riwi.library.utils.exceptions.IdNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class UserService implements IUserService{

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final UserMapper userMapper;


    @Override
    public UserResponse create(UserRequest request) {
        User user = this.userMapper.toEntity(request);
        user.setReservations(new ArrayList<>());
        user.setLoans(new ArrayList<>());
        user = this.userRepository.save(user);


        System.out.println("esto es user " + user);
        return this.userMapper.toResponse(user);
    }

    @Override
    public UserResponse get(Long aLong) {
        return null;
    }

    @Override
    public UserResponse update(UserRequest request, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    public User find(Long id){
        return this.userRepository.findById(id).orElseThrow(()-> new IdNotFoundException("User"));
    }

    @Override
    public Page<UserResponse> getAll(int page, int size) {
        return null;
    }
}
