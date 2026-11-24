package revision;

import java.util.Scanner;

public class Advancecalculator {
	 
	public static void add(int a,int b) {
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	public static void diff(int a,int b) {
		int diff=a-b;
		System.out.println("diff="+diff);
	}
	public static void multi(int a,int b) {
		int multi=a*b;
		System.out.println("multi="+multi);
	}
	public static void div(int a,int b) {
		int div=a/b;
		System.out.println("div="+div);
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int flag=1;
		while(flag==1) 
		{
		System.out.println("+,-,*,/");
		System.out.println("Enter the operation:");
		char op = s.next().charAt(0);
		System.out.println("Enter the first number:");
		int a=s.nextInt();
		System.out.println("Enter the second number:");
		int b=s.nextInt();
		
		switch(op) 
		{
		case '+' : add(a,b);
		break;
		case '-' : diff(a,b);
		break;
		case '*' : multi(a,b);
		break;
		case '/' : div(a,b);
		break;
		
		default : System.out.println("invalid");

		}
		
		System.out.println("enter 1 to continue \n enter 2 to stop");
		System.out.println("enter your choice:");
		flag = s.nextInt();
		}
		
		System.out.println("Thank you");
		s.close();
	}

}
	



