/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class EndUp {
	public String endUp(String str) {
		if (str.length() >= 3) {
			return str.substring(0, str.length() - 3)
					+ str.toUpperCase().substring(str.length() - 3);
		}

		return str.toUpperCase();
	}
}
