// This is an example for mouse events.
// Note you must define all 5 of these mouse actions with Mouselistener
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class WorkWithMouse1 extends Applet implements MouseListener {
	private int x = 0, y = 0;
	private String mouse = "";
	public void init() {
		addMouseListener(this);
	}// end init
	public void paint(Graphics g) {
		g.drawString(mouse, x, y);
		if(mouse.equals("")) {
			g.drawOval(x, y, 40, 40);
		}
	}// end paint
	public void mousePressed(MouseEvent event) { // hold the mouse down without clicking
		x = event.getX();						 // For this to work hold down a long time
		y = event.getY();
		mouse = ("("+x+", "+y+")"); // Show the position in pixels
		repaint();
	}// end mousepressed
	public void mouseReleased(MouseEvent event) { // erase the (x,y)
		mouse = "";
		repaint();
	}// end mouseReleased
	public void mouseClicked(MouseEvent event) { // leave the (x,y) up withou eraseing
		x = event.getX();
		y = event.getY();
		mouse = ("("+x+", "+y+")");
		repaint();
	}// end mouseClicked
	public void mouseEntered(MouseEvent event) { // mouse is inside the applet window
		mouse = "Got the mouse";
		repaint();
	}// end mouseEntered
	public void mouseExited(MouseEvent event) { // mouse has been moved out of window
		mouse = "Lost the mouse";
		repaint();
	}// end mouse Exited
}// end work with mouse
