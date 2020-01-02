## Stream 

	Stream API is used to process collections of objects.
	Streams operations are either intermediate or terminal.
		Intermediate operations: ( this returns a stream which can be used to chain multiple stream operations)
			All the list of operations can be found at the following doc:
			https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
		Terminal operations: ( this either returns void or non-stream result)
	
	All stream operations accept some kind of lambda expression parameters.