package skilligence;

import java.util.Scanner; 

public class LCM {

	 public static void main(String[] args) {
         
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter two numbers");
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int lcm=1;
		  if(a>b)
			  lcm=a;
		  else
			  lcm=b;
		  while(true)
		  {
			  if(lcm%a==0&&lcm%b==0)
				  
			  {
				  System.out.println(lcm);
				  break;
			  }
			  lcm++;
		  }
}

	 
}