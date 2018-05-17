package com.xiongjun.service;

import java.util.List;

import com.xiongjun.pojo.Property;

public interface PropertyService {
	void add(Property p);
	void delete(int id);
	void update(Property p);
	Property get(int id);
	List list(int cid);
}
