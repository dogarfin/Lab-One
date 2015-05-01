import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends Shape {
	int width;
	int height;
	Color color;
	
	public Rectangle(Point position, int width, int height, Color color) {
		super (position);
		this.color = color;
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(this.color);
		g.fillRect(this.position.x - this.width / 2, this.position.y - this.height / 2, this.width, this.height);
		g.setColor(Color.BLACK);
		g.drawRect(this.position.x - this.width / 2, this.position.y - this.height / 2, this.width, this.height);
	}

	@Override
	public boolean contains(Point target) {
		// TODO Auto-generated method stub
		if ((target.x >= position.x - this.width / 2
				&& target.x <= this.position.x + this.width / 2) &&
				(target.y >= this.position.y - this.height / 2
				&& target.y <= this.position.y + this.height / 2)) {
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		return "Recgtangle at " + this.position;
	}
}
