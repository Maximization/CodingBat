/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package warmup2;

public class StringMatch {
	public int stringMatch(String a, String b) {
		int count = 0;
		int min = Math.min(a.length(), b.length());

		for (int i = 0; i < min - 1; i++) {
			if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
				count++;
			}
		}

		return count;
	}
}
