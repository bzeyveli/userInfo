package com.zeyveli.userInfo.controller;

import com.zeyveli.userInfo.model.request.UserCreateRequest;
import com.zeyveli.userInfo.model.request.UserUpdateRequest;
import com.zeyveli.userInfo.model.response.UserResponse;
import com.zeyveli.userInfo.service.concrete.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    UserServiceImpl userServiceImpl;

    @Autowired
    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse create(@RequestBody UserCreateRequest userCreateRequest){
       UserResponse userResponse = userServiceImpl.create(userCreateRequest);
       return userResponse;
    }

    @GetMapping
    public List<UserResponse> getAll(){
        List<UserResponse> list = userServiceImpl.getAll();
        return list;
    }

    @PutMapping
    public UserResponse update(@RequestBody UserUpdateRequest userUpdateRequest){
        return userServiceImpl.update(userUpdateRequest);
    }

    @DeleteMapping
    public void delete(int id){
        userServiceImpl.delete(id);
    }
}
