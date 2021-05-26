package skilligence;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String args[])
	{
		String s="racecar";
		
		// palindrome using  a stringbuilder
		
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb);
		System.out.println(sb.reverse().equals(sb));
		
		//System.out.println(isPalindrome(s));
	}
	
//	public static boolean isPalindrome(String s)
//	{
//	int i=0;
//	int j=s.length()-1;
//	while(i<j)
//	{
//		if(s.charAt(i)!=s.charAt(j))
//			return false;
//		i++;
//		j--;
//	}
//	return true;
//	}
}
