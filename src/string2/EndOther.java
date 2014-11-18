/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class EndOther {
	public boolean endOther(String a, String b) {
		String aLow = a.toLowerCase();
		String bLow = b.toLowerCase();

		if (aLow.length() >= bLow.length()) {
			if (aLow.substring(aLow.length() - bLow.length()).equals(bLow)) {
				return true;
			}
		}

		if (bLow.length() > aLow.length()) {
			if (bLow.substring(bLow.length() - aLow.length()).equals(aLow)) {
				return true;
			}
		}

		return false;
	}
}
