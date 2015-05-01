import java.awt.Graphics;

abstract public class Shape {
	Point position;
	public Shape(Point position) {
		this.position = position;
	}
	abstract public void draw(Graphics g);
	abstract public boolean contains(Point target);
	public void move(Point target) {
		this.position = target;
	}
}
