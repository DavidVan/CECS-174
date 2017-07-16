import javax.swing.*;//for JOptionPane
class WindowOfNumbers {
	public static void main(String[] args){
		JOptionPane myWindow;
		myWindow = new JOptionPane();
		String toBeListed="";//This entire string will print at one time.
		int i;
		for(i = 1;i<10;i=i+1){
			toBeListed=toBeListed+Integer.toString(i)+", ";
		}//end for loop andAdd the tenth number without ","
		 toBeListed=toBeListed+Integer.toString(i);
		 myWindow.showMessageDialog(null,"The output is: "+"\n"+toBeListed);
		System.exit(0);//make sure to terminate correctly
	}
}
