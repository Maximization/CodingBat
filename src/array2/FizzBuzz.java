/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package array2;

public class FizzBuzz {
	public String[] fizzBuzz(int start, int end) {
		String[] str = new String[end - start];
		int index = 0;

		for (int i = start; i < end; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				str[index] = "FizzBuzz";
			} else if (i % 5 == 0) {
				str[index] = "Buzz";
			} else if (i % 3 == 0) {
				str[index] = "Fizz";
			} else {
				str[index] = String.valueOf(i);
			}

			index++;
		}

		return str;
	}
}
