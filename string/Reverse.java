package string;

import java.util.Scanner;
public class Reverse 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.nextLine();
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		System.out.println("Reverse string is"+reverse);
		if(s1.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("non palindrome");
		}
	}

}
