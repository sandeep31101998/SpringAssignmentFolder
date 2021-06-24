package com.te.springcoreannotationsassignment.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookBean implements Serializable {

	private int bid;
	private String bname;
	
	public BookBean()
	{
		
	}

}
