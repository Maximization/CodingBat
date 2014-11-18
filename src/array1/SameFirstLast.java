/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package array1;

public class SameFirstLast {
	public boolean sameFirstLast(int[] nums) {
		return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
	}
}
