import java.awt.Container;
import java.util.Scanner;

import javax.swing.JFrame;


public class One extends JFrame {
	One(int numberOfCircles) {
		Two a = new Two(numberOfCircles);
		Container stud = this.getContentPane();
		stud.add(a);
		this.setVisible(true);
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfCircles = Integer.parseInt(scan.next());
		One a = new One(numberOfCircles);
	}

}
