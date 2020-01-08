package io.jaisoares.geo;

public class Main {
	
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		Point q = new Point(3, 5);

		Point r = p.add(q);
		Point s = p.subtract(q);

		System.out.println(p + " + " + q + " = " + r);
		System.out.println(p + " - " + q + " = " + s);
	}
}
