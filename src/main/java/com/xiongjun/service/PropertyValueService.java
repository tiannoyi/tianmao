package com.xiongjun.service;

import java.util.List;

import com.xiongjun.pojo.Product;
import com.xiongjun.pojo.PropertyValue;

public interface PropertyValueService {

	void init(Product p);
	void update(PropertyValue pv);
	
	PropertyValue get(int ptid,int pid);
	List<PropertyValue> list(int pid);
}
