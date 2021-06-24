package com.te.springcoreannotationsassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotationsassignment.beans.Mobile;
import com.te.springcoreannotationsassignment.configurations.MobileConfig;

public class MobileTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MobileConfig.class);
		
		Mobile mob = context.getBean(Mobile.class);
		
		System.out.println(mob.getOperatingSystem().getOsVersion());
		System.out.println(mob.getOperatingSystem().getOsName());
		
		System.out.println("-------------------");
		
		System.out.println(mob.getCharger().getVoltage());
		System.out.println(mob.getCharger().getChargerBrand());
	}

}
