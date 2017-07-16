import java.text.*;//for println
import java.util.Random;//for random # generator
class OddEvenOrZero {
	public static void main(String[] args){
		int i;//counter for "for" loop
		int num;//will be filled with random 0<=x<=20
		Random rand = new Random();//create rand object a different way
		for(i=1;i<=20;i++){
			System.out.print(i+".  ");
			num=rand.nextInt(21);//will not give 21, will give 0..20
			if(num==0)
				System.out.println(num+" is Zero");
			else if (num%2==0)
				System.out.println(num+" is Even");
			else
				System.out.println(num+" is Odd");
		}
	}
}
