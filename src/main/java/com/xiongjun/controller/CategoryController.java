/**
 * 
 */
/**
 * @author Acer
 *
 */
package com.xiongjun.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiongjun.pojo.Category;
import com.xiongjun.service.CategoryService;
import com.xiongjun.util.ImageUtil;
import com.xiongjun.util.Page;
import com.xiongjun.util.UploadedImageFile;

@Controller
@RequestMapping("")
public class CategoryController{
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("admin_category_list")
	public String list(Model model,Page page) {
		//List<Category> cs = categoryService.list(page);
		PageHelper.offsetPage(page.getStart(), page.getCount());
		List<Category> cs = categoryService.list(); //调用list()获取对应分页的数据
		//int total = categoryService.total();
		int total = (int) new PageInfo<>(cs).getTotal();//通过PageInfo获取总数
		page.setTotal(total);
		model.addAttribute("cs",cs);
		model.addAttribute("page",page);
		return "admin/listCategory";
	}
	
	@RequestMapping("admin_category_add")
	public String add(Category c, HttpSession session,UploadedImageFile uploadedImageFile) throws IOException{
		categoryService.add(c);
		File imageFolder = new File(session.getServletContext().getRealPath("img/category"));
		File file = new File(imageFolder,c.getId()+".jpg");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		uploadedImageFile.getImage().transferTo(file);
		BufferedImage img = ImageUtil.change2jpg(file);
		ImageIO.write(img, "jpg", file);
		return "redirect:/admin_category_list";	
	}
	
	@RequestMapping("admin_category_delete")
	public String delete(int id ,HttpSession session) throws IOException{
		categoryService.delete(id);
		
		File imageFolder = new File(session.getServletContext().getRealPath("img/category"));
		File file = new File(imageFolder,id+".jsp");
		file.delete();
		return "redirect:/admin_category_list";
	}
	
	
	@RequestMapping("admin_category_edit")
	public String edit(int id,Model model) throws IOException{
		Category c = categoryService.get(id);
		model.addAttribute("c",c);
		return "admin/editCategory";
	}
	
	@RequestMapping("admin_category_update")
	public String update(Category c,HttpSession session ,UploadedImageFile uploadedImageFile) throws IOException{
		categoryService.update(c);
		MultipartFile image = uploadedImageFile.getImage();
		if(image != null && !image.isEmpty()) {
			File imageFolder = new File(session.getServletContext().getRealPath("img/category"));
			File file = new File(imageFolder,c.getId()+".jpg");
			image.transferTo(file);
			BufferedImage img = ImageUtil.change2jpg(file);
			ImageIO.write(img, "jpg", file);
		}
		return "redirect:/admin_category_list";
	}
	
}