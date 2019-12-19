## Bean Scopes

	Topics:
		1) Scope refers to lifecycle of the bean
		2) How long the bean will live in the Container
		3) How many instances will be created for the bean
		4) How is the bean shared between other beans/objects
		
	Annotations for defining the bean scope:
		@Scope("singleton")
		@Scope("prototype")
		
# Bean life cycle method with annotations

		1) @PostConstruct: You can add code to run during code bean initialization
		2) @PreDestroy: Also you can add code to run during bean destruction
		
