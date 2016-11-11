import java.util.*;
public class ArrayAddition{
	public static void main(String[] args){

		//create two arrays
		int[][] arr1 = new int[][] { new int[] {1, 2, 3, 4}, new int[] {5, 6, 7, 8}};
		int[][] arr2 = new int[][] { new int[] {1, 2, 3, 4}, new int[] {5, 6, 7, 8}};

		System.out.printf("A   = %10s\n",Arrays.deepToString(arr1));
		System.out.printf("B   = %10s\n",Arrays.deepToString(arr2));

		int[][] sum = new int[arr1.length][arr1[0].length];

		sum = addArrays(arr1, arr2);

		System.out.printf("Sum = %10s\n", Arrays.deepToString(sum));

	}

	public static int[][] addArrays(int[][] a, int[][] b){
		int[][] result = new int[a.length][a[0].length];
		
		for(int row = 0; row < a.length; row++){

			for(int col = 0; col < a[row].length; col++){

				result[row][col] = a[row][col] + b[row][col];
			}
		}

		return result;
	}
}