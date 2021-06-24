package com.te.springcoreannotationsassignment.configurations;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({OperatingSystemConfig.class,ChargerConfig.class})
@ComponentScans("com.te.springcoreannotationsassignment")
public class MobileConfig {

}
