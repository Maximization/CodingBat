/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class CopyEvens {
	public int[] copyEvens(int[] nums, int count) {
		int[] array = new int[count];
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				array[index] = nums[i];
				index++;
			}

			if (index == count) {
				break;
			}
		}

		return array;
	}
}
