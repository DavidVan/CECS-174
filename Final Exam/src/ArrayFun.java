import java.util.ArrayList;
import java.util.Collections;
public class ArrayFun {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.println("Generating 400 random integers in the range 0<=x<100");
		System.out.println("The numbers generated are listed in a table");
		for (int i = 0; i < 400; i++) {
			array.add((int) (100*Math.random()));
			if (i%20 == 19) {
				System.out.println(array.get(i) + " ");
			}
			else {
				System.out.print(array.get(i) + " ");
			}
		}
		int sum = 0;
		for (int i = 0; i < 400; i++) {
			sum = sum + array.get(i);
		}
		double average = sum/400.0;
		double prevariance = 0.0;
		for (int i = 0; i < 400; i++) {
			prevariance = prevariance + Math.pow((average-array.get(i)), 2);
		}
		double variance = prevariance/(400.0-1.0);
		double standardDeviation = Math.sqrt(variance);
		Collections.sort(array);
		int smallest = array.get(0);
		int biggest = array.get(array.size()-1);
		System.out.println("The sum of the above numbers is: " + sum);
		System.out.println("The average of the above numbers is: " + average);
		System.out.println("The varience of the above numbers is: " + variance);
		System.out.println("The standard deviation of the above numbers is: " + standardDeviation);
		System.out.println("The smallest element is " + smallest + " and the largest element is " + biggest);
	}
}
