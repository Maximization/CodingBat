/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package string2;

public class CatDog {
	public boolean catDog(String str) {
		int countcat = 0;
		int countdog = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				countcat++;
			} else if (str.substring(i, i + 3).equals("dog")) {
				countdog++;
			}
		}

		return (countcat == countdog);
	}
}
