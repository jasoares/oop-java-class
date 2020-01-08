package io.jaisoares.geo;

public class Point {
	public int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public Point add(Point other) {
		return new Point(this.x + other.x, this.y + other.y);
	}

	public Point subtract(Point other) {
		Point negativeOther = new Point(-other.x, -other.y);
		return this.add(negativeOther);
	}
}
