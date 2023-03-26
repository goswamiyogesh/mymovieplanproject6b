package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.BankDetails;
import com.example.demo.entity.FoodItem;
import com.example.demo.entity.Purchase;
import com.example.demo.service.BankDetailsDao;
import com.example.demo.service.CustomerDao;

@Controller
public class BankdetailsController {
	@Autowired
    BankDetailsDao bk_dao;
	@Autowired
	CustomerDao c_dao;
	@RequestMapping("/proceedpay")
	public ModelAndView payment(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		FoodItem a=new FoodItem();
		a.setPrice(Integer.parseInt(request.getParameter("price")));
		int pr1=a.getPrice();
		long pr=(long) pr1;
		System.out.println(pr);
		BankDetails bd=new BankDetails();
		bd.setB_id(Integer.parseInt(request.getParameter("bid")));
		int bid=bd.getB_id();
		BankDetails bb=bk_dao.findRow(bid);
		long balance=bb.getBalance();
		
		
		if(pr<balance) {
			
			mv.setViewName("paysuccess.jsp");
		}
		else {
			mv.setViewName("payfail.jsp");
		}
		return mv;
	}
}
