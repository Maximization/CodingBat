/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class SwapEnds {
	public int[] swapEnds(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;

		return nums;
	}
}
