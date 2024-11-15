package com.password_manager.password_manager.service.user;

import com.password_manager.password_manager.model.User;
import com.password_manager.password_manager.request.AddUserRequest;

public interface IUserService {
    User addNewUser(AddUserRequest request);
}
