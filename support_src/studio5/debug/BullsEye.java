package studio5.debug;

import studio5.Methods;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class BullsEye {
	private final double x;
	private final double y;
	private final double radius;

	public BullsEye(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	public void draw() {
		Methods.drawBullsEye(x, y, radius);
	}
}
