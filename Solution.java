import java.util.*;

public class Solution{
	public static void main(String[] args){
		//create a Scanner object
		Scanner input = new Scanner(System.in);

		//take input
		String orgString = input.next();

		//get reverse char array
		char[] revString = reverseString(orgString);

		//Print the original String
		System.out.println("Original:\t" + orgString);

		//Pring the reversed String
		System.out.print("Reversed:\t");
		for (char c : revString){
			System.out.print(c);
		}
		System.out.println();
	}

	public static char[] reverseString(String name){
		//convert the string to a char array
		char[] nameChar = name.toCharArray();

		//char array to hold the reverse chars
		char[] revChar = new char[nameChar.length];

		//fill the reverse array
		for(int i = 0; i < revChar.length; i++){
			revChar[i] = nameChar[nameChar.length - 1 - i];
		}

		return revChar;
	}
}