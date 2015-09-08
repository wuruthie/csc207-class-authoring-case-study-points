
public class Point2D {
	public int x;
	public int y;
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}
	public Point2D(int w, int z) {
		this.x = w;
		this.y = z;
	}
	public Point2D add(int dx, int dy) {
		Point2D newPoint = new Point2D();
		newPoint.x += dx;
		newPoint.y += dy;
		return newPoint;
	}
	public void translate(Point2D point){
		this.x += point.x;
		this.y += point.y;
	}
	public double distance(int x, int y) {
		double computation = Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2));
		return computation;
	}
	public String toString(){
		return "(" + this.x + "," + this.y + ")";
	}
}
