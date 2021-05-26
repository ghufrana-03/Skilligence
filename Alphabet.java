package skilligence;

import java.util.Scanner;

public class Alphabet {
	
	    public static void main(String args[])
	    {
	        char ch;
	        Scanner sc = new Scanner(System.in);
			
	        System.out.print("Enter a Character : ");
	        ch = sc.next().charAt(0);
			
	       if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z'))
	        
	       // if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
	        {
	            System.out.print(ch + " is an character");
	        }
	        else
	        {
	            System.out.print(ch + " is not an character");
	        }
	    }
	}


