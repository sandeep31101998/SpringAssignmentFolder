package com.te.springcoreannotationsassignment.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotationsassignment.beans.Charger;

@Configuration
public class ChargerConfig {

	@Bean(name="charger1")
	public Charger getCharger() {
		return new Charger(5, "samsung");
	}
	
	@Bean(name="charger2")
	public Charger getCharger1() {
		return new Charger(30, "Oneplus");
	}
	
}
