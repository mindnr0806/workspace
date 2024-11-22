package com.kH.lclinic.model.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.kH.lclinic.model.vo.User;

@Mapper
public interface UserMapper {
	
	User loginUser(String id, String password);
	
}
