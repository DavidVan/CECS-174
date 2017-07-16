import javax.swing.JOptionPane;
class DIYProblem15 {
	public static void main(String[] args){
		String firstName, lastName;
		JOptionPane myWindow = new JOptionPane();
		firstName = myWindow.showInputDialog("Enter your first Name: ");
		lastName = myWindow.showInputDialog("Enter your last Name: ");
		myWindow.showMessageDialog(null, "Formally your name is: "+lastName+", "+firstName.substring(0,1)+".");
	}
}
