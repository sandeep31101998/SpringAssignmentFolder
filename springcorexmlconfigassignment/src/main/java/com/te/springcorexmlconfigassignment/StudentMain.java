package com.te.springcorexmlconfigassignment;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.bean.StudentBean;

public class StudentMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("studentconfig.xml");
		StudentBean s1 = context.getBean("stuOne", StudentBean.class);
		System.out.println("enter the sid");
		s1.setSid(sc.nextInt());
		System.out.println("enter the sname");
		s1.setSname(sc.next());

		System.out.println(s1);

		StudentBean s2 = context.getBean("stuTwo",StudentBean.class);
		System.out.println("enter the sid");
		s2.setSid(sc.nextInt());
		System.out.println("enter the sname");
		s2.setSname(sc.next());
		
		System.out.println(s2);
	}

}
