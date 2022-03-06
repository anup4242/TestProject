package com.shopnow.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopnow.model.User;


@Transactional
@Repository
public class UserDaoImpl implements UserDao
{
	@Autowired
	private SessionFactory sf;

	@Override
	public boolean insertUser(User u) 
	{
		
		sf.getCurrentSession().save(u);
		return false;
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
		// TODO Auto-generated method stub
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
		String query = "from User u where username=:n and password=:p";
		Query  q = sf.getCurrentSession().createQuery(query);
		q.setParameter("n", name);
		q.setParameter("p", password);
		q.setMaxResults(1);
		User u = (User) q.uniqueResult();

		return u;
		
	}

	@Override
	public List<User> getUserByName(String uname) {
		String query = "from User u where username=:n";
		Query  q = sf.getCurrentSession().createQuery(query);
		q.setParameter("n", uname);
		List<User> lst=q.list();
		return lst ;
	}
	
	
	

}
