
public class Point {
	int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double distanceTo(Point other) {
		int dx = this.x - other.x;
		int dy = this.y - other.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
