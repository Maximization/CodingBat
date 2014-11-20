/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package string3;

public class SumDigits {
	public int sumDigits(String str) {
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Integer.parseInt(str.substring(i, i + 1));
			}
		}

		return sum;
	}
}
