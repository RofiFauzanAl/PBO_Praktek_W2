import java.util.*;

public class Soal5_PBO {
	public static void main(String[] args) {
		Scanner input_string = new Scanner(System.in);
		
		System.out.println("Input String for A and B :");
		System.out.print("Input String A : ");
		String A = input_string.nextLine();
		System.out.print("Input String B : ");
		String B = input_string.nextLine();
		
		//Length of String A and B
		System.out.println((A.concat(B)).length());
		
		//Conditional to compare String A and String B (Lexicographically)
		if(A.compareTo(B) > 0)
		{
			System.out.println("* Yes ");
		}
		else if (A.compareTo(B) == 0)
		{
			System.out.println("* Same String ");
		}
		else 
		{
			System.out.println("* No ");
		}
		
		//Convert String A and String B to array of character
		char[] StringA_arr = A.toCharArray();
		char[] StringB_arr = B.toCharArray();
		
		//Make char in index 0 capitalize
		StringA_arr[0] -= 32;
		StringB_arr[0] -= 32;
		
		//Convert back array of char to String
		A = new String(StringA_arr);
		B = new String(StringB_arr);
		
		System.out.println( A + " " + B);
	}
}
