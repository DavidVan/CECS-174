// EVENTS CONTINUED Uses a draw button to request drawing the selected shape in the //selected color.
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Select extends Applet{
	Button draw = new Button("Draw");
	DrawOn canvas = new DrawOn();
	Choice color = new Choice();
	CheckboxGroup shapes = new CheckboxGroup();
	Checkbox square = new Checkbox("Square", false, shapes);
	Checkbox circle = new Checkbox("Circle", true, shapes);
	Checkbox triangle = new Checkbox("Triangle", false, shapes);
	Checkbox fourPointedTriangle = new Checkbox ("4-Pointed Star", false, shapes);
	Checkbox sixPointedTriangle = new Checkbox ("6-Pointed Star", false, shapes);
	int[] x = {75, 150, 0};
	int[] y = {0, 150, 150};
	Polygon triangleShape = new Polygon(x, y, 3);
	int[] x1 = {75, 100, 150, 100, 75, 50, 0, 50};
	int[] y1 = {0, 50, 75, 100, 150, 100, 75, 50};
	Polygon fourPointedTriangleShape = new Polygon(x1, y1, 8);
	int[] x2 = {70, 120, 20};
	int [] y2 = {8, 108, 108};
	Polygon sixPointedTriangleShapePart1 = new Polygon(x2, y2, 3);
	int[] x3 = {20, 120, 70};
	int [] y3 = {43, 43, 143};
	Polygon sixPointedTriangleShapePart2 = new Polygon(x3, y3, 3);
	public void init() {
		setSize(600,200);
		add(draw);
		add(color);
		add(square);
		add(circle);
		add(triangle);
		add(fourPointedTriangle);
		add(sixPointedTriangle);
		add(canvas);
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Yellow");
		color.add("Black");
		color.select(0);
		canvas.setSize(150,150);
		draw.addActionListener(canvas);
	}
	class DrawOn extends Canvas implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			repaint();
		}
		public void paint(Graphics g) {
			Color c;
			if (color.getSelectedItem().equals("Red")) {
				c = Color.red;
			}
			else if (color.getSelectedItem().equals("Green")) {
				c = Color.green;
			}
			else if (color.getSelectedItem().equals("Blue")) {
				c = Color.blue;
			}
			else if (color.getSelectedItem().equals("Yellow")) {
				c = Color.yellow;
			}
			else {
				c = Color.black;
			}
			g.setColor(c);
			if (circle.getState()) {
				g.fillOval(20,20,100,100);
			}
			else if (square.getState()) {
				g.fillRect(20,20,100,100);
			}
			else if (triangle.getState()) {
				g.fillPolygon(triangleShape);
			}
			else if (fourPointedTriangle.getState()) {
				g.fillPolygon(fourPointedTriangleShape);
			}
			else {
				g.fillPolygon(sixPointedTriangleShapePart1);
				g.fillPolygon(sixPointedTriangleShapePart2);
			}
		}
	}
}
