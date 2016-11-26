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


		

		ABC.show();


	}

}

class ABC
{

	public static void show()
	{

		System.out.println("my name is mahlon");
	}

}