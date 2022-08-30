package com.cg.UserModule;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository repo;
	//retrive all
	public List<User> listAll() {
	return repo.findAll();
	}
	//retrive by id
	public User get(Integer id) 
	{
		return repo.findById(id).get();
	}
	//create and update
	public void save(User user) {
		repo.save(user);
	}
	//delete
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	}


