/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

/* COMMENTS
 * 1. File name in java should the class name in Java
 * 2. Use 'https://repl.it/languages/java' OR 'https://ideone.com' to write and run your java
 * 3. Code should be well indented. Use 'http://codebeautify.org/javaviewer' to indent your code properly. 
 */
public class SumOfPrimes2 {
	
	public static void main(String[] args) {
		int twoMillion = 2 * 1000 * 1000;
		int sumOfPrimes = 0;

		// All numbers below 2M; means 1 - 2000000
		// 1 is neither prime nor composite
		// So numbers to be considered: 2 - 2000000
		for (int j = 2; j <= twoMillion; j++) {
			boolean isThisNumberPrime = isNumberPrime(j);
			System.out.println("Number considered: " + j + "\tIs Prime: " + isThisNumberPrime);
			if (isThisNumberPrime) {
				sumOfPrimes += j;
			}
		}
		
		System.out.println("Sum of primes below 2M: " + sumOfPrimes);
	}
	
	private static boolean isNumberPrime(int n) {
		for (int number = n - 1; number > 1; number--) {
			if (n % number == 0) { // It means 'n' is divisible by a number other than 1 and n = > Non-prime
				return false;
			}
		}
		
		return true;
	}
}
