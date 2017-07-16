//Problem 1
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Problem1 {
	public static void main(String[] args) {
		String firstName, middleName, lastName, middleNameInitial;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		firstName = scan.nextLine();
		System.out.print("Enter your middle name: ");
		middleName = scan.nextLine();
		System.out.print("Enter your last name: ");
		lastName = scan.nextLine();
		middleNameInitial = middleName.substring(0,2).toUpperCase();
		JOptionPane.showMessageDialog(null, "Your name is: "+lastName+", "+firstName+", "+middleNameInitial+".");
	}
}