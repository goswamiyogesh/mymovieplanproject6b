package com.example.demo.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Admin;
import com.example.demo.model.BankDetails;
import com.example.demo.model.Movie;
import com.example.demo.model.OrderTable;
import com.example.demo.model.Theatre;
import com.example.demo.model.User;
import com.example.demo.service.AdminDAO;
import com.example.demo.service.BankDAO;
import com.example.demo.service.MovieDAO;
import com.example.demo.service.OrderDAO;
import com.example.demo.service.TheatreDAO;
import com.example.demo.service.UserDAO;

@Controller
public class MainController {
	
 @Autowired
	AdminDAO dao;
 @Autowired
 UserDAO udao;
 @Autowired
 MovieDAO mdao;
 @Autowired
 TheatreDAO tdao;
 @Autowired
 private BankDAO bdao;
 @Autowired
 private OrderDAO odao;
 
 private final String FOLDER_PATH="C:\\image\\";
 
 
 @RequestMapping("/")
	public ModelAndView homepage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}
 
 
 //Insert admin
 @RequestMapping("/loginadmin")
	public ModelAndView loginAdmin(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Admin a=new Admin();
		a.setUsername(request.getParameter("usnm"));
		String user=a.getUsername();
		a.setPassword(request.getParameter("pass"));
		String pass=a.getPassword();
		String pass1=dao.getPassword(user);
		if(pass1!=null) {
			if(pass.equals(pass1)) {
				System.out.println(pass);
				mv.setViewName("movie.jsp");
			}
			else {
				String msg="Incorrect password..";
				mv.addObject("msg",msg);
				mv.setViewName("adminlogin1.jsp");
			}
			
		}
		else {
			String msg="Not a registered admin!!Try Again..";
			mv.addObject("msg",msg);
			mv.setViewName("adminlogin1.jsp");
		}
		return mv;
	}
 //update admin password
 @RequestMapping("/updateadmpass")
	public ModelAndView editadpass(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Admin a=new Admin();
		a.setUsername(request.getParameter("usnm"));
		String user=a.getUsername();
		int id=dao.getId(user);
		a.setId(id);
		a.setPassword(request.getParameter("pass"));
		Admin aa=dao.updatePass(a);
		if (aa!=null) {
			String msg="Updated Successfully";
			mv.addObject("msg",msg);
			mv.setViewName("adminlogin1.jsp");
		}
		return mv;		
}
 @RequestMapping("/loginuser")
	public ModelAndView loginUser(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User a=new User();
		a.setUusername(request.getParameter("uusnm"));
		String uuser=a.getUusername();
		a.setUpassword(request.getParameter("upass"));
		String pass=a.getUpassword();
		String pass1=udao.userPwd(uuser);
		String cname=udao.FindtheName(uuser);
		
		if(pass1!=null) {
	
			if(pass.equals(pass1)) {
				String msg="Welcome "+cname+" to nmscinema ..book your favourite movie ";
				mv.addObject("cname",cname);
				mv.addObject("msg",msg);
				mv.setViewName("showmovietouser1.jsp");
			}
			else {
				String msg="Check credential and try again..Incorrect Password!!";
				mv.setViewName("userlogin1.jsp");
				mv.addObject("msg",msg);
			}
		}
		else {
			String msg="Not registered!!Sign Up first!!";
			mv.setViewName("userlogin1.jsp");
			mv.addObject("msg",msg);
		}
		return mv;
}
 @RequestMapping("/insertuser")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User a=new User();
		a.setUname(request.getParameter("uname"));
		a.setEmail(request.getParameter("email"));
		a.setUusername(request.getParameter("uusername"));
		a.setUpassword(request.getParameter("upassword"));
		
		User ap= udao.insert(a);
		if(ap!=null) {
			String msg="SignUp/Login Successful!";
			mv.addObject("msg",msg);
	
		mv.setViewName("userlogin1.jsp");
			}
		return mv;
	}
 @RequestMapping("/deleteuser")
	public ModelAndView dltusr(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User a =new User();
		a.setUid(Integer.parseInt(request.getParameter("uid")));
		String ss=udao.delete(a);
		if(ss!=null) {
			String msg="removed the user successfully";
			mv.addObject("msg",msg);
			mv.setViewName("movie1.jsp");
		}
		return mv;
}
 @RequestMapping("/displayalluser")
	public ModelAndView shwusr(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<User> list=udao.getall();
	mv.setViewName("usernamelist.jsp");
	mv.addObject("list",list);	
		return mv;
	}
 
