#Spring Beans


	"Spring Bean": Spring bean is simply another java object.
	                When java object is created by spring container then spring refers to them as spring bean.
	


##Inversion Of Control (IOC)
	Design process of outsourcing the creation and management of a bean is called as IOC.
	The outsourcing is managed by Object Factory. Beans and Dependencies among the beans are managed by configuration metadata used by containers.
		Object Factory: Spring provides an object factory which provides the objects/beans based on annotation on injections.
		This object factory is called as spring container.
		"Spring Container": Primary function of Spring container:
		                        1) Create and Manage Objects ( Inversion of Control)
		                        2) Inject Object's Dependencies ( Dependency Injection)
	
					There are 3 ways of configuring Spring Container:
					    1) XML configuration file
					    2) Java Annotations
					    3) Java Source Code
					    
					There are multiple ways to instantiate a bean:
					    1) Static factory method
					    
					    <bean id="germanNumberFormat" class="java.text.NumberFormat"
        						factory-method="getInstance">
    							<constructor-arg value="de" />
						</bean>
						2) Constructor or setter methods ( Reflections)
						
						<?xml version="1.0" encoding="UTF-8"?>
							<beans xmlns="http://www.springframework.org/schema/beans"
								xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
								xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
								<bean id="myBean" class="com.a3.learnings.spring.MyBean" />
								</beans>
						3) Instance factory method
							<bean id="myBean" class="com.a3.learnings.springapp.MyBean"/>
							<bean id="theCoach" factory-bean="myBean" factory-method="createObject"/>
							
							
## Steps to build spring APP
		1) Load the spring configuration file
		2) retrieve the bean from container
		3) Call methods on the bean 
		4) close the context 

		
## Scope of the Bean
	By Default the scope of the bean is "Singleton"
	There are different types of scope of the bean instantiated in Object Factory:
		!) Singleton
		2) Prototype
		3) request
		4) global
		5) Session
		
		
##Lifecycle of a Bean 

	1) Container Started
	2) Bean instantiated
	3) Dependencies Injected
	4) Internal Spring Processing
	5) Load your custom initialization code.
	6) Bean is ready to use.
	
	
	
# Bean Lifecycle Methods/Hooks
	1) Bean Initialization (initi-method="methodName")
	2) Bean Destroy method < destroy-method = "destoryMethod">
	
	