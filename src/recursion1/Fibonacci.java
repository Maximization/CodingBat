/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class Fibonacci {
	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
