import javax.swing.*;
import java.util.Random;
public class rollPentadecahedronDie {
	public static void main(String[] args) {
		// Set Up Window
		JOptionPane myWindow = new JOptionPane();
		JTextArea myTextArea = new JTextArea(8, 20);
		JScrollPane myScrollPane = new JScrollPane(myTextArea);
		
		// Set Up Variables
		int roll;
		double average;
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;
		int r4 = 0;
		int r5 = 0;
		int r6 = 0;
		int r7 = 0;
		int r8 = 0;
		int r9 = 0;
		int r10 = 0;
		int r11 = 0;
		int r12 = 0;
		int r13 = 0;
		int r14 = 0;
		int r15 = 0;
		
		// Start Math
		Random myRandom = new Random();
		for(int i = 0; i<40000; i++) {
			roll = myRandom.nextInt(15);
			if(roll == 1) {
				r1++;
			}
			else if(roll == 2) {
				r2++;
			}
			else if(roll == 3) {
				r3++;
			}
			else if(roll == 4) {
				r4++;
			}
			else if(roll == 5) {
				r5++;
			}
			else if(roll == 6) {
				r6++;
			}
			else if(roll == 7) {
				r7++;
			}
			else if(roll == 8) {
				r8++;
			}
			else if(roll == 9) {
				r9++;
			}
			else if(roll == 10) {
				r10++;
			}
			else if(roll == 11) {
				r11++;
			}
			else if(roll == 12) {
				r12++;
			}
			else if(roll == 13) {
				r13++;
			}
			else if(roll == 14) {
				r14++;
			}
			else {
				r15++;
			}
		}
		average = (r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8 + r9 + r10 + r11 + r12 + r13 + r14 +r15)/15.0;
		
		//Add Text
		myTextArea.append("Face\tFrequency");
		myTextArea.append("\n1\t" + r1);
		myTextArea.append("\n2\t" + r2);
		myTextArea.append("\n3\t" + r3);
		myTextArea.append("\n4\t" + r4);
		myTextArea.append("\n5\t" + r5);
		myTextArea.append("\n6\t" + r6);
		myTextArea.append("\n7\t" + r7);
		myTextArea.append("\n8\t" + r8);
		myTextArea.append("\n9\t" + r9);
		myTextArea.append("\n10\t" + r10);
		myTextArea.append("\n11\t" + r11);
		myTextArea.append("\n12\t" + r12);
		myTextArea.append("\n13\t" + r13);
		myTextArea.append("\n14\t" + r14);
		myTextArea.append("\n15\t" + r15);
		myTextArea.append("\nWith an average of: " + Math.round(average));
		
		//Show Window
		myWindow.showMessageDialog(null, myScrollPane, "Rolling a Pentadecahedron 40000 Times", JOptionPane.INFORMATION_MESSAGE);
	}
}