
public class NumberOfDigits {

	public static void main(String[] args) {
		
		// Calculate the number of digits without looping or converting to String:
	
		int number = 123456;
		
		System.out.println("Number of digits: " + (int)((Math.floor(Math.log10(number))) + 1));
		// Output: Number of digits: 6
	}

}
