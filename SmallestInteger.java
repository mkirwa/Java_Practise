

import java.util.Scanner;

//Finding the smallest of a list of integers

public class SmallestInteger

{


	public static void main(String[]args)

	{

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();


		double min = input.nextDouble();

		for(int i = 0; i < n-1; i++)

		{


			double a = input.nextDouble();

			if(a < min)

			{

				min=a;
			}



		}


		System.out.println("the minimum value is "+min);

	}



}