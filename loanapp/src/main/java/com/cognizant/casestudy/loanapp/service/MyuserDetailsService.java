package com.cognizant.casestudy.loanapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cognizant.casestudy.loanapp.dao.UserRepository;
import com.cognizant.casestudy.loanapp.entity.MyUserDetails;
import com.cognizant.casestudy.loanapp.entity.Users;

@Service
public class MyuserDetailsService
		implements org.springframework.security.core.userdetails.UserDetailsService {


	@Autowired
	UserRepository userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Users> userDetail = userRepo.findByUserName(username);
		
		userDetail.orElseThrow(() -> new UsernameNotFoundException("User Not found " +username));
		
		return userDetail.map(MyUserDetails:: new).get();
		
	}

}
