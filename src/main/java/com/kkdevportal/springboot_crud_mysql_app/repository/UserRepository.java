package com.kkdevportal.springboot_crud_mysql_app.repository;

import com.kkdevportal.springboot_crud_mysql_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, String> {

}
