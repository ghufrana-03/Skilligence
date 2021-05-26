package skilligence;

import java.util.Scanner;

public class Power
{
   public static void main(String arg[])
	
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number");
	  int a=sc.nextInt();
         System.out.println("enter power");
       int b=sc.nextInt();
       int r=1;
              for(int i=1;i<=b;i++)
	       { 
                   r=r *a;
 	 	}
 
    	  System.out.println(a+"^"+b+"="+r);
 
    }
 
}

