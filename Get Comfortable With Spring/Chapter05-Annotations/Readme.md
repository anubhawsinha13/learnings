## Spring configuration with Java Annotations

	Why?
		1) Normal xml configurations can be verbose
		2) Annotation minimize the xml configuration
		3) Annotations are like meta-deta of a class
		
	How?
		1) Spring will scan the Java classes for the special annotations
		2) Automatically register the bean in the Spring Container.
		
	Steps:
		1) Enable component scanning in the spring configuration file
			<!-- Add the annotation to enable component scan-->
			<contect:componenet-scan base-package="com.a3.learnings.annotations"/>
		2) Add the @Component annotation in the Java Class
		3) Retrieve bean from the Spring container
		4) Call methods
		5) Close the context