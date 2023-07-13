package com.example.assignment;

public class Demo2 {
	public static void main(String[ ] args) {
		Integer x = 0;
        Integer y = 0;
        for(Short z = 0; z < 5; z++)
            if ((++x > 2) || (++y > 2))
                x++;
        System.out.println(x + " " + y);
        
        Boolean b1 = true;
        Boolean b2 = false;
        Boolean b3 = true;
        if ((b1 & b2) | (b2 & b3) & b3)
            System.out.println("alpha ");
        if ((b1 = false) | (b1 & b3) | (b1 | b2))
            System.out.println("beta ");
    
        
}
}
