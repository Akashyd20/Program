//Program to sum the lengths of two strings
package Strings;

import java.util.Scanner;

public class StrSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println("The length of first String is : "+str1.length());
		System.out.println("The length of second String is : "+str2.length());
		String sum=str1+str2;
		System.out.println("The concatenated String is : "+sum);
		System.out.println("The length of the concatenated String is : "+sum.length());
		
	}

}
