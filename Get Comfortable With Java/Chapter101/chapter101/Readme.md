## Class # Objects # Methods # Spring Beans

    #Topics:
        classes and objects
        java object storage
        different ways to create objects in java
        Variables
        behavior of objects - state and behavior of objects is defined by the instance of variables and methods.	

A class is a user defined blueprint or model from which objects are created.
It represents a set of characteristics or features that are common for all objects of the same type.
    A class declarations can include following 5 components:
        1) Modifier - Access modifier, classes can be access by public but the attributes or state of objects are accessible only to that object. This based on the key topic in Java as Encapsulation which protects the state/attributes of the object to the object itself.
        2) Class Name
        3) Super Class if any
        4) Interfaces if any
        5) Body

A class is a basic unit of object oriented programming which represents real life entities.
An object consists of 3 things:
    1) State
    2) Behavior
    3) Identity

In this example we are representing a product.
    1) State: State of the product is represented by it variables.
        productCode
        productName
    2) Behavior: It is a method which is associated with every object.
        To set value to any attribute or state which is private to the object we define a method which takes the value from input and sets the 
        value to the class itself with "this" as a qualifier.
    3) Identity is the name of the object that is defined based on the class.
        


There are 4 ways of creating an object:
    1) New: Using a new keyword.
    2) Class.forName( String ClassName) method.
    3) Clone(): using a clone method which creates and returns a copy of the object.
    4) De-serialization: Technique of reading an object from the saved state of an object.



"Spring Bean": Spring bean is simply another java object.
                When java object is created by spring container then spring refers to them as spring bean.


Object Factory: Spring provides an object factory which provides the objects/beans based on annotation on injections.
This object factory is called as spring container.
"Spring Container": Primary function of Spring container:
                        1) Create and Manage Objects ( Inversion of Control)
                        2) Inject Object's Dependencies ( Dependency Injection)

            There are 3 ways of configuring Spring Container:
                1) XML configuration file
                2) Java Annotations
                3) Java Source Code
