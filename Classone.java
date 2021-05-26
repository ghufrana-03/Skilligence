package skilligence;
import java.util.Scanner;

public class Classone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	//String str=sc.nextLine();
	//System.out.println(str);
	//System.out.println("Give a number:");
	//int age=sc.nextInt();
	//System.out.println("The number is :" + age);
//float marks=sc.nextFloat();
	/* swapping using thord variable
int temp;
System.out.println("Enter the numbers a.b: ");
int a = sc.nextInt();
System.out.println("a="+a);
int b =sc.nextInt();
System.out.println("b="+b);

temp=a;
a=b;
b=temp;
System.out.println("After   Swapping a="+a );
System.out.println("b="+b);
*/
	//swapping without third variable
	/*
    System.out.println("Enter two numbers");
    int a = sc.nextInt();
    System.out.println("a=" + a);
    int b=sc.nextInt();
    System.out.println("b=" +b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping");
    System.out.println("a=" +a);
    System.out.println("b=" +b);
    */
	
	
	
	/* Number is even or not
	int a=sc.nextInt();
	System.out.println("nember is a=" + a);
	if(a%2==0) {
         System.out.println("Number is even");
	}
	else {
		
	
		System.out.println("Number is odd");
	} */

// calculator20
/*	
	
	System.out.println("Enter two numbers");
	int a=sc.nextInt();
	System.out.println("a=" +a);
	int b=sc.nextInt();
	System.out.println("b=" +b);
	System.out.println("Enter the operation");
	char op=sc.next().charAt(0);
	int res;
	if (op=='+')
			{
		res=a+b;
		System.out.println("The addition of two numbers is " + res);
			}
	else if(op=='-')
	{
		res=a-b;
		System.out.println("The subtraction of two numbers is "+ res);
	}
	else if(op=='*')
	{
		res=a*b;
		System.out.println("The multiplication of two nymbers is"+ res);
	}
	else if(op=='/')
	{
		res=a/b;
		System.out.println("The division of two numbers is"+ res);s
		
	}
	else if(op=='%')
	{
		res=a%b;
		System.out.println("The modulus of two numbers is"+ res);
	}	
 */
	System.out.println("Enter a character");
	char ch=sc.next().charAt(0);
	if(ch== 'a' || 'b'||'i'||'o'||'u')
	{
		System.out.println("It is vowel");
	}
	else 
	{
		System.out.println("It id consonent");
	}
	}

}


