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
}