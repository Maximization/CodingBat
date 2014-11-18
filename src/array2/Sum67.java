/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class Sum67 {
	public int sum67(int[] nums) {
		int sum = 0;
		int onoff = 0;

		if (nums.length == 0) {
			return sum;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				onoff = 1;
			}

			if (onoff == 0) {
				sum += nums[i];
			}

			if (nums[i] == 7) {
				onoff = 0;
			}
		}

		return sum;
	}
}
