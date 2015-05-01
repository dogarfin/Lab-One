import java.awt.Color; 
import java.awt.Graphics; 

public class Circle extends Shape{
  int radius; 
  Color color; 
  Circle(Point position, int radius, Color color) {
    super (position);
    this.radius = radius;
    this.color = color; 
  }
  public void draw(Graphics g) {
    g.setColor(this.color); 
    g.fillOval( this.position.x - this.radius, 
                this.position.y - this.radius, 
                this.radius * 2, 
                this.radius * 2); 
    g.setColor(Color.BLACK); 
    g.drawOval( this.position.x - this.radius, 
                this.position.y - this.radius, 
                this.radius * 2, 
                this.radius * 2);         
  } 
  public boolean contains(Point target) {
    return this.position.distanceTo(target) <= this.radius; 
  } 
  public String toString() {
    return "Circle at " + this.position; 
  } 
}