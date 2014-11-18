/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package recursion1;

public class Triangle {
	public int triangle(int rows) {
		if (rows == 0) {
			return 0;
		}

		return rows + triangle(rows - 1);
	}
}
