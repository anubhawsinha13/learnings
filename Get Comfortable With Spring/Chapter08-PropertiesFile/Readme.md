## Injecting values from properties file

		1) Create the properties file
		2) Load the properties in spring configuration
		3) Reference the values from the Properties file.
		

		@PropertySource(classpath:application.properties): Property file injection
		 This annotation will detail the configuration Java class to load the properties from properties file.
		
		@Value("${propertyName}"): Field level injection
			This will inject the property from the properties file.
			
		@ConfigirationProperties: If you have some common context like prefix, then we can use @ConfigurationProperties	
		
		Default value:
		By default missing property causes an exception. This can be handled by added default value in the property injections.
		
								@Value("${propertyName:defaultValue}")
								
		Springboot loads the application.properties by default in the classpath from src/main/resources
		
		
		Multiline property can be done by adding at \ (back Slash) at the end of the line.
		Spring also allows to add teh properties from environment variables:
				s			bpg.init.java-home=This is Java path: ${JAVA_HOME}
		
		
		
