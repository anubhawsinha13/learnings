## Autowiring

	Spring will automatically wire the dependencies for classes with dependency injection.
	Spring will look for classes that matches the property by type classes or interfaces and inject automatically
	
	There are different types of Dependecy Injections in Spring:
		1) Constructor Injection
		2) Setter Injection
		3) Method Injection
		4) Field Injection
		
	Which Injection should we use?
		Choose the style and stay consistent.
		Best Practice:
		If the part of the object is mandatory then use constructor Injection
		Else use setter injection if the objects are optional
		
	# Qualifier for Dependency Injection
		If there are more than one of the implementation, which will Spring pick up.
		"NoUniqueBeanDefinitionException"
		There are two ways to fix this issue:
		@Primary - which tells spring all other beans are equal, but select the primary bean over the instances for the autowired requirements.
		@Qualifier - We can give hints to spring about the bean that you want to use with the beanID.
		