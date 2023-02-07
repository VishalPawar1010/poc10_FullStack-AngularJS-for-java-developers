package com.growthMindset.UserResgisterySystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.growthMindset.UserResgisterySystem.dto.User;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByName(String name);

}
