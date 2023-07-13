package com.example.assignment;
// Java program to find first
// element of a Stream in Java

import java.util.*;
import java.util.stream.*;

public class GFG {

	// Function to find the
	// first_elements in a Stream
	public static <T> T
	firstElementInStream(Stream<T> stream)
	{
		T first_element
			= stream

				// reduce() method reduces the Stream
				// to a single element, which is first.
				.reduce((first, second) -> first)

				// if stream is empty
				// null is returned
				.orElse(null);

		return first_element;
	}

	// Driver code
	public static void main(String[] args)
	{

		Stream<String> stream
			= Stream.of("Geek_First", "Geek_2",
						"Geek_3", "Geek_4",
						"Geek_Last");

		// Print the first element of a Stream
		System.out.println(
			"First Element: "
			+ firstElementInStream(stream));
	}
}
