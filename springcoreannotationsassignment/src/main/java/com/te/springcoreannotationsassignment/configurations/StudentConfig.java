package com.te.springcoreannotationsassignment.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.te.springcoreannotationsassignment.beans.BookBean;
import com.te.springcoreannotationsassignment.beans.StudentBean;

@Configuration
@Import({BookConfig.class})
public class StudentConfig {
	
	@Bean(name = "student1")
	@Scope("prototype")
	public StudentBean getStudent()
	{
		return new StudentBean();
	}
//	<bean id=".." class=".."> </bean>
	
	@Bean(name = "student2")
	@Primary
	public StudentBean getStudentObject()
	{
		return new StudentBean(20, "sandeep", new BookBean());
	}
//	<bean id=".." class=".."> <constructor-arg> </bean>
	
	@Bean(name = "student3")
	public StudentBean getStudent2()
	{
		StudentBean bean = new StudentBean();
		bean.setSid(30);
		bean.setSname("monty");
//		bean.setBook(new BookBean()); //commented because it is @Autowired
		return bean;
	}
//	<bean id=".." class=".."> <property> </bean>
}
