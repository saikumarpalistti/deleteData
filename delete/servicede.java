package com.example.demo.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class servicede {
	@Autowired
JdbcTemplate a;
	
	int delete(pojode d)
	{
		int Streets=d.getStreets();
		String q="delete from serveyVzm where Streets=?";
		return a.update(q,Streets);
	}


}
