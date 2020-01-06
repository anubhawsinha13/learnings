## Restful API: 

	It is a architecture style for distributed hypermedia systems.

# Principles:

	1) Client -server: Separate user-interface concerns from data-storage concerns.
			improve portability and scalability by simplifying server concerns.
	
	2) Stateless: Each request from client to server should contain all the information needed to fulfill the request. Session state should be kept at the client side.
	
	3) Cacheable: Every response should contain the information stating of the information is cacheable or not, based on which the client should determine if they can cache the data from the server.
	
	4) Uniform Interface: It simplifies and decouples the architecture, so that each service can be managed independently.
				Rest is defined by 4 uniform interfaces constraints:
				1) Resource based identification: Request will need to identify the resource that it is looking for via URI.
					Also resource should not have any relationship with the way they are returned to client.
				2) Resource Manipulation through Representation: If a client has a resource, along with metadata, they should have enough information to either modify or delete the resource of they have access.
				3) Self descriptive message: The message should have enough information to let the server know how to process it.
				4) Hypermedia as the Engine of Application State: Accessing an API should be similar to accessing a web page.
				User should be able to discover other areas of API just like a web page. A response can contain links and point to other areas of the APIs that are available.
	5) Layered System/Microservices: A layered system allows the architecture to be composed of hierarchical layers in which each layer is not able to see beyond the immediate layer. This also enforces security and options for scalability with an API Gateway.
	6) Code on Demand: Servers should be able to extend the functionality of a client by letting them execute code logic by helping them download  or transfer the functionality like scripts and applets.

## Rules of REST API:
	1) REST should be based of the resource/NOUN rather than verbs or actions.
		E.g:- /api/resources vs /api/update?type=resource
	2) HTTP VERBS should be used to define the actions
		E.g: PUT, GET, POST, DELETE
	3) always use plural in URL to keep the API URIs consistent.
	4) Send a proper HTTP code in the response.
	5) For a GET request always try to use Path Variables rather than request object to query.
	6) Use a VERB for a controller name rather than a resource
		
		
​			
​									