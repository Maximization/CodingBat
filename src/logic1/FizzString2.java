/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class FizzString2 {
	public String fizzString2(int n) {
		boolean f = n % 3 == 0;
		boolean b = n % 5 == 0;

		if (f && b) {
			return "FizzBuzz!";
		} else if (f) {
			return "Fizz!";
		} else if (b) {
			return "Buzz!";
		}

		return n + "!";
	}
}
