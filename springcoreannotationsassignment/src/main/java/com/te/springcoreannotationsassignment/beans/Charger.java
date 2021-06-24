package com.te.springcoreannotationsassignment.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Charger implements Serializable{
	
	private int voltage;
	
	private String chargerBrand;
	
	public Charger() {}

}
