package com.xiongjun.service;

import java.util.List;

import com.xiongjun.pojo.User;

public interface UserService {
	
	void add(User u);
	
	void delete(int id);
	
	void update(User u);
	
	User get(int id);
	
	List list();

}
