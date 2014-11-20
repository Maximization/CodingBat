/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package string3;

public class MaxBlock {
	public int maxBlock(String str) {
		if (str.length() == 0) {
			return 0;
		}

		int count = 1;
		int streak = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				streak++;
				count = Math.max(count, streak);
			} else {
				streak = 1;
			}
		}

		return count;
	}
}
