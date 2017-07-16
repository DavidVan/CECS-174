import java.text.NumberFormat;//for money formatting
import java.util.Scanner;//for input
class TotalCarCost {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);//declare object scan
		NumberFormat money = NumberFormat.getCurrencyInstance();//declare money object
		double subTotal;
		double total, taxes=0.081, DMVfees=300.75;
		System.out.println("Your dream car costs how much?:");
		subTotal = scan.nextDouble();//user enter cost
		total = subTotal*(1.0+taxes) + DMVfees;
		System.out.println("The Total out of the door cost will be: "+money.format(total));
	}
}
