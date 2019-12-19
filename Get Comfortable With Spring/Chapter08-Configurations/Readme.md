## Bean Configurations

	Topics:
	There are 3 ways of configuring Spring Container:
        1) XML configuration file - list each bean
        2) Java Annotations - XML Component-scan with @Component annotations
        3) Java Source Code - @Configuration
                    
     Development Steps:
     	1) Create Java class and annotate with @Component
     	2) add component scanning support with @ComponenetScan
     	3) Read Spring Java configuration class
     	4) Retrieve bean file from the container
     	
     Read the spring java configuration file with "AnnotationConfigApplicationContext"
     
     @Bean : Use @Bean annotation to define the bean configuration in Java config file
     		Use can use the constructor injection to resolve the dependency injection in the Java config file.
     		
     		
## Injecting values from properties file
 		1) Create the properties file
 		2) Load the properties in spring configuration
 		3) Reference the values from the Properties file.
		
