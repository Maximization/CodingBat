/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class Post4 {
	public int[] post4(int[] nums) {
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				index = i + 1;
			}
		}

		int[] array = new int[nums.length - (index)];

		for (int i = 0; i < array.length; i++) {
			array[i] = nums[i + index];
		}

		return array;
	}
}
