
public class ForLoopExample2 {
	public static void main(String[] args){
		//print out the first 20 numbers, starting with 1 and sum them.
		int i;
		int sum=0;//This sum will be automaticall updated.
		for(i=1;i<=20;i=i+1){
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("The sum of all twenty numbers is: "+sum);
	}
}