//update  user password
@RequestMapping("/updateuserpass")
	public ModelAndView edituserpass(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User a=new User();
		a.setUusername(request.getParameter("uusnm"));
		String user=a.getUusername();
		int uid=udao.getUid(user);
		a.setUid(uid);
		a.setUpassword(request.getParameter("upass"));
		User aa=udao.updatePwd(a);
		if (aa!=null) {
			String msg="Updated Successfully";
			mv.addObject("msg",msg);
			mv.setViewName("userlogin1.jsp");
		}
		return mv;		
}
@RequestMapping("/insertmovie")
public ModelAndView insertMovie(@RequestParam("file") MultipartFile file,HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Movie a=new Movie();
	a.setMid(Integer.parseInt(request.getParameter("mid")));
	a.setTitle(request.getParameter("title"));
	a.setLanguage(request.getParameter("language"));
	a.setGenre(request.getParameter("genre"));
	a.setTickets(Integer.parseInt(request.getParameter("tickets")));
	a.setPrice(Integer.parseInt(request.getParameter("price")));
	a.setTime(request.getParameter("time"));
	String fileinfo=FOLDER_PATH+file.getOriginalFilename();
	a.setFile_path(fileinfo);
	
	Movie ap=mdao.insert(a);
	if(ap!=null) {
		String msg="Done!!..Insert a new one?";
		mv.addObject("msg",msg);
		mv.setViewName("movie1.jsp");
	}
	return mv;
}
@RequestMapping("/showmovieadmin")
public ModelAndView displayall(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
List<Movie> list=mdao.getall();
mv.setViewName("showmovietoadmin.jsp");
mv.addObject("list",list);	
	return mv;
}

@RequestMapping("/showmovieuser")
public ModelAndView shwusrMovie(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
List<Movie> list=mdao.getall();

mv.addObject("list",list);

mv.setViewName("showmovietouser.jsp");
	return mv;
}

@RequestMapping("/deleteMovie")
public ModelAndView dltMedicine(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Movie s=new Movie();
	s.setMid(Integer.parseInt(request.getParameter("mid")));
	String ss=mdao.delete(s);
	if(ss!=null) {
		String msg="deleted Successfully";
		mv.addObject("msg",msg);
		mv.setViewName("movie1.jsp");
	}
	return mv;
}
@RequestMapping("/updatemovie")
public ModelAndView update(@RequestParam("file") MultipartFile file,HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Movie s=new Movie();
	s.setMid(Integer.parseInt(request.getParameter("mid")));
	s.setTitle(request.getParameter("title"));
	s.setLanguage(request.getParameter("language"));
	s.setGenre(request.getParameter("genre"));
	s.setTickets(Integer.parseInt(request.getParameter("tickets")));
	s.setPrice(Integer.parseInt(request.getParameter("price")));
	s.setTime(request.getParameter("time"));
	String fileinfo=FOLDER_PATH+file.getOriginalFilename();
	s.setFile_path(fileinfo);
	Movie ss=mdao.update(s);
	if(ss!=null) {
		mv.setViewName("movie1.jsp");
	}
	return mv;
	}

@RequestMapping("/inserttheatre")
public ModelAndView insertTheatre(@RequestParam("file") MultipartFile file,HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
		Theatre a=new Theatre();
		a.setTid(Integer.parseInt(request.getParameter("tid")));
		a.setTname(request.getParameter("tname"));
		a.setTtype(request.getParameter("ttype"));
		a.setAddress(request.getParameter("address"));
		String fileinfo=FOLDER_PATH+file.getOriginalFilename();
		a.setFile_path(fileinfo);
		
		Theatre ap=tdao.Insert(a);
		if(ap!=null) {
			String msg="Done!!..Insert a new one?";
			mv.addObject("msg",msg);
			mv.setViewName("theatre1.jsp");
		}
		return mv; 

}
@RequestMapping("/showtheatreuser")
public ModelAndView shwusrtheatre(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
List<Theatre> list=tdao.getall();
mv.addObject("list",list);

mv.setViewName("showtheatretouser.jsp");
	return mv;
}
@RequestMapping("/proceedpay")
public ModelAndView payment(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	int price=Integer.parseInt(request.getParameter("mprice"));
	BankDetails bd=new BankDetails();
	bd.setBid(Integer.parseInt(request.getParameter("bid")));
	int bid=bd.getBid();
	long balance1=bdao.getBalance(bid);
	int balance=(int)balance1;
	if(balance>price) {
		OrderTable p=new OrderTable();
	p.setMoviename(request.getParameter("mname"));
	p.setMovieprice(request.getParameter("mprice"));
	OrderTable pp=odao.insert(p);
		mv.setViewName("paysuccess.jsp");
	}
		else {
			mv.setViewName("payfail.jsp");
		}
	return mv;
		}
		


@RequestMapping("/orderrepo")
public ModelAndView orderrepo(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	List<OrderTable> list=odao.getall();
	mv.addObject("list",list);
	mv.setViewName("orderlist.jsp");
	return mv;
}
@RequestMapping("/searchmovie")
public ModelAndView  searchmovie(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	String keyword=request.getParameter("keyword");
	List<Movie> list=mdao.findBykeyword(keyword);
	
	mv.addObject("list",list);
	
	mv.setViewName("showmovietouser2.jsp");
	return mv;
}
}