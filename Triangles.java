

///


public class Triangles
{



	public static void main(String[]args)
	{



		triangle2();

		System.out.println ("another triangle");

		triangle1();




	}




		public static void triangle2()

		{


				for (int i = 0; i < 5; i++)
        {



            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }



            for (int k = 1; k <= i + 1; k++) 

            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
 			




		}




		public static void triangle1()

		{



			for(int i=0; i<5 ; i++)

			{



				for(int j=i ; j<5 ; j++)

				{

					System.out.print("*");

				}

				System.out.println("");

			}


		}

		



}