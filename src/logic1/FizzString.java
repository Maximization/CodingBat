/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class FizzString {
	public String fizzString(String str) {
		if (str.startsWith("f") && str.endsWith("b")) {
			return "FizzBuzz";
		}

		if (str.charAt(0) == 'f') {
			return "Fizz";
		}

		if (str.charAt(str.length() - 1) == 'b') {
			return "Buzz";
		}

		return str;
	}
}
