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