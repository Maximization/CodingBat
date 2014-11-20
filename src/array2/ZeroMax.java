/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package array2;

public class ZeroMax {
	public int[] zeroMax(int[] nums) {
		int[] array = new int[nums.length];
		int max = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] % 2 == 1 && nums[i] > max) {
				max = nums[i];
			}

			if (nums[i] == 0) {
				array[i] = max;
			} else {
				array[i] = nums[i];
			}
		}

		return array;
	}
}
