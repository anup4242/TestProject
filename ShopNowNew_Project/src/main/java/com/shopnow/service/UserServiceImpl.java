package com.shopnow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.shopnow.dao.RoleDaoImpl;
import com.shopnow.dao.UserDao;
import com.shopnow.model.Role;
import com.shopnow.model.User;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDao udao;
	
	@Autowired
	private RoleDaoImpl rdao;
	
	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	@Override
	public boolean insertUser(User u)
	{
		String pass = u.getPassword();
		String encodePass =passEncoder.encode(pass);
		
		u.setPassword(encodePass);
		
		Role r = rdao.getByRoleId(2);
		
		u.setRole(r);
		
		udao.insertUser(u);
		
		return true;
	}

	@Override
	public boolean deleteUserById(int userid) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User u) 
	{
		udao.updateUser(u);
		return false;
	}

	@Override
	public List<User> getAllUsers() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int userid)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByNameAndPassword(String name, String password) 
	{
		
		return udao.getUserByNameAndPassword(name, password);
	}

	@Override
	public List<User> getUserByName(String uname) {
		
		return udao.getUserByName(uname);
	}

	
}
