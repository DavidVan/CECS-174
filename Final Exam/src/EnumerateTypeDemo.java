// The following is an example of java enumerated types
import java.util.Arrays;
import java.text.*;
import javax.swing.*;
public class EnumerateTypeDemo {
	enum Month {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
	public static void main(String[] args) {
		JOptionPane myWindow = new JOptionPane();
		JTextArea text = new JTextArea(6, 20);
		JScrollPane scrollpane = new JScrollPane(text);
		text.append("#\tDay\n");
		Month[] months = Month.values(); // here is where the assignment is made.
		for (int i = months.length-1; i >= 0; i--) {
			if (i > 0) {
				text.append(i+1 + "\t" + months[i].toString() + "\n");
			}
			else {
				text.append(i+1 + "\t" + months[i].toString());
			}
		}
		myWindow.showMessageDialog(null, scrollpane, "MONTHS OF THE YEAR", JOptionPane.INFORMATION_MESSAGE);
	}
}
