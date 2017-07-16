// Getting input with ActionListener and Using Canvas to Paint.
// Use Canvas instead of the default "this" frame panel
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class ButtonCanvasPress extends Applet {
	public Button square = new Button("Square");
	public Button circle = new Button("Circle");
	public Button clear = new Button("Erase");
	public Draw canvas = new Draw();
	public void init() {
		add(square);
		add(circle);
		add(clear);
		square.addActionListener(canvas);
		circle.addActionListener(canvas);
		clear.addActionListener(canvas);
		add(canvas);
		canvas.setBackground(Color.YELLOW);
		canvas.setSize(150,150);
	}
	class Draw extends Canvas implements ActionListener {
		Object source;// make global to event and paint
		public void actionPerformed (ActionEvent event) {
			source = event.getSource();
			repaint();
		}
		public void paint (Graphics g) {// use this to write on yellow box, not the entire window
			if (source==square) {		 // i.e. "Draw" overrides "paint()"
				g.drawRect(50, 50, 50, 50);
			}
			else if (source==circle) {
				g.setColor(Color.BLUE);
				g.drawOval(63, 63, 25, 25);
			}
			else if (source==clear) {
				repaint();
			}
		}
	}
}
