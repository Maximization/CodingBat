/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package string3;

public class NotReplace {
	public String notReplace(String str) {
		String result = "";

		if (str.length() <= 1) {
			return str;
		} else if (str.length() == 2 && str.equals("is")) {
			return str + " not";
		}

		for (int i = 0; i < str.length(); i++) {
			if (i <= str.length() - 2 && str.substring(i, i + 2).equals("is")) {
				if (i == 0) {
					if (!Character.isLetter(str.charAt(i + 2))) {
						result += "is not";
						i++;
						continue;
					}
				} else if (i == str.length() - 2) {
					if (!Character.isLetter(str.charAt(i - 1))) {
						result += "is not";
						i++;
						continue;
					}
				} else if (!Character.isLetter(str.charAt(i + 2)) && !Character.isLetter(str.charAt(i - 1))) {
					result += "is not";
					i++;
					continue;
				}
			}

			result += str.charAt(i);
		}

		return result;
	}
}
