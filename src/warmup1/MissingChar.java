/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class MissingChar {
	public String missingChar(String str, int n) {
		return str.substring(0, n) + str.substring(++n);
	}
}
