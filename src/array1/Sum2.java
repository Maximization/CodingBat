/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class Sum2 {
	public int sum2(int[] nums) {
		if (nums.length >= 2) {
			return nums[0] + nums[1];
		} else if (nums.length == 1) {
			return nums[0];
		}

		return 0;
	}
}
