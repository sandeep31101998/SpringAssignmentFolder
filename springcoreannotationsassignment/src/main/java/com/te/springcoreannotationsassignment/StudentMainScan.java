package com.te.springcoreannotationsassignment;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.te.springcoreannotationsassignment.beans.StudentBean;
import com.te.springcoreannotationsassignment.configurations.StudentConfiguration;

public class StudentMainScan {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);

		StudentBean student1 = context.getBean(StudentBean.class);
		System.out.println("enter the student 1 id");
		student1.setSid(sc.nextInt());
		
		System.out.println("enter the student 1 name");
		student1.setSname(sc.next());
		
		System.out.println("student1 :"+student1);
		
		System.out.println("-------------------------------------");
		
		ApplicationContext context2 = new AnnotationConfigApplicationContext(StudentConfiguration.class);

		StudentBean student2 = context2.getBean(StudentBean.class);
		System.out.println("enter the student 2 id");
		student2.setSid(sc.nextInt());
		
		System.out.println("enter the student 2 name");
		student2.setSname(sc.next());
		
		System.out.println("student2 :"+student2);
		
		
		
		
	}

}
