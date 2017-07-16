// Draw a circle centered in the Applet frame 1/2 the width in diameter
// This took me forever to figure out the math. The draw oval uses rectangles at corner
// (x,y) and grows off this...*/
import java.awt.*;
import javax.swing.*;
public class CenteredSquare extends JApplet {
	public void init() {
	}
	public void paint(Graphics g) {
		// if you want to change color use g.setColor(Color.red);
		int h = getSize().height;//get the default height of the applet frame size
		int w = getSize().width;//get the default width of the applet frame size
		int SquareCenterHeight=h/2-10;
		int SquareCenterWidth=w/2-10;
		for (int i=20; i < h; i=i+20) {
			g.drawRect(SquareCenterWidth, SquareCenterHeight, i, i);
			SquareCenterWidth=SquareCenterWidth-10;
			SquareCenterHeight=SquareCenterHeight-10;
			
		}
	}
}
