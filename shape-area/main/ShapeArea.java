package main;

public class ShapeArea {

	public static int shapeArea(int n) {

		if (n > 1) {
			return (n * n) + ((n-1)*(n-1));
		}

		return n;

	}
}
