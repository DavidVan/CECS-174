import javax.swing.*;//for windows with KOptionPane and scrollbar
import java.text.DecimalFormat;//for double formatting
class DivideByTwoWithWindows {
	public static void main(String[] args){
		DecimalFormat dc = new DecimalFormat("##000.00000");//3 left of decimal, 5 right
		String num,divisions;//note !!
		double number;
		int numberOfDivisions,i;
		//First Create a window called my window
		JOptionPane myWindow = new JOptionPane();//create a window
		num=myWindow.showInputDialog("Enter the number to divide by 2:");//num is a string
		number=Integer.parseInt(num);//you need this to convert the string input to an integer
		divisions=myWindow.showInputDialog("How many divisions do you want to perform?:");
		numberOfDivisions=Integer.parseInt(divisions);//convert string input to an integer	
		//Now create a white pane called a JTextArea inside the window with JTextArea
		JTextArea outputInPane = new JTextArea(10,20);//The white pane is 10 rows& 20characters.
		//Put a heading inside the white pane
		outputInPane.setText("Division"+"\t"+"result\n");//first row of output is a heading
		//keep appending to the outputInpane with the entire program output
		for(i=0;i<=numberOfDivisions;i++){
			outputInPane.append("Division #"+i+"\t"+dc.format(number)+"\n");
			number=number/2.0;
		}
		//AoutputInPane contains the entire output, we want to put it into the white JTextArea
		//But we want the JTextArea to have a scrollbar so here is where the scroller gets added
		JScrollPane scroller = new JScrollPane(outputInPane);
		//The result is a window with a scrollbar
		JOptionPane.showMessageDialog(null,scroller,"Scroll bar of Divisions",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);//stops program when you click the right corner X
	}
}
