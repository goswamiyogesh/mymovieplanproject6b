package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserDAO {
@Autowired
	UserRepo urepo;
//inset user
public User insert(User a) {
	return urepo.save(a);
}
// get list of user
public List<User> getall(){
	return urepo.findAll();
}
//user get by id
public int getUid(String uusername) {
return urepo.getUid(uusername);
}
// delete user
public String delete(User a) {
	urepo.delete(a);
	return "deleted";
}

//find username  by name
public String FindtheName(String uusername) {
	return urepo.findNameByname(uusername);
	
	
}
// find password by username
public String userPwd(String uusername) {
	return urepo.userPwd(uusername);
}
//update password
public User updatePwd(User a) {
	User aa=urepo.findById(a.getUid()).orElse(null);
	aa.setUpassword(a.getUpassword());
	return urepo.save(aa);
}
}
