# Static and Instance Methods

Static Methods : 

			Characteristics:
				Static methods are declared with "static" keyword.
				Static methods cannot access instance methods and variables directly.
				static methods does not require instance to be created.
				
				
Instance Methods :
			
			Characteristics:
				Instance methods belongs to instance of a class.


Static or instance methods:

			## Does the method use any instance variable or instance methods??
				Yes: Then the method should be instance method.
				No: Then it should be a static method.
				

# Static Vs Instance Variables

Static variables : 
				
				Characteristics:
					Static variables are shared between instances.
					
Instance variables :
				
				Characteristics:
					Every instance has its own copy of instance variable.
					Represents a state of a specific instance of the class.
					
					
					
# Static Class
		1) Static keyword can be used for a class which is an inner class.
		2) Static inner class is a nested class which is a static member of the outer class.
		3) It can be accessed without instantiating the outer class
		4) Just like static variables static nested class does not have access to static members and variables of outer class.
					