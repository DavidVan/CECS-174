public class ApproxPi {
	public static void main(String[] args) {
		partA();
		partB();
		partC();
		partD();
	}
	public static void partA() {
		double denominator = 1.0;
		double approxPi = 0.0;
		int sign = 1;
		for (int i = 0; i < 100; i++) {
			approxPi = approxPi + sign*4.0/(denominator);
			denominator = denominator + 2.0;
			sign = sign*-1;
		}
		System.out.println("Part A: Approximation of Pi to 100 terms is = " + approxPi);
	}
	public static void partB() {
		double approxPi = 0.0;
		for (int i = 1; i <= 100; i++) {
			approxPi = approxPi + (1.0/(Math.pow(i, 4)));
		}
		approxPi = Math.pow(90*approxPi, (1.0/4.0));
		System.out.println("Part B: Approximation of Pi to 100 terms is = " + approxPi);
	}
	public static void partC() {
		double approxPi = 0.0;
		for (int i = 1; i <= 400; i = i + 4) {
			approxPi = approxPi + (1.0/(i*(i+2)));
		}
		approxPi = approxPi*8;
		System.out.println("Part C: Approximation of Pi to 100 terms is = " + approxPi);
	}
	public static void partD() {
		double approxPi = 0.0;
		int sign = 1;
		for (int i = 0; i < 100; i++) {
			approxPi = approxPi + sign*(1/(Math.pow(3, i)*((2*i)+1)));
			sign = sign*-1;
			}
		approxPi = approxPi*(6*Math.sqrt(1.0/3.0));
		System.out.println("Part D: Approximation of Pi to 100 terms is = " + approxPi);
	}
}