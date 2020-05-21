import java.math.BigInteger;

public class CheckIfPrime {

	public static void main(String[] args) {
		
		// Check whether a number is prime or not:
		
		int isPrime = 113;
		
		System.out.println("Is prime?: " + BigInteger.valueOf(isPrime).isProbablePrime(1));
		// Output: Is prime?: true
	}

}
