package skilligence;
import java.util.Scanner;
import java.util.ArrayList;

public class Sechigh
{
   public static void main (String args[])
    {
        int[] a= new int[5];
        int highest=Integer.MIN_VALUE;
        int sechigh=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length; i++)
        {
        	 
			if (a[i] > highest)
			{
				sechigh = highest;
				highest = a[i];
 
			}
			else if (a[i] > sechigh && a[i]!=highest)
			{
				sechigh = a[i];
 
			}
		}
 
		System.out.println("Second largest number is:" + sechigh);
 
	}

    }

