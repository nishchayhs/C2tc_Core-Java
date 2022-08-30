package com.cg.UserModule;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	//retrieve all
	@GetMapping("/alluser")
	public List <User> list()
	{
	return service.listAll();
	}
	
	//retrieve by id
	@GetMapping("userloginby/{id}")
	public ResponseEntity <User>get(@PathVariable Integer id){
		try {
		User user = service.get(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	catch(Exception e) 
	{
		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	}}
	
//create	
@PostMapping("/adduser")
public void add(@RequestBody User user) 
		{
	service.save(user);
        }
//update
@PutMapping("/updateuser/{id}")
public ResponseEntity<?>update(@RequestBody User user,@PathVariable Integer id){
try {
	User existuser	=service.get(id);
	service.save(user);
	return new ResponseEntity<>(HttpStatus.OK);
    } 
catch (Exception e) 
{
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	
}}

//delete
@DeleteMapping("/logoutuser/{id}")
public void delete(@PathVariable Integer id) {
{
	service.delete(id);
	
}
                                                                               } 
}
	
	
