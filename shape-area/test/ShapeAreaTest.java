package test;

import main.ShapeArea;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShapeAreaTest {

	int n;

	private int shapeAreaResult() {
		return ShapeArea.shapeArea(this.n);
	}

	@Test
	public void shouldReturnAreaForPolygonOneAs1() {
		n = 1;
		assertEquals(1, shapeAreaResult());
	}

	@Test
	public void shouldReturnAreaForPolygonTwoAs5() {
		n = 2;
		assertEquals(5, shapeAreaResult());
	}

	@Test
	public void shouldReturnAreaForPolygonThreeAs13() {
		n = 3;
		assertEquals(13, shapeAreaResult());
	}

	@Test
	public void shouldReturnAreaForPolygonFiveAs41() {
		n = 5;
		assertEquals(41, shapeAreaResult());
	}

}
