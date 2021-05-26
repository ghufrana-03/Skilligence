package skilligence;

import java.util.Scanner;

public class Classtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FIZZ BUZZ
		Scanner sc= new Scanner(System.in);
		/*
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%3==0&&n%5==0)
			System.out.println("Fizz Buzz");
		else if(n%3==0)
			System.out.println("Fizz");
		else if(n%5==0)
			System.out.println("Buzz");
		else
			System.out.println(n);
                                   */
		// calculator using switch
		/*
	    System.out.println("Enter first number");
	   int num1 = sc.nextInt();
	   System.out.println("Enter second number");
	   int num2 = sc.nextInt();
	   System.out.println("Choose an operator: +, -, *, / or %");
       char	 operator = sc.next().charAt(0);
        int res;
	    switch (operator) 
	    {
	      case '+':
	        res = num1 + num2;
	        System.out.println(res);
	        break;
	      case '-':
	        res = num1 - num2;
	        System.out.println( res);
	        break;
	      case '*':
	        res = num1 * num2;
	        System.out.println( res);
	        break;
	      case '/':
	        res = num1 / num2;
	        System.out.println( res);
	        break;
	      case '%':
	    	  res=num1%num2;
	    	  System.out.println(res);
	    	  break;
	      default:
	        System.out.println("Invalid operator!");
	        break;
	        }
                                                                */
		// break statement
		/*
		for(int i=0;i<=10;i++) {
			if(i==6)
				break;
			System.out.println(i);
			
		}
		*/
		//Continue
		/* 
		for(int i=0;i<=10;i++)
		{
			if(i==6)
			continue;
			System.out.println(i);
		}
		*/
		// prime number
		/*
		 System.out.println("Enter a number");
		 int num=sc.nextInt();
		 boolean flag=false;
		    for (int i = 2; i <= num / 2; ++i) {
		      if (num % i == 0)
		      {
		    	  flag=true;
		    	  break;
		    }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		                                                               */
		//ARMSTRONG NUMBER
		/*
		int  a, temp, total = 0;
        System.out.println("Enter anumber");
        int n=sc.nextInt();
        a = n;
        while (a != 0)
        {
            temp = a % 10;
            total = total + temp*temp*temp;
            a /= 10;
        }

        if(total == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
		                                                            */
		
		
		//PALINDROME
		
		/*
		
		 int  rev = 0, rem;
		 System.out.println("Enter a number");
		 int n=sc.nextInt();
		    int Num = n;
		    while (n != 0) {
		      rem = n % 10;
		      rev = rev* 10 + rem;
		      n /= 10;
		    }
		    if (Num == rev) {
		      System.out.println(Num + " is Palindrome.");
		    }
		    else {
		      System.out.println(Num + " is not Palindrome.");
		    }
		
		                                                          */
		
		//squareroot
		/*
		
		System.out.println("Enter a number: ");  
        int num = sc.nextInt(); 
        int a=0;
        for( int i = 1; i*i <=num; ++i)
        	a=i;
         System.out.println("Square root of given number "+ a);
                                                                    */       
 
		
		
		// PRIME NUMBER BY USING SQUARE ROOT
		/*
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				flag=1;
			break;
		}
		if(flag==1)
		{
			System.out.println("It is not a prime number");
		}
		else
			System.out.println("It is  a prime number");
	                                                                    */
		
		
		
		// SQUARE ROOT WITH PRECISION
		
		/*
		
		System.out.println("enter the number to calculate square root");
        int n=sc.nextInt();
        System.out.println("Enter the number of decimal places");
        int p=sc.nextInt();
        double res=0.0;
        for(int i=1;i*i<=n;i++)
        {
        	res=i;
        }
        double inc=0.1;
        for(int i=1;i<=p;i++)
        {
        	while(res*res<=n)
        	{
        		res=res+inc;
        	}
        	res=res-inc;
        	inc=inc/10;
        }
		System.out.println("Square root of the given number is = "+(float)res);
		
		
		                                                                                              */
		
				
		
		
		

		
		
		
		
		
		
		
		
		
		
			
						
			
			
			
			
		}
}    
		
		
		
	


