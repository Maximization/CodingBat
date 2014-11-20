/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class MergeTwo {
	public String[] mergeTwo(String[] a, String[] b, int n) {
		String[] array = new String[n];
		int index = 0;
		int indexA = 0;
		int indexB = 0;

		while (index < n) {
			if (a[indexA].compareTo(b[indexB]) < 0) {
				array[index] = a[indexA];
				indexA++;
			} else if (a[indexA].compareTo(b[indexB]) > 0) {
				array[index] = b[indexB];
				indexB++;
			} else {
				array[index] = a[indexA];
				indexA++;
				indexB++;
			}

			index++;
		}

		return array;
	}
}
