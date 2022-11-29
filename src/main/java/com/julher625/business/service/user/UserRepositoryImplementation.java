package com.julher625.business.service.user;

import com.julher625.business.models.user.User;
import com.julher625.business.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepositoryImplementation {

    @Autowired
    private UserRepository userRepository;

    private List<User> getAll(){
        return (List<User>) userRepository.findAll();
    }

}
