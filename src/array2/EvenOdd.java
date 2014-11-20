/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package array2;

public class EvenOdd {
	public int[] evenOdd(int[] nums) {
		int end = nums.length - 1;

		for (int i = 0; i < end; i++) {
			if (nums[i] % 2 == 1) {
				int temp = nums[i];
				nums[i] = nums[end];
				nums[end] = temp;
				end--;
				i--;
			}
		}

		return nums;
	}
}
