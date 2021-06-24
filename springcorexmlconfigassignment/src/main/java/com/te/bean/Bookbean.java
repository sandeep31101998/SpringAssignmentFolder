package com.te.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bookbean implements Serializable{
	
	private int bid;
	
	private String bname;

	public Bookbean() {
		
	}
	
	

}
