package com.te.springcorexmlconfigassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.bean.Bookbean;
import com.te.bean.StudentBean;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("studentconfig.xml");
        StudentBean s1 = context.getBean("stuOne",StudentBean.class);
        
        System.out.println("-----constructor------");
        System.out.println(s1.getSid());
        System.out.println(s1.getSname());
        System.out.println(s1.getBook().getBname());
        
        System.out.println("----property-------");
        StudentBean s2 = context.getBean("stuTwo",StudentBean.class);
        System.out.println(s2.getSname());
        System.out.println(s2.getSid());
        System.out.println(s2.getBook().getBname());
        
    }
}
