package Basic;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int row=sc.nextInt();
		System.out.println("Enter the no of columns");
		int column=sc.nextInt();
		int arr[][] =new int [row][column];
		System.out.println("Enter the elements of matrix");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++) 
			{
				arr[i][j]=sc.nextInt();
			}
			System.out.println(" ");
		}
		System.out.println("the above matrix before transpose is:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("the above matrix after transpose is:");
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<column;j++) 
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println(" ");
		}
		// TODO Auto-generated method stub

	}

}
