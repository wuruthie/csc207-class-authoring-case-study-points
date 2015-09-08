import static org.junit.Assert.*;

import org.junit.Test;

public class Point2DTest {

	@Test
	public void testAdd() {
	  Point2D p1 = new Point2D();
	  Point2D p2 = p1.add(3,5);
	  assertEquals("p1.x = 0", 0, p1.x);
	  assertEquals("p1.y = 0", 0, p1.y);
	  assertEquals("p2.x = 3", 3,p2.x);
	  assertEquals("p2.y = 5", 5,p2.y);
	}
	
	@Test
	public void testTranslate(){
		Point2D p1 = new Point2D(3,5);
		Point2D p2 = new Point2D();
		p2.translate(p1);
		
		assertEquals("p1.x = 3", 3, p1.x);
		assertEquals("p1.y = 5", 5, p1.y);
		assertEquals("p2.x = 3", 3,p2.x);
		assertEquals("p2.y = 5", 5,p2.y);
	}
	@Test
	public void testToString(){
		Point2D p1 = new Point2D(3,5);
		Point2D p2 = new Point2D(2,2);
		Point2D p3 = new Point2D(0,0);
		String one = p1.toString();
		String two = p2.toString();
		String three = p3.toString();
		assertEquals("(3,5)", "(3,5)", one);
		assertEquals("(2,2)", "(2,2)",two);
		assertEquals("(0,0)", "(0,0)", three);
	}
	@Test
	public void testDistance() {
		Point2D p1 = new Point2D(2,0);
		Point2D p2 = new Point2D(0,0);
		Point2D p3 = new Point2D(-2,0);
		double one = p1.distance(p2.x,p2.y);
		double two = p2.distance(p3.x,p3.y);
		double three = p1.distance(p3.x,p3.y);

		assertEquals(2.0, one, .01);
		assertEquals(2.0, two, .01);
		assertEquals(4.0, three, .01);
		
	}
}
