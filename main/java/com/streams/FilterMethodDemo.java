package com.streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
  
public class FilterMethodDemo {
	 // Generic function to convert a set to stream
    private static <T> Stream<T> convertSetToStream(Set<T> set)
    {
        return set.stream();
    }
  
    // Main method
    public static void main(String args[])
    {
        // Create a set of String
        Set<Integer> setOfInteger = new HashSet<>(
            Arrays.asList(2, 4, 6, 8, 10));
  
        Set set2 = new HashSet();
        set2.add("1");
        set2.add(2);
        set2.add("3");
        
        // Print the set of Integer
        System.out.println("Set of Integer: " + setOfInteger);
  
        // Convert Set of Stream
        Stream<Integer>
            streamOfInteger = convertSetToStream(setOfInteger);
  
        // Print the Stream of Integer
        System.out.println("Stream of Integer: "
                           + Arrays.toString(
                             streamOfInteger.toArray()));
        
       
    }
}
