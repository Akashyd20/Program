package Strings;

import java.util.Scanner;

public class Lexical {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two strings");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		if(str1.compareTo(str2)<0)
		{
			System.out.println("string "+str1+" is Lexicographically larger than "+str2);
		}
		else
		{
			System.out.println("string "+str1+" is Lexicographically smaller than "+str2);
		}
	}

}
