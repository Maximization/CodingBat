/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup1;

public class StartOz {
	public String startOz(String str) {
		String result = "";

		if (str.length() >= 1 && str.charAt(0) == 'o') {
			result = result + "o";
		}

		if (str.length() >= 2 && str.charAt(1) == 'z') {
			result = result + "z";
		}

		return result;
	}
}
