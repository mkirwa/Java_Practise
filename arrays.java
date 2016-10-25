/**************************************************
1. Array to print the length of an array
2. Array to reverse the array
*/

import java.util.Scanner;

public class arrays{


	public static void main(String[]args)

	{
		
		 printarray();

	}

	public static void printarray()

	{

		// Creating a scanner object
			Scanner input = new Scanner (System.in);

		//inputing the length of an array
		int x = input.nextInt();

		int [] array = new int[x];


		for(int i=0; i<array.length; i++)

		{

			array[i]=input.nextInt();

		}

		for(int j=array.length - 1; j>=0; j--)

		{	

			System.out.printf(" %d ",array[j]);

		}



	}



}