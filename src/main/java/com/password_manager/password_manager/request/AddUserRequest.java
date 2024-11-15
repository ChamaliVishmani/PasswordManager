package com.password_manager.password_manager.request;

import lombok.Data;

@Data
public class AddUserRequest {
    private String userName;
    private String password;
}
