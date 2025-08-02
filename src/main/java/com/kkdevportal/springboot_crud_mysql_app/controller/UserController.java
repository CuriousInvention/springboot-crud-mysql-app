package com.kkdevportal.springboot_crud_mysql_app.controller;

import com.kkdevportal.springboot_crud_mysql_app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/v1/")
public class UserController {
    @Value(("${DEFAULT_ROLE}"))
    String DEFAULT_ROLE;

    @Autowired
    UserService userService;

    // post save user

    // get fetch all user

    // get fetch user using query param (username, email, userId, role)

    // patch update user detail

    // delete user


}
