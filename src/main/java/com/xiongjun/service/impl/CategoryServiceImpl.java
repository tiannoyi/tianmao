/**
 * 
 */
/**
 * @author Acer
 *
 */
package com.xiongjun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiongjun.mapper.CategoryMapper;
import com.xiongjun.pojo.Category;
import com.xiongjun.pojo.CategoryExample;
import com.xiongjun.service.CategoryService;
import com.xiongjun.util.Page;


@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryMapper categoryMapper;
	
	/*@Override
	public List<Category> list(Page page) {
		return categoryMapper.list(page);
	}

	@Override
	public int total() {
		
		return categoryMapper.total();
	}*/
	
	@Override
	public List<Category> list(){
		CategoryExample example = new CategoryExample();
		example.setOrderByClause("id desc");
		return categoryMapper.selectByExample(example);
	}

	@Override
	public void add(Category category) {
		categoryMapper.insert(category);
	}

	@Override
	public void delete(int id) {
		categoryMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Category get(int id) {
		
		return categoryMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(Category category) {
		categoryMapper.updateByPrimaryKeySelective(category);
	}
	
	
	
}
