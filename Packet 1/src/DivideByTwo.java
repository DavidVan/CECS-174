import java.text.DecimalFormat;//for double formatting
import java.util.Scanner;//for user input
import java.text.DecimalFormat;//for double formatting
import java.util.Scanner;//for user input
class DivideByTwo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);//declare object scan
		DecimalFormat dc = new DecimalFormat("######.000000");//not quite the same as money
		double number;
		int numberOfDivisions,i;
		System.out.print("Enter the number to divide by 2: ");
		number=scan.nextInt();
		System.out.print("How many divisions do you want to perform?: ");
		numberOfDivisions=scan.nextInt();
		for(i=0;i<=numberOfDivisions;i++){
			System.out.println("Division#"+"\t"+dc.format(number));
			number=number/2.0;
		}
	}
}
