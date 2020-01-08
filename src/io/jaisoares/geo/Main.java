package io.jaisoares.geo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter coordinate x for point P");
		int pX = sc.nextInt();
		System.out.println("Enter coordinate y for point P");
		int pY = sc.nextInt();

		System.out.println("Enter coordinate x for point Q");
		int qX = sc.nextInt();
		System.out.println("Enter coordinate y for point Q");
		int qY = sc.nextInt();

		// Close your scanner to avoid memory leaks and free resources
		sc.close();

		Point p = new Point(pX, pY);
		Point q = new Point(qX, qY);

		Point r = p.add(q);
		Point s = p.subtract(q);

		System.out.println(p + " + " + q + " = " + r);
		System.out.println(p + " - " + q + " = " + s);
	}
}
