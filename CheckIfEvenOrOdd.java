
public class CheckIfEvenOrOdd {

	public static void main(String[] args) {
		
		// Check whether a number is even or odd without % operator:
		
		int num1 = 999;

		System.out.println((num1 & 1) == 0 ? "EVEN" : "ODD" );   // Output: ODD
		
		int num2 = 10;

		System.out.println((num2 & 1) == 0 ? "EVEN" : "ODD" );   // Output: EVEN

	}

}
