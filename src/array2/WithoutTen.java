/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package array2;

public class WithoutTen {
	public int[] withoutTen(int[] nums) {
		int[] array = new int[nums.length];
		int end = nums.length - 1;
		int begin = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 10) {
				array[end] = 0;
				end--;
			} else {
				array[begin] = nums[i];
				begin++;
			}
		}

		return array;
	}
}
