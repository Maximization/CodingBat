/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class SumLimit {
	public int sumLimit(int a, int b) {
		int sum = a + b;
		String stringA = String.valueOf(a);
		String stringSum = String.valueOf(sum);

		if (stringA.length() != stringSum.length()) {
			return a;
		}

		return sum;
	}
}
