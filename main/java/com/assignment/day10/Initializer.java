package com.assignment.day10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Initializer {
	public static void main(String[] args) {
		
		List<Product> prod = new ArrayList();
				
		prod.add(new Product((long) 100, "Biography", "Books", 200.00));
		prod.add(new Product((long) 101, "Fiction", "Books", 50.00));
		prod.add(new Product((long) 102, "Stories", "Books", 70.00));
		prod.add(new Product((long) 103, "10th Study Material", "Books", 100.00));
		prod.add(new Product((long) 104, "UPSE Exam Paper", "Books", 120.00));

		prod.add(new Product((long) 04, "Soap", "Baby", 50.00));
		prod.add(new Product((long) 05, "Shampoo", "Baby", 100.00));
		prod.add(new Product((long) 06, "Oil", "Baby", 60.00));
		
		prod.add(new Product((long) 302, "Auto", "Toy", 80.00));
		prod.add(new Product((long) 305, "Jeep", "Toy", 50.00));
		prod.add(new Product((long) 303, "Car", "Toy", 100.00));

		Customer cus1 = new Customer((long) 200,"Roy",8);
		Customer cus2 = new Customer((long) 201,"Professor",2);
		Customer cus3 = new Customer((long) 210,"Senior Citizen",6);
		Customer cus4  = new Customer((long) 205,"Teacher",4);
		Customer cus5 = (new Customer((long) 208,"Pawan",3));
		Customer cus6 = (new Customer((long) 207,"Student",3));
		Customer cus7 = (new Customer((long) 203,"Kumar",5));
		
		List<Order> ord= new ArrayList();
		
		LocalDate dt1 = LocalDate.parse("2023-04-06");
	    LocalDate dt2 = LocalDate.parse("2023-06-10");
	    LocalDate dt3 = LocalDate.parse("2023-02-03");
	    LocalDate dt4 = LocalDate.parse("2023-05-15");
	    LocalDate dt5 = LocalDate.parse("2023-08-05");
	    LocalDate dt6 = LocalDate.parse("2023-03-07");
	    
	    LocalDate dt7 = LocalDate.parse("2023-04-17");
	    LocalDate dt8 = LocalDate.parse("2023-06-20");
		LocalDate dt9 = LocalDate.parse("2023-02-13");
		LocalDate dt10 = LocalDate.parse("2023-05-25");
		
		ord.add(new Order((long)1000, "payment",dt1 ,dt7 , prod, cus1));
		ord.add(new Order((long)1010, "delivered",dt2 ,dt8 , prod, cus2));
		ord.add(new Order((long)1030, "cancelled",dt3 ,dt4 , prod, cus3));
		ord.add(new Order((long)1060, "paid, delivery pending",dt5 ,dt10 , prod, cus4));
		ord.add(new Order((long)1020, "pending payment ",dt2 ,dt9 , prod, cus5));
		ord.add(new Order((long)1070, "ordered",dt1 ,dt9 , prod, cus6));
		
	}

}
