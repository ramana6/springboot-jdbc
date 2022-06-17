package com.ramana.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	//autowire jdbctemplate
	@Autowired
	JdbcTemplate jt;
	
	@GetMapping(path="/users")
	public ResponseEntity<List<User>> getAllUsers(){
		
		
		List<User> users = jt.query("SELECT * FROM user", new BeanPropertyRowMapper<User>(User.class));
		return new ResponseEntity<>(users,HttpStatus.OK);
	}

}
