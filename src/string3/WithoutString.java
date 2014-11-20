/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package string3;

public class WithoutString {
	public String withoutString(String base, String remove) {
		remove = remove.toLowerCase();
		int index = 0;

		while (true) {
			index = base.toLowerCase().indexOf(remove);

			if (index == -1) {
				break;
			}

			base = base.substring(0, index) + base.substring(index + remove.length());
		}

		return base;
	}
}
