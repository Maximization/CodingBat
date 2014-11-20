/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class CommonTwo {
	public int commonTwo(String[] a, String[] b) {
		int count = 0;
		int indexA = 0;
		int indexB = 0;
		String last = null;

		while (indexA < a.length && indexB < b.length) {
			if (a[indexA].compareTo(b[indexB]) < 0) {
				indexA++;
				continue;
			} else if (a[indexA].compareTo(b[indexB]) > 0) {
				indexB++;
				continue;
			} else if (!a[indexA].equals(last)) {
				last = a[indexA];
				count++;
			}

			indexA++;
			indexB++;
		}

		return count;
	}
}
