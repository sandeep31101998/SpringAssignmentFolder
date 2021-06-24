package com.te.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentBean implements Serializable {
	
	private int sid;
	
	private String sname;
	
	private Bookbean book;

	public StudentBean() {
		
	}
	
	

}
