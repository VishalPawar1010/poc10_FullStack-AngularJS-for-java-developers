package com.growthMindset.UserResgisterySystem.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.growthMindset.UserResgisterySystem.dao.UserRepo;
import com.growthMindset.UserResgisterySystem.dto.User;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/user")
public class UserController {
	
	public static final Logger logger =
            (Logger) LoggerFactory.getLogger(UserController.class);
	
    private UserRepo userRepo;
    
    @Autowired
    public void setUserJpaRepository(UserRepo userRepo) {
            this.userRepo = userRepo;
            
            
}
    @GetMapping("/")
    public ResponseEntity<List<User>> listAllUsers() {
            List<User> users = userRepo.findAll();
            return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> createUser(@RequestBody final User user) {
    	userRepo.save(user);
            return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }

}
