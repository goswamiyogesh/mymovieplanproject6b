package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerDao;

@Controller
public class CustomerController {
	@Autowired
	CustomerDao c_dao;
	
	@RequestMapping("/insertcustomer")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Customer a=new Customer();
		a.setF_name(request.getParameter("fname"));
		a.setL_name(request.getParameter("lname"));
		a.setDOB(request.getParameter("dob"));
		a.setUsername(request.getParameter("usnm"));
		a.setPassword(request.getParameter("pass"));

		Customer ap= c_dao.insert(a);
		if(ap!=null) {
			String s="SignUp/Login Successful!";
			mv.addObject("s",s);
	
		mv.setViewName("showfoodcustomer.jsp");
			}
		return mv;
	}
	
	@RequestMapping("/logincustomer")
	public ModelAndView loginControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Customer a=new Customer();
		a.setUsername(request.getParameter("usnm"));
		String username=a.getUsername();
		a.setPassword(request.getParameter("pass"));
		String pass=a.getPassword();
		String pass1=c_dao.ifExists(username);
		
		
		if(pass1!=null) {
	
			if(pass.equals(pass1)) {
				String s="Sign Up/Login Successful!";
				mv.addObject("username",username);
				mv.addObject("s",s);
				mv.setViewName("showfoodcustomer.jsp");
			}
			else {
				String q="Incorrect Password!!";
				mv.setViewName("customerlogin1.jsp");
				mv.addObject("msg",q);
			}
		}
		else {
			String q="Sign Up first!!";
			mv.setViewName("customerlogin1.jsp");
			mv.addObject("msg",q);
		}
		return mv;
	}
	
	@RequestMapping("/displayallcustomer")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Customer> list=c_dao.getall();
	mv.setViewName("displaycustomertoadmin.jsp");
	mv.addObject("list",list);	
		return mv;
	}
	
}
