package com.shopnow.dao;

import java.util.List;

import com.shopnow.model.User;


public interface UserDao
{
	boolean insertUser(User u);

	boolean deleteUserById(int userid);

	boolean updateUser(User u);

	List<User> getAllUsers();

	User getUserById(int userid);
	
	User getUserByNameAndPassword(String name,String password);


	List <User> getUserByName(String uname);
}
