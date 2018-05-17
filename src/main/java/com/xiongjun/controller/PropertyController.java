package com.xiongjun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.xiongjun.pojo.Category;
import com.xiongjun.pojo.Property;
import com.xiongjun.service.CategoryService;
import com.xiongjun.service.PropertyService;
import com.xiongjun.util.Page;

@Controller
@RequestMapping("")
public class PropertyController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	PropertyService propertyService;
	
	
	@RequestMapping("admin_property_add")
	public String add(Model model,Property p) {
		propertyService.add(p);
		return "redirect:admin_property_list?cid="+p.getCid();
	}
	
	@RequestMapping("admin_property_delete")
	public String delete(int id) {
		Property p = propertyService.get(id);
		propertyService.delete(id);
		return "redirect:admin_property_list?cid="+p.getCid();
	}
	
	@RequestMapping("admin_property_edit")
	public String edit(Model model,int id) {
		Property p = propertyService.get(id);
		Category c = categoryService.get(p.getCid());
		p.setCategory(c);
		model.addAttribute("p",p);
		return "admin/editProperty";
	}
	
	
	@RequestMapping("admin_property_update")
	public String update(Property p) {
		propertyService.update(p);
		return "redirect:admin_property_list?cid="+p.getCid();
	}
	
	@RequestMapping("admin_property_list")
	public String list(int cid,Model model,Page page) {
		Category c = categoryService.get(cid);
		List<Property> ps = propertyService.list(cid);
		
		int total = (int) new PageInfo<>(ps).getTotal();
		page.setParam("&cid="+c.getId());
		
		model.addAttribute("ps",ps);
		model.addAttribute("c",c);
		model.addAttribute("page",page);
		return "admin/listProperty";
	}

}
