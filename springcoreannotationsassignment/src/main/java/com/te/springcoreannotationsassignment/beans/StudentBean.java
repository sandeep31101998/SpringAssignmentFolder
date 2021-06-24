package com.te.springcoreannotationsassignment.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentBean implements Serializable{
	
	private int sid;
	
	private String sname;
	
	@Autowired(required = true)
	@Qualifier("book2")
	private BookBean book;

	public StudentBean() {
		
	}

}
