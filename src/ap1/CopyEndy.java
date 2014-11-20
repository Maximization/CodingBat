/**
 * created by Maxim Orlov on 20 Nov 2014
 */
package ap1;

public class CopyEndy {
	public int[] copyEndy(int[] nums, int count) {
		int[] array = new int[count];
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (isEndy(nums[i])) {
				array[index] = nums[i];
				index++;
			}

			if (index == count) {
				break;
			}
		}

		return array;
	}

	public boolean isEndy(int n) {
		return (n <= 10 || n >= 90 && n <= 100);
	}
}
