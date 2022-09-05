import java.util.*;

public class Soal1_PBO {
	public static void main(String[] args) {
		double input_number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value : ");
		input_number = input.nextDouble();
		
		/* Check Condition value can be fitted in long  */
		/* Why long because long has a greater value than integer and short */
		if(input_number >= Long.MIN_VALUE && input_number <= Long.MAX_VALUE) 
		{
			System.out.println(input_number + " can ber fitted in :");
			if (input_number >= Short.MIN_VALUE && input_number <= Short.MAX_VALUE)
			{
				System.out.println("* short");
			}
			if (input_number >= Integer.MIN_VALUE && input_number <= Integer.MAX_VALUE)
			{
				System.out.println("* integer");
			}
			System.out.println("* long");
		}
		else 
		{
			System.out.println(input_number + " can't be fitted anywhere");
		}
		
	}
}
