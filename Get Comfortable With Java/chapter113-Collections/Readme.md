## Collections

		A group of individual objects represented as a single unit.
		
		Two main interfaces of collections:
			java.util.Collections
			java.util.Map
		
		Before collections, group of objects were stored Arrays, Hashtables, Vectors ( OldCollectionsof Objects)
		All of the above formats did not have standard member access interface.
		
		Collections provide common set of interfaces and methods to make the development easier.
		
	# Collections root interfaces:
		1) Set : Dosen't allow duplicates
		2) List : Can contain duplicate and elements are ordered.
		3) Queue : elements in FIFO order
		4) Dequeue: elements can be added and removed at both the ends.
		5) Map : Contains key value pair
		
	##Set : Set is implemented by 
			1) HashSet
			2) LinkedHashSet
			3) TreeSet (sorted representation) - Implementation of sorted set interface
			
	##Binary Search
		Collections provide a binary search option on the list of objects which performs much better
		compared to brute force search with loops. (Theater4.java implements comparable interface to optimize search of object in the list.
			
			