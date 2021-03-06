package io.jaisoares.geo;

import java.io.BufferedReader;
import java.io.IOException;

public class Point {
	public int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
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

	public Boolean equals(Point other) {
		return this.x == other.x && this.y == other.y;
	}

	public static Point read(BufferedReader br) throws IOException {
		int x, y;
		Point p = null;
		try {
			String[] coords = br.readLine().split(",\\s*");
			x = Integer.parseInt(coords[0]);
			y = Integer.parseInt(coords[1]);
			p = new Point(x, y);
		} catch (IOException ioe) {
			System.out.println("Error reading your point coordinates" + ioe);
		}
		return p;
	}
}
