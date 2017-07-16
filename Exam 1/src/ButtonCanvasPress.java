//*Use Canvas instead of the default "this" frame panel*/
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class ButtonCanvasPress extends Applet{ //Applet Not JApplet
	private Button squares = new Button("Squares");
	private Button circles = new Button("Circles");
	private Button clear = new Button("Erase");
	private Draw canvas = new Draw();
	public void init() {
		add(squares);
		add(circles);
		add(clear);
		squares.addActionListener(canvas);
		circles.addActionListener(canvas);
		clear.addActionListener(canvas);
		add(canvas);
		canvas.setBackground(Color.YELLOW);
		canvas.setSize(150, 150);
	}//end init
	class Draw extends Canvas implements ActionListener {
		Object source;//make global to event and paint
		public void actionPerformed(ActionEvent event) {
			source = event.getSource();
			repaint();
		}
		public void paint(Graphics g) { //use this to write on yellow box not the
			if(source == squares) {		//Entire window i.e."Draw" overrides "paint()"
				g.fillRect(0, 0, 50, 50);
				g.fillRect(50, 50, 50, 50);
				g.fillRect(100, 100, 50, 50);
			}
			else if(source == circles) {
				g.fillOval(0, 0, 75, 75);
				g.fillOval(75, 0, 75, 75);
				g.fillOval(0, 75, 75, 75);
				g.fillOval(75, 75, 75, 75);
			}
			else if(source == clear) {
				repaint();
			}
		}//end paint
	}//end Draw
}//end ButtonCanvasPress