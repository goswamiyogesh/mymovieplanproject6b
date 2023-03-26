package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.FoodItem;
import com.example.demo.service.FoodItemDao;
@Controller
public class FoodItemController {
@Autowired 
	FoodItemDao fd_dao;
	
	
	
	@RequestMapping("/insertFooditem")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		FoodItem a=new FoodItem();
		a.setFd_id(Integer.parseInt(request.getParameter("fdid")));
		a.setName(request.getParameter("name"));
		a.setPrice(Integer.parseInt(request.getParameter("price")));
		
		FoodItem ap=fd_dao.insert(a);
		if(ap!=null) {
			mv.setViewName("success.jsp");
		}
	
		return mv;
	}
	@RequestMapping("/showfooditemadmin")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<FoodItem> list=fd_dao.getall();
	mv.setViewName("displayfdadmin.jsp");
	mv.addObject("list",list);	
		return mv;
	}
	
	
	@RequestMapping("/deletefooditem")
	public ModelAndView dlt(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		FoodItem s=new FoodItem();
		s.setFd_id(Integer.parseInt(request.getParameter("fdid")));
		String ss=fd_dao.delete(s);
		if(ss!=null) {
			mv.setViewName("success.jsp");
		}
		return mv;
	}
	
	
	@RequestMapping("/displayfooditemcustomer")
	public ModelAndView dispUser(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<FoodItem> list=fd_dao.getall();
	
	mv.setViewName("displaycustomer.jsp");

	mv.addObject("list",list);	
		return mv;
	}

	@RequestMapping("/editfooditem")
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		FoodItem s=new FoodItem();
		s.setFd_id(Integer.parseInt(request.getParameter("fdid")));
		s.setName(request.getParameter("name"));
		s.setPrice(Integer.parseInt(request.getParameter("price")));
		FoodItem ss=fd_dao.updateByName(s);
		if(ss!=null) {
			mv.setViewName("success.jsp");
		}
		return mv;
		}

	@RequestMapping("/searchfooditem")
    public ModelAndView  searchFoodItem(@Param("keyword") String  keyword,HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		List<FoodItem> list=fd_dao.listAll(keyword);
		mv.setViewName("showfoodcustomer.jsp");
		mv.addObject("list",list);	
		mv.addObject("keyword",keyword);	
		return mv;
}
}


