package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.ShapeArea;

public class ShapeAreaTest {

	int n;
	
	@Test
	public void shouldReturnAreaForPolygonOneAs1() {
		n = 1;
		int result = ShapeArea.shapeArea(n);
		assertEquals(1, result);
		
	}
	
}
