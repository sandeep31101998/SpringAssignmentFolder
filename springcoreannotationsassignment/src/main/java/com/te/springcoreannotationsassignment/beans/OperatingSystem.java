package com.te.springcoreannotationsassignment.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OperatingSystem implements Serializable{

	private double osVersion;
	
	private String osName;
}
