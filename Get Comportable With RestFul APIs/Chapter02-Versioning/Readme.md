## API Evolution  - Versioning APIs - URI Design

	|| One shall not break the client.
	
	API evolution is a concept of never braking your API unless it is absolutely needed.
	
	Key policies:
	1) Over time we may add new attributes and new resources to each particular resource, but the method that API users follow to access a particular resource should not change once the resource addressing schema becomes public and final.
	2) Version should only change if the changes to the API is non-backward compatible.
	3) Version should only change if there are schema changes, versions dictates the representation of object and not the concept of object.
	4) API - Is Application programming Interface and version should only change if the Interface defined for the object or resource is non - backward compatible.
	5) We should never go beyond (n-1)versions existing in terms of supporting an API.
	
	
	Characteristics: " Cool URIs don't change"
	1) We can have API version in the URI or Meta Data, depends on what is the best practice team thinks about. 
	2) Have an expiration date on the API version.
	3) Minor changes should not change the API version for the client.
	
	
	There are multiple ways that we can maintain versioning of APIs:
	1) Version is the URI : /maps/version/2/
						  /maps/v2/buildings
	2) Accept Header: The accept header can be used to have one's own defined resource type which can have version added.
				     Accept: application/x.myapi.v2+json 
	3) Custom request header: In http request header we can pass on the API version.
					Eg: api-version: 2
	4) API Parameter: Version of the API passed in the API request parameters:
					/maps/buildings?version=2
					