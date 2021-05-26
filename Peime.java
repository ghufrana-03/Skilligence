package skilligence;

import java.util.Scanner;

public class Peime {

	public static void main(String[] args)
	{
     Scanner sc=new Scanner(System.in);
	System.out.println("Enter the min number");
	int min=sc.nextInt();
	System.out.println("Enter the maximum range");
	int max=sc.nextInt();
				
				for(int n=min;n<=max;n++)
				{
					
					if(Prime(n))
					{
						System.out.println(n);
					}
				}
			}
			
			public static boolean Prime(int num)
			{	
				int count=0;
				for(int i = 1; i <= num; i++) 
				{
					
					if(num % i == 0)
					{
						count++;
					}
				}
				if(count==2)
				{
					return true;
					
				}
				else
				return false;
			}
}
