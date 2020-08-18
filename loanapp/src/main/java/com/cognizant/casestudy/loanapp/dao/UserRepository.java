package com.cognizant.casestudy.loanapp.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.casestudy.loanapp.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

	Optional<Users> findByUserName(String userName);
}
