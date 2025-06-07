package com.ms.userService.services;

import com.ms.userService.models.UserModel;
import com.ms.userService.producers.UserProducer;
import com.ms.userService.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    final UserRepository userRepository;
    final UserProducer userProducer;

    public UserService(UserRepository userRepository, UserProducer userProducer) {
        this.userRepository = userRepository;
        this.userProducer = userProducer;
    }

    @Transactional
    public UserModel save(UserModel userModel) {
        userRepository.save(userModel);
        userProducer.publishMessageEmail(userModel);
        return userModel;
    }

}
