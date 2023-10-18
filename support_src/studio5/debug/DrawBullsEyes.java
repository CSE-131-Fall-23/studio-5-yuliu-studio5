package studio5.debug;

import java.util.Arrays;
import java.util.List;

import support.cse131.DrawCase;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class DrawBullsEyes {
	private static DrawBullsEyesCase largeCenteredBullsEye() {
		BullsEye bullsEye = new BullsEye(0.5, 0.5, 0.5);
		String message = String.format("Does the screen show a single bull's eye centered in the window\n" +
				" - with an outer black ring,\n - a smaller blue ring,\n - an even smaller red ring,\n\t" +
				" - and a yellow center,\nwhere all ring's lines have the same width?");
		return new DrawBullsEyesCase(Arrays.asList(bullsEye), message);
	}

	private static DrawBullsEyesCase upperLeftBullsEye() {
		BullsEye bullsEye = new BullsEye(0.25, 0.75, 0.25);
		String message = String.format("Does the screen show a single bull's eye filling the upper left quadrant?");
		return new DrawBullsEyesCase(Arrays.asList(bullsEye), message);
	}

	private static DrawBullsEyesCase smallLowerRightBullsEye() {
		BullsEye bullsEye = new BullsEye(0.75, 0.25, 0.05);
		String message = String.format("Does the screen show a small bull's eye, in the lower right quadrant?");
		return new DrawBullsEyesCase(Arrays.asList(bullsEye), message);
	}

	private static DrawBullsEyesCase fourBullsEyes() {
		List<BullsEye> bullsEyes = Arrays.asList(new BullsEye(0.25, 0.75, 0.25), new BullsEye(0.25, 0.25, 0.25),
				new BullsEye(0.75, 0.25, 0.25), new BullsEye(0.75, 0.75, 0.25));
		String message = String.format("Does the screen show four bull's eyes, one filling each quadrant?");
		return new DrawBullsEyesCase(bullsEyes, message);
	}

	public static List<DrawCase> getCases() {
		return Arrays.asList(largeCenteredBullsEye(), upperLeftBullsEye(), smallLowerRightBullsEye(), fourBullsEyes());
	}
}
