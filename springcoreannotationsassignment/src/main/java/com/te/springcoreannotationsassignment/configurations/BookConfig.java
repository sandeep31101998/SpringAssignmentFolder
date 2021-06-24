package com.te.springcoreannotationsassignment.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotationsassignment.beans.BookBean;

@Configuration
public class BookConfig {
	
	@Bean(name = "book1")
	public BookBean getBook()
	{
		BookBean bean = new BookBean();
		bean.setBid(100);
		bean.setBname("java");
		return bean;
	}
	
	@Bean(name = "book2")
	public BookBean getBook1()
	{
		BookBean bean = new BookBean();
		bean.setBid(200);
		bean.setBname("j2ee");
		return bean;
	}
	
	@Bean(name = "book3")
	public BookBean getBook2()
	{
		BookBean bean = new BookBean();
		bean.setBid(300);
		bean.setBname("spring");
		return bean;
	}
	
	

}
