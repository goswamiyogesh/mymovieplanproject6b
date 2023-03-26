package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	@Query("select u.upassword from User u where u.uusername=?1")
	public String userPwd(String uusername);

	@Query("select u.uid from User u where u.uusername=?1")
	public int getUid(String uusername);

	@Query("select u.uname from User u where u.uusername=?1")
	public String findNameByname(String uusername);
}
