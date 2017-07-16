import javax.swing.*;
class WorkingWithJavaStrings2 {
	public static void main(String[] args){
		JOptionPane myWindow;
		myWindow = new JOptionPane();
		myWindow.setSize(300,200);
		myWindow.setVisible(true);
		String firstName, middleName, lastName;
		String fullName;
		String initials;
		firstName="Alex";
		middleName="Robert";
		lastName="Keaton";
		fullName = firstName+" "+middleName+" "+lastName;
		initials = firstName.substring(0,1)+middleName.substring(0,1)+lastName.substring(0,1);
		myWindow.showMessageDialog(null,"Your Full Name is: "+fullName);
		//null means show in this window only
		myWindow.showMessageDialog(null," havng the initials: "+initials);
		System.exit(0);//when you click OK it is still running, exit(0) click x
	}
}
