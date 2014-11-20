/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package string3;

public class SumNumbers {
	public int sumNumbers(String str) {
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			String number = "";

			if (Character.isDigit(str.charAt(i))) {
				number += str.charAt(i);

				for (int j = i + 1; j < str.length(); j++) {
					if (!Character.isDigit(str.charAt(j))) {
						break;
					}

					number += str.charAt(j);
					i++;
				}

				sum += Integer.parseInt(number);
			}
		}

		return sum;
	}
}
