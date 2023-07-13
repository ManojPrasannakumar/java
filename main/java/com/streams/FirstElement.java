package com.streams;

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class FirstElement {
public static void main(String[] args) {  
	List<String> stringList = new ArrayList<>();

stringList.add("one");
stringList.add("two");
stringList.add("three");
stringList.add("one");

Stream<String> stream = stringList.stream();

stream.forEach( element -> { System.out.println(element); });
}

	 /*List < Product > productsList = new ArrayList < Product > ();
     // Adding Products
     productsList.add(new Product(1, "HP Laptop", 25000 f));
     productsList.add(new Product(2, "Dell Laptop", 30000 f));
     productsList.add(new Product(3, "Lenevo Laptop", 28000 f));
     productsList.add(new Product(4, "Sony Laptop", 28000 f));
     productsList.add(new Product(5, "Apple Laptop", 90000 f));
     // This is more compact approach for filtering data
     productsList.stream().filter(product -> product.getPrice() == 30000)
         .forEach(product -> System.out.println(product.getPrice()));
}*/
}
