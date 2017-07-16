// Demonstrates the use of frames, panels, and labels.
import java.awt.*;
import javax.swing.*;
public class Authority {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Authority");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel primary = new JPanel();
		primary.setBackground(Color.yellow);
		primary.setPreferredSize(new Dimension(250, 75));
		JLabel label1 = new JLabel("Question authority and");
		JLabel label2 = new JLabel("the moral majority is neither");
		primary.add(label1);
		primary.add(label2);
		frame.getContentPane().add(primary); // a panel in a frame
		frame.pack(); // let the OS handle the resize and refitting
		frame.setVisible(true);
	}
}
