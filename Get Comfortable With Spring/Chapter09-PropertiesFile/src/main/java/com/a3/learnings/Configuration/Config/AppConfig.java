package com.a3.learnings.Configuration.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.a3.learnings")
@PropertySource("classpath:sport.properties")
public class AppConfig {
	
	

}
