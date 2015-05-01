import javax.swing.JComponent; 
import java.util.ArrayList; 
import java.awt.Graphics; 
import java.awt.Color; 
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 
import java.awt.event.MouseMotionListener; 

public class Two extends JComponent 
                 implements MouseListener, 
                            MouseMotionListener 
{

  public void mouseMoved(MouseEvent e) { }
  public void mouseDragged(MouseEvent e) { 
    int x = e.getX(), y = e.getY(); 
    if (selected != null) {
      selected.move(new Point(x, y)); 
    } 
    System.out.println( selected ); // if we forget the next statement: debug 
    this.repaint();     
    // uncomment the call to repaint 
  }

  public void mouseEntered(MouseEvent e) { }
  public void mouseExited(MouseEvent e) { }
  Shape selected; 

  public void mousePressed(MouseEvent e) { 
    int x = e.getX(), y = e.getY(); 
    System.out.println( "Mouse pressed at (" + x + ", " + y + ")" ); 
    for (Shape c : this.circles) {
      if (c.contains(new Point(x, y))) {
        selected = c; 
        // break; 
      } 
    } 
  }

  public void mouseReleased(MouseEvent e) { 
    selected = null; 
  }
  public void mouseClicked(MouseEvent e) { }

  ArrayList<Shape> circles; 
  Two(int numberOfCircles) {
    this.addMouseMotionListener(this); 
    this.addMouseListener(this); 
    this.circles = new ArrayList<Shape>(); 
    for (int i = 0; i < numberOfCircles; i++) {
      this.circles.add( 
	   (Math.random() > .5) ?
        new Circle (
          new Point( (int)(Math.random() * 400), 
                     (int)(Math.random() * 400)), 
          (int)(Math.random() * 40 + 20), 
          new Color(
                      (int)(Math.random() * 255), 
                      (int)(Math.random() * 255), 
                      (int)(Math.random() * 255))) :
		new Rectangle (
          new Point( (int)(Math.random() * 400), 
                     (int)(Math.random() * 400)), 
          (int)(Math.random() * 40 + 20), 
		  (int)(Math.random() * 40 + 20),
          new Color(
                      (int)(Math.random() * 255), 
                      (int)(Math.random() * 255), 
                      (int)(Math.random() * 255)))
					  ); 
    }    
  } 
  public void paintComponent(Graphics g) {
    for (Shape c : this.circles) 
      c.draw(g); 
  }  
}