package io.jaisoares.geo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter coordinates x and y for point P (e.g. \"1, 3\")");
		String pCoords = sc.nextLine();
		int pX = Integer.parseInt(pCoords.split(",\\s*")[0]);
		int pY = Integer.parseInt(pCoords.split(",\\s*")[1]);
		Point p = new Point(pX, pY);

		System.out.println("Enter coordinates x and y for point Q (e.g. \"2, 6\")");
		String qCoords = sc.nextLine();
		int qX = Integer.parseInt(qCoords.split(",\\s*")[0]);
		int qY = Integer.parseInt(qCoords.split(",\\s*")[1]);
		Point q = new Point(qX, qY);

		// Close your scanner to avoid memory leaks and free resources
		sc.close();

		Point r = p.add(q);
		Point s = p.subtract(q);

		System.out.println(p + " + " + q + " = " + r);
		System.out.println(p + " - " + q + " = " + s);
	}
}
