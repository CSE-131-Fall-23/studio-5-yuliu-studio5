package studio5.debug;

import java.util.List;

import javax.swing.Icon;

import support.cse131.DrawCase;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
class DrawBullsEyesCase implements DrawCase {
	private final List<BullsEye> bullsEyes;
	private final String text;

	public DrawBullsEyesCase(List<BullsEye> bullsEyes, String text) {
		this.bullsEyes = bullsEyes;
		this.text = text;
	}

	public List<BullsEye> getBullsEyes() {
		return bullsEyes;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void draw() {
		for (BullsEye bullsEye : bullsEyes) {
			bullsEye.draw();
		}
	}

	@Override
	public Icon getIcon() {
		return null;
	}
}
