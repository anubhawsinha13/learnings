## JSON

		JavaScript object Notation
		Light weight data format for exchanging data.
		

## Data Binding/Mapping/Serialization/De-serialization/Marshalling/Unmarshalling
		
		Convert JSON string/file to Java plain objects POJO
		Jackson Project   - Used for data binding
		Jackson uses Getter and Setter methods to do the bindings.
		JSON - POJO : Jackson calls setter method
		
		#Steps:
			1) Import the dependency of Jackson Project (Jackson databind )
				<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
				<dependency>
				    <groupId>com.fasterxml.jackson.core</groupId>
				    <artifactId>jackson-databind</artifactId>
				    <version>2.10.0</version>
				</dependency>
			2) Use the objectMapper for mapping the json to pojo.
			3) Use the readValue() method from the mapper
			4) Use @JsonIgnoreProperties(ignoreUnknown = true) annotation to ignore properties in JSON not in POJO
	
	HTTP Request Message: Has 3 parts:
						1) Request Line
						2) Header Variable: Metadata
						3) Message Body
						
	 MIME content type : application/html
			
			
			