package com.zeyveli.userInfo.service.abstracts;

import com.zeyveli.userInfo.model.request.UserCreateRequest;
import com.zeyveli.userInfo.model.request.UserUpdateRequest;
import com.zeyveli.userInfo.model.response.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse create(UserCreateRequest userCreateRequest);
    List<UserResponse> getAll();
    UserResponse update(UserUpdateRequest userUpdateRequest);
    void delete(int id);

}
