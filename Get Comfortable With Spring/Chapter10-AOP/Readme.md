## AOP
	Aspect Oriented Programming.
	It is a programming paradigm which separates the cross cutting concerns by modularizing them.
	
	Terminologies:
		1) Aspect: An aspect is part of the object that cross-cuts the core concerns of multiple objects.
					These are regular classes that are tagged with @aspect annotation.
					The methods of the aspect class are called as advice.
					
		2) Joint Point: Joint Point is a point in the flow of a program.
						Like execution of a method or an exception.
						A joint point is an event that occurs during the program flow.
						
		3) Advice: Is an action taken by an aspect at a particular joint point.
					Advice are implemented as methods in Aspect classes.
					These methods are executed before or after the joint point.
					
		4) Point Cut: Is a set of joint points that needs to be matched before running an advice.
					A POINTCUT is configured by a pointcut expression which defines when and where an advice should be executed.
					
		5) Pointcut expressions: Pointcut expression is a condition under which is joint point should match.
		6) Target Class: a class or method that is advised by an aspect is referred to as Target class.
		7) Introduction: An introduction redeclares a target class to implement an additional interface.
						By declaring an introduction it is possible to introduce new interfaces and implementations of a required method without 	changing the code of the original class.
		
		
		Types of Advice: Which can be executed at certain point of method execution.
			1) Before Advice
			2) After finally advice
			3) After returning advice
			4) After throwing advice
			5) Around advice
			
			
	Weaving: Connecting aspects to target object to create an advice object.