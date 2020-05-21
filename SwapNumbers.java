
public class SwapNumbers {

	public static void main(String[] args) {
		
		// Swap two numbers without using a 3rd variable:
		
		int num1 = 3;
		int num2 = 5;
		
		num1 ^= num2;
		num2 ^= num1;
		num1 ^= num2;
		
		System.out.print("num1 is: " + num1 + "\nnum2 is: " + num2);
		/* Output: num1 is: 5 
		 *         num2 is: 3
		 */
	}

}
