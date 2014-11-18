/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class Pre4 {
	public int[] pre4(int[] nums) {
		int index = 0;

		while (true) {
			if (nums[index] == 4) {
				break;
			}

			index++;
		}

		int[] array = new int[index];

		for (int i = 0; i < array.length; i++) {
			array[i] = nums[i];
		}

		return array;
	}
}
