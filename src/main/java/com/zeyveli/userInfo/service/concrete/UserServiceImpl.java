package com.zeyveli.userInfo.service.concrete;

import com.zeyveli.userInfo.model.entity.User;
import com.zeyveli.userInfo.model.request.UserCreateRequest;
import com.zeyveli.userInfo.model.request.UserUpdateRequest;
import com.zeyveli.userInfo.model.response.UserResponse;
import com.zeyveli.userInfo.repository.UserRepository;
import com.zeyveli.userInfo.service.abstracts.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserResponse create(UserCreateRequest userCreateRequest) {
        User user = modelMapper.map(userCreateRequest, User.class);
        UserResponse userResponse = modelMapper.map(userRepository.saveAndFlush(user), UserResponse.class);
        return userResponse;
    }

    @Override
    public List<UserResponse> getAll() {
        List<User> listUsers = userRepository.findAll();
        List<UserResponse> listUserResponse = null;
        for (User user : listUsers) {
            listUserResponse.add(modelMapper.map(user,UserResponse.class));
        }
        return listUserResponse;
    }

    @Override
    public UserResponse update(UserUpdateRequest userUpdateRequest) {
      Optional<User> userOptional = userRepository.findById(userUpdateRequest.getId());
      User user = userOptional.get();
      user = userRepository.saveAndFlush(user);
      return modelMapper.map(user,UserResponse.class);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
