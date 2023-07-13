package com.example.assignment;

public class Demo {
	public static void main(String[ ] args) {
		int x = 5;
        while (x  > 1) { 
              x = x - 1;
              if (x < 3) {
         System.out.println("small x");
   		}
        }
        /*Integer i = 42;
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        System.out.println(s);*/
        Short s = 15;
        Boolean b;
        b  = (s instanceof Short);
        
        Integer z = 7;
        int y = 2;    
        
        boolean boo = false;
        if (boo = true) {  }
        
        int a = 1;
        if ( a == 3) { }
        else if  (a < 4) { System.out.println("<4"); }
        else if  (a < 2) { System.out.println("<4"); }
        else { System.out.println("else"); }
        
       boolean b1 = true;
       boolean b2 = false;
       System.out.println(!false ^ false);
       System.out.println(" " + (!b1 & (b2 = true)));
       
       System.out.println(" " + (b2 ^ b1));
       
       outer:
           for (int i=0; i<5; i++) {
               for (int j=0; j<5; j++) {
                   System.out.println("Hello");
                   continue outer;
               } // end of inner loop
               System.out.println("outer");
           }
       System.out.println("Good-Bye");
              
                
}
}