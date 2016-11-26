// Without using static 

/*
public class StaticProp
{

	public static void main(String [] args)
	{


		ABC obj = new ABC();

		obj.show();


	}

}

class ABC
{

	public void show()
	{

		System.out.println("my name is mahlon");
	}

}

*/

public class StaticProp
{

	public static void main(String [] args)
	{


		//using static variable


		ABC.i = 5;
		ABC.show();


	}

}

class ABC
{

	//Using static variables

	//You cannot declare a variable before the static method and use it.
	//You can only do that by making the variable static
	//For example
	
	Static int i;

	public static void show()
	{

		System.out.println("my name is mahlon");
	}

}