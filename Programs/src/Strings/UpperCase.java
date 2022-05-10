//Program to change the case of character in a string

package Strings;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings in lowercase");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(Character.toUpperCase(str1.charAt(0))+" "+Character.toUpperCase(str2.charAt(0)));

	}

	
}
