package com.kH.lclinic.service;

import org.springframework.stereotype.Service;

import com.kH.lclinic.model.mapper.UserMapper;
import com.kH.lclinic.model.vo.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserMapper mapper;
	
	public User loginUser(User user) {
		return mapper.loginUser(user.getId(), user.getPassword());
	}
}
