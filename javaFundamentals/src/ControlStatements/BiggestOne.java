package ControlStatements;

import java.util.Scanner;

public class BiggestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,z;
Scanner sc=new Scanner(System.in);
 System.out.println("enter the first number");
 x=sc.nextInt();
System.out.println("enter the Second number");
y=sc.nextInt();
System.out.println("enter the third number");
z=sc.nextInt();
if((x>z)&&(x>y))
{
	System.out.println("x");
}
else if((y>z)&&(y>x))
{
	System.out.println("y");
}
else if((z>x)&&(z>x))
{
	System.out.println("z");
}
	}

}
