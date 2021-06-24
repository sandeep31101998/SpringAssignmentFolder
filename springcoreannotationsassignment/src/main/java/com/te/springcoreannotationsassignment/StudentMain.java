package com.te.springcoreannotationsassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotationsassignment.beans.StudentBean;
import com.te.springcoreannotationsassignment.configurations.StudentConfig;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentBean student1 = context.getBean(StudentBean.class);
		
		System.out.println("student1 id: "+student1.getSid());
		System.out.println("student1 name: "+student1.getSname());
		System.out.println("book1 id: "+student1.getBook().getBid());
		System.out.println("book1 name:"+student1.getBook().getBname());
		
		

	}

}
