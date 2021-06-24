package com.te.springcoreannotationsassignment.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Mobile implements Serializable{

	private Charger charger;
	
	private OperatingSystem operatingSystem;

	@Autowired
	public Mobile(@Qualifier("charger1") Charger charger, OperatingSystem operatingSystem) {
		super();
		this.charger = charger;
		this.operatingSystem = operatingSystem;
	}
	
}
