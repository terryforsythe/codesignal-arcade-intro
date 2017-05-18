package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.ShapeArea;

public class ShapeAreaTest {

	int n;
	int result;

	@Test
	public void shouldReturnAreaForPolygonOneAs1() {
		n = 1;
		result = ShapeArea.shapeArea(n);
		assertEquals(1, result);
	}

	@Test
	public void shouldReturnAreaForPolygonTwoAs5() {
		n = 2;
		result = ShapeArea.shapeArea(n);
		assertEquals(5, result);
	}

	@Test
	public void shouldReturnAreaForPolygonThreeAs13() {
		n = 3;
		result = ShapeArea.shapeArea(n);
		assertEquals(13, result);
	}

	@Test
	public void shouldReturnAreaForPolygonFiveAs41() {
		n = 5;
		result = ShapeArea.shapeArea(n);
		assertEquals(41, result);
	}

}
