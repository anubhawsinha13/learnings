/**
 * Implement the uniqueNames method. When passed two arrays of names, 
 * it will return an array containing the names that appear in either or both arrays. 
 * The returned array should have no duplicates.
 */
package com.a3.learnings.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author asinha (https://github.com/anubhawsinha13)
 *
 */
public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
     
    	List<String> mergedList = new ArrayList<String>();
    	for(String name: names1) {
    		mergedList.add(name);
    	}
    	for(String name:names2) {
    		mergedList.add(name);
    	}
    	
    	List<String> newList =  mergedList.stream().distinct().collect(Collectors.toList());
    	return newList.toArray(new String[newList.size()]);
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); 
        // should print Ava, Emma, Olivia, Sophia
    }
}