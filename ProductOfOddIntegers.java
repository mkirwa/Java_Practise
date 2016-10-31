/////////////////////////////////
//////Calculating odd integers from 1 to 15 using arrays



import java.util.Scanner;

public class ProductOfOddIntegers

{



		public static void main(String[]args)

		{
			//Product of odd integers using arrays



			//Creating a scanner object
			Scanner input = new Scanner (System.in);

			int x = input.nextInt();
			
			int array[] = new int[x];

			int product = 1;


			for(int i = 0; i< x; i++)
			{
				array[i] = input.nextInt();
			}


			for(int j = 0; j< array.length; j++)
			{
				if(array[j]%2==1)
				{
				product = product * array[j];
			    }

			}

			System.out.println(product);

		}


		



public class ProductOfOddIntegers()

			{



		

			int product=1;
			
			
			for(int i = 1; i<=15 ; i=i+2)
			{

				product = product * i;

			}

			System.out.println(product);


	


}