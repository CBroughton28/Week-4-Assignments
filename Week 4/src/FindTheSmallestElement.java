import java.util.*;
public class FindTheSmallestElement {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter ten numbers: "); 
			 		 
	double [] min = new double [11]; 
			 		 
		for (int i = 0 ; i < 9; i++) 
			min [i] = input.nextDouble(); 
			 		 
			input.close(); 
	System.out.print("The minimum number is : " + min(min)); 
	} 
		public static double min(double[] array){ 
			double small = Double.MAX_VALUE; 
			for (int i = 0 ; i < 9; i++) 
			if (array[i]<small) 
			small = array[i]; 
			return small; 
	}
}