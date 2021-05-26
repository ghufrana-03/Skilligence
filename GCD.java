package skilligence;

import java.util.Scanner;

public class GCD {

		  public static void main(String[] args) {
          
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter two numbers");
			  int a=sc.nextInt();
			  int b=sc.nextInt();
//            int gcd=b%a;
//			  while(gcd!=0)
//			  {
//				  a=gcd;
//				  b=a;
//				  gcd=b%a;
//			  }
			  int gcd=1,lcm=1;
			  for(int i=1;i<=a&&i<=b;i++)
			  {
				  if(a%i==0&&b%i==0)
					  gcd=i;
			  }
		    System.out.println("GCD of " + a +" and "+ b + " is: " +gcd);
		    lcm=(a*b)/gcd;
		    System.out.println("LCM of "+ a +" and " + b +" is : "+lcm);
		  }			  
			  
}
