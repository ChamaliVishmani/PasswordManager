package com.password_manager.password_manager.controller;

import com.password_manager.password_manager.model.User;
import com.password_manager.password_manager.request.AddUserRequest;
import com.password_manager.password_manager.response.ApiResponse;
import com.password_manager.password_manager.service.user.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CONFLICT;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/users")
public class UserController {
    private final IUserService userService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addUser(@RequestBody AddUserRequest request){
        try {
            User user = userService.addNewUser(request);
            return ResponseEntity.ok(new ApiResponse("Add user success!",user));
        } catch (Exception e) {
            return ResponseEntity.status(CONFLICT)
                    .body(new ApiResponse(e.getMessage(),null));
        }
    }

}
