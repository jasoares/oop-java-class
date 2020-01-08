package io.jaisoares.geo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter coordinates x and y for point P (e.g. \"1, 3\")");
		Point p = readPoint(br);
		System.out.println("Enter coordinates x and y for point Q (e.g. \"1, 3\")");
		Point q = readPoint(br);

		Point r = p.add(q);
		Point s = p.subtract(q);

		System.out.println(p + " + " + q + " = " + r);
		System.out.println(p + " - " + q + " = " + s);

		br.close();
	}

	private static Point readPoint(BufferedReader br) throws IOException {
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
