## Rest Controller

	Steps:
		1) Setup the application with pom.xml
		2) Setup all Java config: @configuration
					@configuration
					@ComponentScan (basePackages="com.a3.learnings")	
		3) Web App Initializer: Code is automatically detected and used for initializing the servelet container. 
		
	Project Initialization: 
			1) Initialize the project with the base package.
			2) Define the config folder and add the AppConfig file
			3) Initialize the Config file with annotations @configuration and @componentScan
			4) Create the controller class and annotate with @RestController and @RequestMapping
		
		
	@RequestMapping: @PathVariable: @RequestParams
		These annotations are used in Spring to accept dynamic 
		@RequestMapping: Used to define base URI when used with the class.
					    Used to define the URI pattern when used with methods. 
					    
		@RequestParams: Are used to access the value from query parameters (like ?id=1)
		@PathVariable: Are used to access the value for Path Variable (/student/1/ where 1 is {studentId})
		