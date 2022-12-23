package mypackage;

import java.util.Scanner;

public class Practical3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a String");
		String a = sc.nextLine();
		
		StringBuilder reverseString = new StringBuilder(a);
		reverseString.reverse();
		String result = reverseString.toString();
		
		System.out.println("Reversed String : "+result);
		
		System.out.println("Upper Case of String : "+a.toUpperCase());
		
	}

}