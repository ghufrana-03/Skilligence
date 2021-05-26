package skilligence;

import java.util.Scanner;

public class THREE {
	
	// FUNCTIONS
	
	/*
	public static void fun()
	
	{
		System.out.println("Inside fun");
	}
	
	    */
	
	
	/* returning int
	
	public static int fun()
	{
		return 1;
	}
	                              */
	
	// ncr value using function
	
	/*
	 * 
	 */
	public static int fact(int n)
	{
		int f=1;
		
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
		
	}
	
	public static void main(String args[])
	{
		int ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		System.out.println("Enter r value");
		int r=sc.nextInt();
	    ans=fact(n)/(fact(n-r)*fact(r));
	    System.out.println(ans);
	    
                                                      */
                                                      
                                                      
                                                      
                                                      
                                                      
                                                      
	}

}
  