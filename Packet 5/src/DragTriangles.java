// Drags a triangle to a new location using the position of the mouse to
// determine how to move the polygon.
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class DragTriangles extends Applet implements MouseListener, MouseMotionListener {
	private int[] x1 = {0, 50, 100}; // note that x is an array
	private int[] y1 = {50, 0, 50}; // note that y is an array
	private Polygon p1 = new Polygon(x1, y1, 3);
	private int[] x2 = {75, 100, 125}; // note that x is an array
	private int[] y2 = {75, 50, 75}; // note that y is an array
	private Polygon p2 = new Polygon(x2, y2, 3);
	private int[] x3 = {111, 125, 138}; // note that x is an array
	private int[] y3 = {88, 75, 88}; // note that y is an array
	private Polygon p3 = new Polygon(x3, y3, 3);
	private int oldx1;
	private int oldy1;
	private int oldx2;
	private int oldy2;
	private int oldx3;
	private int oldy3;
	
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillPolygon(p1);
		g.setColor(Color.GREEN);
		g.fillPolygon(p2);
		g.setColor(Color.RED);
		g.fillPolygon(p3);
	}
	public void mousePressed(MouseEvent event) {
		int x1 = event.getX();
		int y1 = event.getY();
		int x2 = event.getX();
		int y2 = event.getY();
		int x3 = event.getX();
		int y3 = event.getY();
		if (p1.contains(x1, y1)) {// see if you are in the triangle, if you are save (x,y)
			oldx1 = x1;
			oldy1 = y1;
		}
		if (p2.contains(x2, y2)) {
			oldx2 = x2;
			oldy2 = y2;
		}
		if (p3.contains(x3, y3)) {
			oldx3 = x3;
			oldy3 = y3;
		}
	}
	public void mouseReleased(MouseEvent event) {
		
	} // must list but do nothing
	public void mouseClicked(MouseEvent event) {
		
	} // must list but do nothing
	public void mouseEntered(MouseEvent event) {
		
	} // must list but do nothing
	public void mouseExited(MouseEvent event) {
		
	}// same
	public void mouseMoved(MouseEvent event) {
		
	}// same
	public void mouseDragged(MouseEvent event) {
		int x1 = event.getX();// keep finding new x values as  you drag
		int y1 = event.getY();// keep finding new x values as  you drag
		int x2 = event.getX();
		int y2 = event.getY();
		int x3 = event.getX();
		int y3 = event.getY();
		if (p1.contains(x1, y1)) {// make sure you are in the triangle
			p1.translate(x1-oldx1, y1-oldy1);// get a new x and y but take away the old ones
			oldx1 = x1;// This really is a trick. Keep moving to a new position
			oldy1 = y1;// and the mouseDragged keeps updating the position automatically.
			repaint();
		}
		if (p2.contains(x2, y2)) {
			p2.translate(x2-oldx2, y2-oldy2);
			oldx2 = x2;
			oldy2 = y2;
			repaint();
		}
		if (p3.contains(x3, y3)) {
			p3.translate(x3-oldx3, y3-oldy3);
			oldx3 = x3;
			oldy3 = y3;
			repaint();
		}
	}
}
