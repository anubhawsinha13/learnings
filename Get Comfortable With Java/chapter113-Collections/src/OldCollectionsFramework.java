import java.util.Hashtable;
import java.util.Vector;

/*
 * 
 * 
 * Program to show why collections framework was needed.
 */


public class OldCollectionsFramework {
	
	
	public static void main(String args[]) {
		
		//Arrays one way to store group of objects
		
		int[] arrays = new int[] {1,2,3,4,5};
		
		//Vector another way to store objects in a group
		
		Vector<Integer> v = new Vector();
		
		v.addElement(1);
		v.addElement(2);
		
		//Hashtables to group objects
		
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		
		h.put(1, "sample");
		h.put(2, "Object");
		
		
		//Ways to access elements from arrays, vector and hastable
		
		System.out.println("Element from array--"+arrays[0]);
		System.err.println("Element from vector--"+ v.elementAt(0));
		System.out.println("Element from hashtable--"+ h.get(1));
		
		
		
	}

}
