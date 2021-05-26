package skilligence;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the min and max number");
		int min=sc.nextInt();
		int max=sc.nextInt();
		for(int n=min;n<=max;n++)
		{
			if(Armstrong(n))
				System.out.println(n);
		}
	}

public static boolean Armstrong(int n)
{
	int  a, temp, total = 0;
    a = n;
    while (a != 0)
    {
        temp = a % 10;
        total = total + temp*temp*temp;
        a /= 10;
    }

    if(total == n)
        return true;
    else
        return false;
	
}
	
}