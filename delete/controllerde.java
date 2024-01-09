package com.example.demo.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerde {
@Autowired
servicede s;
@PostMapping("/deletefrom")
String dv(@RequestBody pojode j)
{
	try {
		int r=s.delete(j);
		if(r>0) return "one row deleted";
		else return "nothing happened";
		
	}
	catch (Exception e) {
		// TODO: handle exception
		return e.getMessage();
	}
	
}

}
