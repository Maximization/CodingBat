/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package array3;

public class LinearIn {
	public boolean linearIn(int[] outer, int[] inner) {
		int index = 0;

		for (int i = 0; i < outer.length; i++) {
			if (inner.length != 0 && outer[i] == inner[index]) {
				index++;
			}

			if (index == inner.length) {
				return true;
			}
		}

		return false;
	}
}
