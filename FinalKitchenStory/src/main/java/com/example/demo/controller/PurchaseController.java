package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Purchase;
import com.example.demo.service.PurchaseDao;

@Controller
public class PurchaseController {
	@Autowired
	PurchaseDao p_dao;
	

	@RequestMapping("/purchasep_repo")
	public ModelAndView    purchasep_repo (HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		List<Purchase> list=p_dao.getall();
		mv.addObject("list",list);
		mv.setViewName("purchaselist.jsp");
		return mv;
	}
}

