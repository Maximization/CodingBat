/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package string3;

public class EqualIsNot {
	public boolean equalIsNot(String str) {
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < str.length(); i++) {
			if (i <= str.length() - 2 && str.substring(i, i + 2).equals("is")) {
				count1++;
			} else if (i <= str.length() - 3 && str.substring(i, i + 3).equals("not")) {
				count2++;
			}
		}

		return count1 == count2;
	}
}
