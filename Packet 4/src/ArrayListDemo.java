// Intro to ArrayList and Collections with random access
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//Create one random at a time and add it to an ArrayList.
		int i = 0;
		for(i = 0; i < 40; i++) {
			numbers.add((int)(1000*Math.random()));
		}
		System.out.print(i + " unsorted randoms: ");
		System.out.println(numbers);
		//Collections work on ArrayLists we will use "Collections.sort"
		Collections.sort(numbers);
		//Print the sorted list.
		System.out.print(i + " sorted randoms: ");
		System.out.println(numbers);
		System.out.println("The smallest is = " + numbers.get(0));
		System.out.println("The largest is = " + numbers.get(39));
	}
}
