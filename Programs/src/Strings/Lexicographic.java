//Program to sort an array lexicographically
package Strings;

public class Lexicographic {

	public static void main(String[] args) {
		String[] words= {"ruby","c","python","java","hello"};
		System.out.println("The array before sorting is :");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		for(int i=0;i<words.length-1;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].compareTo(words[j])>0)
				{
					String temp =words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
		System.out.println("after sorting :");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}

	}

}
