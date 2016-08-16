/*******************************************************
 * Source Material (c) 2016 GCD
 * All rights reserved
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Please enter a string to test:  ");
		String str = scan1.nextLine();
		
		if(checkPalindrome(str))
		   System.out.println("The string is Palindrome!");
		else
			System.out.println("The string is not Palindrome!");
	}
	
	public static boolean checkPalindrome(String text)
	{
		
		int i=0;
		for (i=0;i< text.length()/2;i++)
		{
			if (text.charAt(i)!= text.charAt(text.length()-i-1))
			{
				return false; 
			}
			
		}
		return true;
		
	}

}
