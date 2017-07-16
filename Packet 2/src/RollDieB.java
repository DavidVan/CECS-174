//Part B
//Use a Method and JOptionPane text listing inside
//Also included is the switch statement Roll a six-sided die 480 times.
import javax.swing.*;
class RollDieB {
	public static void main(String[] args) {
		int frequency1 = 0, frequency2 = 0, frequency3 = 0, frequency4 = 0, frequency5 = 0, frequency6 = 0, face;
		//HERE is Where the Method is used..
		for(int roll=1;roll<=480;roll++) {
			face = rollDice(); //we have rollDice listed below as a user Method
			//determine roll value and increment appropriate counter
			switch(face) {
				case 1:
					++frequency1;
					break;
				case 2:
					++frequency2;
					break;
				case 3:
					++frequency3;
					break;
				case 4:
					++frequency4;
					break;
				case 5:
					++frequency5;
					break;
				case 6:
					++frequency6;
					break;
			}//end switch structure
		}//end for structure
		//LOOK Here at what is done, tabs work and all! This is a text listing inside!
		JTextArea outputArea = new JTextArea();
		outputArea.setText("Face\tFrequency" + "\n1\t" + frequency1 + "\n2\t" + frequency2 + "\n3\t" + frequency3 + "\n4\t" + frequency4 + "\n5\t" + frequency5 + "\n6\t" + frequency6);
		JOptionPane.showMessageDialog(null, outputArea, "Rolling a Die 480 Times", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);//terminate application
	}//end method main
	//The method to roll a die is written here
	public static int rollDice(){//This had to be declared public static int rollDice()
		int rolldie;
		rolldie = 1 + (int)(Math.random()*6);
		return rolldie;
	}
}//end class RollDieB
