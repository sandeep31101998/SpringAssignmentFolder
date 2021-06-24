package com.te.springcoreannotationsassignment.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotationsassignment.beans.OperatingSystem;

@Configuration
public class OperatingSystemConfig {

	@Bean
	public OperatingSystem getOperatingSystem() {
		return new OperatingSystem(4.4, "kitkat");
	}
	
}
