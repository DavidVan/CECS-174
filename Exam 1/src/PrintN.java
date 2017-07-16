public class PrintN {
	public static void main(String[] args) {

		// Start Output
		System.out.println("n\t\tn!\t\tStirling n!\tGosper n!");
		for(int n = 1; n <= 12; n++) {
			System.out.println(n+"\t\t"+realN(n)+"\t\t"+Math.round(stirlingN(n))+"\t\t"+Math.round(gosperN(n)));
		}
		//System.out.println(Math.round(stirlingN(8)));
		//System.out.println(Math.round(gosperN(8)));
		
	}
	
	// Actual Value Of n!
	public static int realN(int n) {
		int factorial = 1;
		for(int i = 1; i <= n; i++) {
			factorial*= i;
		}
		return factorial;
	}
	
	// Approximation Of n! Via Stirling
	public static double stirlingN(int n) {
		double factorial = 0;
		return factorial = Math.sqrt(2*Math.PI)*(Math.pow(n, (n+(1.0/2.0)))*Math.pow(Math.E, (-n+(1.0/(12.0*n)))));
	}
	
	// Approximation Of n! Via Gosper
	public static double gosperN(int n) {
		double factorial = 0;
		return factorial = Math.sqrt(((2*n)+(1.0/3.0))*Math.PI)*((Math.pow(n, n)*(Math.pow(Math.E, -n))));
	}
	
}