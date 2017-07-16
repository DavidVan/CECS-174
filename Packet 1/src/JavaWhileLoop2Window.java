import java.text.*;
import javax.swing.JOptionPane;
public class JavaWhileLoop2Window {
	public static void main(String[] args){
		int count=1;
		int roll=(int)(Math.random()*20);//generate a random int. 0<20
		JOptionPane myWindow;
		myWindow = new JOptionPane();
		String List="";
		while(roll!=10){
			List=List+("Roll = "+roll+"\n");
			roll=(int)(Math.random()*20);//get a new one
			count=count+1;
		}//end while loop
		  myWindow.showMessageDialog(null,List+"Finally after "+count+" number of rolls"+"\n"+"We got a 10!!");
	}//end main
}//end JavaWhileLoop
