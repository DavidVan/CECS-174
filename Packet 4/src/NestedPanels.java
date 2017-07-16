// Presents two colored panels nested within a third.
import java.awt.*;
import javax.swing.*;
public class NestedPanels {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Nested Panels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel subPanel1 = new JPanel();
		subPanel1.setPreferredSize(new Dimension(150, 100));
		subPanel1.setBackground(Color.green);
		JLabel label1 = new JLabel("One");
		subPanel1.add(label1);
		JPanel subPanel2 = new JPanel(); // Set up second subpanel
		subPanel2.setPreferredSize(new Dimension(150, 100));
		subPanel2.setBackground(Color.red);
		JLabel label2 = new JLabel("Two");
		subPanel2.add(label2);
		JPanel primary = new JPanel(); // Set up primary panel
		primary.setBackground(Color.blue);
		primary.add(subPanel1);
		primary.add(subPanel2);
		frame.getContentPane().add(primary);
		frame.pack(); // Let the OS handle the resizing and refitting
		frame.setVisible(true);
	}
}
