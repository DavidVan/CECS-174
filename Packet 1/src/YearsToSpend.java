import java.text.NumberFormat;//for money formatting
class YearsToSpend {
	public static void main(String[] args){//declare money object
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double amountNow=255500.50;
		double takeAwayEachYr=12460.25;
		int year=0;
		System.out.print("Starting with "+money.format(amountNow));
		System.out.println(", it will last, taking away "+money.format(takeAwayEachYr)+" each year.");
		while (amountNow>=0.0){
			
			System.out.println("Year#"+year+"\t"+money.format(amountNow));
			year++;//means the same as year=year+1
			amountNow=amountNow-takeAwayEachYr;
		}
	}
}
