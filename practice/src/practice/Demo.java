package practice;

import java.util.Scanner;

public class Demo {
	public static void main(String arg[])
	  {
		  int x,y,a,b;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the x:");
		  x=sc.nextInt();
		  System.out.println("enter the y:");
		  y=sc.nextInt();
		  a=x+y;
		  b=y-x;
		  System.out.println("x="+x);
		  System.out.println("y="+y);
		  System.out.println("a="+a);
		  System.out.println("b="+b);
	  }
}
