/* This Program is used to display the concept of Abstract Class.
   Basic Operations of a Calculator are made using functions */
import java.util.*;
abstract class Calc
{
	//following are the empty functions
	abstract double sum(double a,double b);       
	abstract double divide(double a,double b);
	abstract double multiply(double a,double b);
	abstract double subtract(double a,double b);
}
class Calculator extends Calc
{
	//Overriding functions
	double sum(double a,double b)
	{
		double result=a+b;
		return result;
	}
	double divide(double a,double b)
	{
		double result=a/b;
		return result;
	}
	double multiply(double a,double b)
	{
		double result=a*b;
		return result;
	}
	double subtract(double a,double b)
	{
		double result=a-b;
		return result;
	}
}
class Absclass
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		double a,b;
		Calculator c=new Calculator(); 
		System.out.print("Enter the two numbers : ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Sum of two numbers is : "+c.sum(a,b));
		System.out.println("Difference of two numbers is : "+c.subtract(a,b));
		System.out.println("Division of two numbers is : "+c.divide(a,b));
		System.out.println("Multiplication of two numbers is : "+c.multiply(a,b));
	}
}
