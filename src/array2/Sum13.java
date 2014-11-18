/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array2;

public class Sum13 {
	public int sum13(int[] nums) {
		int sum = 0;

		if (nums.length == 0) {
			return sum;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				i++;
			} else {
				sum += nums[i];
			}
		}

		return sum;
	}
}
