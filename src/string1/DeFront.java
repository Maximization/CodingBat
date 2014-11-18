/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string1;

public class DeFront {
	public String deFront(String str) {
		String result = "";

		if (str.length() >= 1 && str.substring(0, 1).equals("a")) {
			result = result + "a";
		}

		if (str.length() >= 2 && str.substring(1, 2).equals("b")) {
			result = result + "b";
		}

		if (str.length() >= 3) {
			return result + str.substring(2);
		}

		return result;
	}
}
