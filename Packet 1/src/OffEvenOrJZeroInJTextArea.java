import javax.swing.*;//for better looking windows with JOptionPane
import java.util.Random;//for random # generator
class OffEvenOrJZeroInJTextArea {
	public static void main(String[] args){
		int i;//counter for "for" loop
		int num;//will be filled with random 0<=x<=20
		Random rand = new Random();//create rand object a different way
		JTextArea outputString = new JTextArea();
		outputString.setText("i-value"+"\t"+"Number"+"\t"+"Type."+"\n");
		for(i=1;i<=20;i++){
			outputString.append(i+"."+"\t");//This is new!!
			num=rand.nextInt(21);//will not give 21, will give 0..20
			if(num==0)
				outputString.append(num+"\t"+"is Zero "+"\n");
			else if (num%2==0)
				outputString.append(num+"\t"+"is Even "+"\n");
			else
				outputString.append(num+"\t"+"is Odd "+"\n");
		}
		JOptionPane.showMessageDialog(null,outputString,"If Conditional's Demo.",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);//stops program when you click the right corner
	}
}
