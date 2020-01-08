package io.jaisoares.geo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter coordinates x and y for point P (e.g. \"1, 3\")");
		Point p = Point.read(br);
		System.out.println("Enter coordinates x and y for point Q (e.g. \"1, 3\")");
		Point q = Point.read(br);

		Point r = p.add(q);
		Point s = p.subtract(q);

		System.out.println(p + " + " + q + " = " + r);
		System.out.println(p + " - " + q + " = " + s);
		System.out.println(p + " == " + q + " // => " + (p == q));
		System.out.println(p + ".equals(" + q + ") // => " + p.equals(q));

		p.setX(3);
		System.out.println("p.setX(3) // => " + p);
		System.out.println("p.getY() // => " + p.getY());

		br.close();
	}
}
