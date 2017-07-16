// Frames-Panels-Panes, examples continue* /a frame with a  grid of different colored panels
import javax.swing.*; // for JFrame and JPanel.
import java.awt.*; // for Color and Containers
public class GUIWindow {
	public static void main(String[] args) {
		JFrame theGUI = new JFrame();
		theGUI.setTitle("Frame with 2x2 different colored panels");
		theGUI.setSize(300, 200);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel Panel_1 = new JPanel();
		Panel_1.setBackground(Color.green);
		JPanel Panel_2 = new JPanel();
		Panel_2.setBackground(Color.blue);
		JPanel Panel_3 = new JPanel();
		Panel_3.setBackground(Color.red);
		JPanel Panel_4 = new JPanel();
		Panel_4.setBackground(Color.yellow);
		Container pane = theGUI.getContentPane();
		pane.setLayout(new GridLayout(2,2));
		pane.add(Panel_1);
		pane.add(Panel_2);
		pane.add(Panel_3);
		pane.add(Panel_4);
		theGUI.setVisible(true);
	}// end main
}// end class GUIWindow
