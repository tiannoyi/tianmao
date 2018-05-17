package com.xiongjun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiongjun.mapper.UserMapper;
import com.xiongjun.pojo.User;
import com.xiongjun.pojo.UserExample;
import com.xiongjun.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public void add(User u) {
		userMapper.insert(u);
	}

	@Override
	public void delete(int id) {
		userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(User u) {
		userMapper.updateByPrimaryKeySelective(u);
	}

	@Override
	public User get(int id) {
		
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List list() {
		UserExample example = new UserExample();
		example.setOrderByClause("id desc");
		return userMapper.selectByExample(example);
	}

}
