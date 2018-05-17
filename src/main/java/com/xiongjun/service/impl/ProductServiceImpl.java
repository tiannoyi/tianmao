package com.xiongjun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiongjun.mapper.ProductMapper;
import com.xiongjun.pojo.Category;
import com.xiongjun.pojo.Product;
import com.xiongjun.pojo.ProductExample;
import com.xiongjun.pojo.ProductImage;
import com.xiongjun.service.CategoryService;
import com.xiongjun.service.ProductImageService;
import com.xiongjun.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	ProductMapper productMapper;
	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductImageService productImageService;
	
	
	@Override
	public void add(Product p) {
		productMapper.insert(p);
	}

	@Override
	public void delete(int id) {
		productMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Product p) {
		productMapper.updateByPrimaryKeySelective(p);
	}

	@Override
	public Product get(int id) {
		Product p = productMapper.selectByPrimaryKey(id);
		setCategory(p);
		return p;
	}
	public void setCategory(List<Product> ps) {
		for (Product product : ps) {
			setCategory(product);
		}
	}
	public void setCategory(Product p) {
		int cid = p.getCid();
		Category c = categoryService.get(cid);
		p.setCategory(c);
	}
	

	@Override
	public List list(int cid) {
		ProductExample example = new ProductExample();
		example.createCriteria().andCidEqualTo(cid);
		example.setOrderByClause("id desc");
		List result = productMapper.selectByExample(example);
		setCategory(result);
		return result;
	}

	@Override
    public void setFirstProductImage(Product p) {
        List<ProductImage> pis = productImageService.list(p.getId(), ProductImageService.type_single);
        if (!pis.isEmpty()) {
            ProductImage pi = pis.get(0);
            p.setFirstProductImage(pi);
        }
    }
 
    public void setFirstProductImage(List<Product> ps) {
        for (Product p : ps) {
            setFirstProductImage(p);
        }
    }

}
