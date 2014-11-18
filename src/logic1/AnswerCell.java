/**
 * created by Maxim Orlov on 18 Nov 2014
 */
package logic1;

public class AnswerCell {
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep) {
			return false;
		} else if (isMom) {
			return true;
		} else if (isMorning) {
			return false;
		} else {
			return true;
		}
	}
}
