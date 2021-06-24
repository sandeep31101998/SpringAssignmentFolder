package com.te.springcoreannotationsassignment.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.te.springcoreannotationsassignment.beans.StudentBean;

@Configuration
public class StudentConfiguration {

	@Bean
	@Scope("prototype")
	public StudentBean getStudent()
	{
		StudentBean s = new StudentBean();
		return new StudentBean();
	}
}
