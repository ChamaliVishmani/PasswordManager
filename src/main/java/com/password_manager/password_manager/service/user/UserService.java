package com.password_manager.password_manager.service.user;

import com.password_manager.password_manager.exceptions.AlreadyExistsException;
import com.password_manager.password_manager.model.User;
import com.password_manager.password_manager.repository.UserRepository;
import com.password_manager.password_manager.request.AddUserRequest;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{
    private final UserRepository userRepository;

    Logger logger = LoggerFactory.getLogger(UserService.class);

    @Override
    public User addNewUser(AddUserRequest request) {
        User user = userRepository.findByUserName(request.getUserName());
        if(user!= null){
            throw new AlreadyExistsException("User already exists!");
        }
        User newUser = new User(request.getUserName(),request.getPassword());
        newUser = userRepository.save(newUser);
        logger.info("User added successfully");
        return newUser;
    }
}
