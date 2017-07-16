/*Combine Windows with input and opening and closing textfile*/
import javax.swing.JOptionPane;//for dialog box
import javax.swing.JTextArea;//for text listing
import java.text.*;//for text formatting
import java.util.*;//for scanner needed to read the file
import java.io.*;//for opening text file
class OpenTextFile_B {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		JOptionPane myWindow;
		myWindow = new JOptionPane();
		String fileName;
		fileName = myWindow.showInputDialog("Enter External Text File to Open:");
		//no need to convert to string fileName is already a string!
		Scanner scanner = new Scanner(new File(fileName));
		JTextArea outputOriginalFile = new JTextArea();//output of the original file
		outputOriginalFile.setText("The Original File was:\n");
		while (scanner.hasNext()) {
			String fullName = scanner.nextLine();//entire linefirst middle&last&names
			outputOriginalFile.append(fullName+"\n");
		}
		myWindow.showMessageDialog(null, outputOriginalFile, "Opened file....", myWindow.INFORMATION_MESSAGE);
		//Prepare for output
		PrintWriter pw = new PrintWriter(new File("outputOfFile.txt"));//External file
		String firstName, middleName, lastName;
		JTextArea outputTextArea = new JTextArea();
		outputTextArea.setText("The Modified Text File is:\n");
		Scanner scanner2 = new Scanner(new File(fileName));//reset the read pointer
		while (scanner2.hasNext()) {
			String fullName = scanner2.nextLine();//get the first middle & last names
			StringTokenizer st = new StringTokenizer(fullName, " ");
			firstName = st.nextToken();
			middleName = st.nextToken();
			lastName = st.nextToken();
			//output to the external filed called "outputOfFile.txt"
			pw.println(lastName+", "+firstName+" "+middleName.substring(0,1)+".");
			//Also now print it to the dialog box.
			outputTextArea.append(lastName+", "+firstName+" "+middleName.substring(0,1)+"."+"\n");
		}
		//put a heading in the window heading
		myWindow.showMessageDialog(null, outputTextArea, "Results....", myWindow.INFORMATION_MESSAGE);
		scanner.close();
		scanner2.close();
		pw.close();
	}
}
