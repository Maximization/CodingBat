/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string3;

public class CountYZ {
	public int countYZ(String str) {
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'y' || str.charAt(i) == 'z' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z') {
				if (!Character.isLetter(str.charAt(i + 1))) {
					count++;
				}
			}
		}

		if (str.charAt(str.length() - 1) == 'y' || str.charAt(str.length() - 1) == 'z'
				|| str.charAt(str.length() - 1) == 'Y' || str.charAt(str.length() - 1) == 'Z') {
			count++;
		}

		return count;
	}
}
