/*display several text listing results of processing in a dialog box.*/
import javax.swing.JOptionPane;//for dialog box
import javax.swing.JTextArea;//for text listing
import java.text.*;//for text formatting
//import java.util.*;//for scanner not needed
import java.io.*;//for opening text file
class dialogTextListing {
	public static void main(String[] args) {
		double total, amount, rate;
		amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount you want to invest."));
		rate = Double.parseDouble(JOptionPane.showInputDialog("Enter the rate for your investment."));
		JOptionPane myWindow;
		myWindow = new JOptionPane();
		// Currency Output format!!
		DecimalFormat myMoney;
		myMoney = new DecimalFormat("0.00");
		//create a blank text area to show the listing
		JTextArea outputTextArea = new JTextArea();
		//Put a heading on the listing with the following
		outputTextArea.setText("Year\t Total\n");
		//use the formula for compound interest total=amount(1+rate)^year
		for (int year = 1; year <=10; year++) {
			total = amount*Math.pow(1.0+rate, year);
			outputTextArea.append(year+"\t $"+myMoney.format(total)+"\n");
		}
		//display in message window
		myWindow.showMessageDialog(null, outputTextArea, "My Results Are!!", myWindow.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
