# Inheritance

Mechanism by which one class is allowed to inherit the features from another parent class.

feature of inheritance:

	    1) Super Class
	    2) Sub class
	    3) Re-usability

Keyword:
    		
    		extends : A sub class extends the super class to inherit the features of super class.


Types of Inheritance:

    1) Single inheritance
    2) Multilevel Inheritance
    3) Hierarchical Inheritance
	4) Multiple Inheritance : 
		Java by default does not support multiple inheritance. It is achieved by using Interfaces.
    5) Hybrid Inheritance : Same as multiple inheritance through interfaces.



## Spring 

    # Spring achieves inheritance through spring configuration file. With parent bean definition:

	<bean id="CustomerBean" parent="BaseCustomerMalaysia">
		<property name="action" value="buy" />
		<property name="type" value="1" />
	</bean>


## Override

    Methods inherited from the parent class can be overridden with additional properties.

## final

    Methods that should be implemented as it is from the super class should be defined as final method.