//EVENTS CONTINUED. Uses a draw button
//to request drawing the selected shape in the selected color.
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Select extends Applet {
	Button draw = new Button("Draw");
	DrawOn canvas = new DrawOn();
	Choice color = new Choice();
	CheckboxGroup shapes = new CheckboxGroup();
	Checkbox square = new Checkbox("Square", false, shapes);
	Checkbox circle = new Checkbox("Circle", true, shapes);
	Checkbox newShape = new Checkbox("NewShape", false, shapes);
	public void init() {
		add(draw);
		add(color);
		add(square);
		add(circle);
		add(newShape);
		add(canvas);
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Black");
		color.select(0);
		canvas.setSize(150, 150);
		draw.addActionListener(canvas);
	}
	class DrawOn extends Canvas implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			repaint();
		}
		public void paint(Graphics g) {
			Color c;
			if(color.getSelectedItem().equals("Red")) {
				c = Color.red;
			}
			else if(color.getSelectedItem().equals("Green")) {
				c = Color.green;
			}
			else if(color.getSelectedItem().equals("Blue")) {
				c = Color.blue;
			}
			else {
				c = Color.black;
			}
			g.setColor(c);
			if(circle.getState()) {
				g.fillOval(20,20,100,100);
			}
			else if(square.getState()) {
				g.fillRect(20, 20, 100, 100);
			}
			else {
				g.drawLine(0, 0, 150, 150);
				g.drawLine(150, 0, 0, 150);
				g.drawLine(0, 75, 150, 75);
				g.drawLine(75, 0, 75, 150);
			}
		}
	}
}