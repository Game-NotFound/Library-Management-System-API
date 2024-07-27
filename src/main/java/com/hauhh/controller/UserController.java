package com.hauhh.controller;

import com.hauhh.entity.User;
import com.hauhh.exception.ApplicationException;
import com.hauhh.response.ResponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController extends BaseController {

    @GetMapping("/user")
    public ResponseData<User> getUser() {
        User user = User.builder()
                .userName("Game")
                .password("123")
                .build();
        return successResponse("Successfully get User with ID: " + user.getUserID(), user);
    }

    @GetMapping("/error")
    public ResponseData<String> getError() {
        try {

        }catch (ApplicationException e) {
            throw e;
        }
        return successResponse("Successfully get error");
    }
}
