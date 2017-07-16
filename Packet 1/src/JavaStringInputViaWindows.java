import java.text.*;//for strings
import javax.swing.*;//for JOptionPane
class JavaStringInputViaWindows {
	public static void main(String[] args){
		JOptionPane myWindow;
		myWindow = new JOptionPane();
		myWindow.setSize(300,200);
		myWindow.setVisible(true);
		String firstName, middleName, lastName;
		String fullName;
		String initials;
		firstName= myWindow.showInputDialog("Enter your first Name: ");
		middleName= myWindow.showInputDialog("Enter your middle Name: ");
		lastName= myWindow.showInputDialog("Enter your last Name: ");
		fullName = firstName+" "+middleName+" "+lastName;
		initials=firstName.substring(0,1)+middleName.substring(0,1)+lastName.substring(0,1);
		myWindow.showMessageDialog(null,"Your Full Name is: "+fullName);
		//null means show in this window only
		myWindow.showMessageDialog(null," having the initials: "+initials);
		System.exit(0);//when you click OK it is still running, exit(0) click X
		
	}
}
