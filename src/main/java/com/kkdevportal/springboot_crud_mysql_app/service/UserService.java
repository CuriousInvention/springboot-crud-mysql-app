package com.kkdevportal.springboot_crud_mysql_app.service;

import com.kkdevportal.springboot_crud_mysql_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

}
