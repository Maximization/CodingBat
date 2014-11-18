/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class GetSandwich {
	public String getSandwich(String str) {
		int a = str.indexOf("bread");
		int b = str.lastIndexOf("bread");

		if (a == b) {
			return "";
		}

		return str.substring(a + 5, b);
	}
}
