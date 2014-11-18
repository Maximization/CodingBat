/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class MaxEnd3 {
	public int[] maxEnd3(int[] nums) {
		if (nums[0] > nums[2]) {
			nums[1] = nums[0];
			nums[2] = nums[0];
		} else {
			nums[0] = nums[2];
			nums[1] = nums[2];
		}

		return nums;
	}
}
