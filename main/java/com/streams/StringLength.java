package com.streams;
//Program to convert
//the Stream to Map

import java.io.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class StringLength {
	// Function to convert the string
	// to the map
	public static Map toMap(String input)
	{
		Map<String, Integer> lengthMap = Arrays.stream(input.split(" "))
				.collect(Collectors.toMap(value -> value,value -> value.length()));

		return lengthMap;
	}
	public static void main(String[] args)
	{
		String input = "Hello Welcome";

		System.out.println(toMap(input));
		
		List<String> lines = Arrays.asList("java", "c", "python","c ++");

        List<String> result = lines.stream()       // convert list to stream
                .filter(line -> "c".equals(line)) // 
                .collect(Collectors.toList());     // collect the output and convert streams to a List

        result.forEach(System.out::println); 
	}
	
}
