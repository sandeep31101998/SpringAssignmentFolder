package com.te.springcoreannotationsassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotationsassignment.beans.StudentBean;
import com.te.springcoreannotationsassignment.configurations.StudentConfig;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        
    	StudentBean s1 = context.getBean("student1", StudentBean.class);
    	System.out.println(s1.getSid());//0
    	System.out.println(s1.getSname());//null
    	
    	System.out.println("--------------");
    	
    	StudentBean s2 = context.getBean("student2",StudentBean.class);
    	System.out.println(s2.getSid());//20
    	System.out.println(s2.getSname());//sandeep
    	
    	System.out.println("--------------");
    	
    	StudentBean s3 = context.getBean("student3",StudentBean.class);
    	System.out.println(s3.getSid());//30
    	System.out.println(s3.getSname());//monty
    }
}
