/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class ShiftLeft {
	public int[] shiftLeft(int[] nums) {
		int[] array = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length - 1) {
				array[i] = nums[0];
			} else {
				array[i] = nums[i + 1];
			}
		}

		return array;
	}
}
