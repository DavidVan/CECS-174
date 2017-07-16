import java.text.DecimalFormat;
public class MathEvaluation {
	public static void main(String[] args) {
		double answer = 0.0;
		DecimalFormat df = new DecimalFormat("0.0000000000");
		for (int x = 1; x <= 10; x++) {
			answer = answer + 1-Math.pow(Math.E, -2*x);
			System.out.println("At x = " + x + ", the answer to 1-e^(-2x) is " + df.format(answer));
		}
		System.out.println("___________________________________");
		System.out.println("The sum of the above is: " + df.format(answer));
	}
}
