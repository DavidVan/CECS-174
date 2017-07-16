//Problem 2
import javax.swing.*;//for JOptionPane
import java.text.*;
import java.util.*;//for Scanner input
import java.io.*;//for data entry.
public class WindowCircleOrSquare {
	public static void main(String[] args) {
		JOptionPane myWindow;
		myWindow = new JOptionPane();
		String circle_square_pyramid_or_cylinder;
		circle_square_pyramid_or_cylinder = myWindow.showInputDialog("Enter "+"CIRCLE, SQUARE, PYRAMID, OR CYLINDER \n to find results: ");
		if (circle_square_pyramid_or_cylinder.equals("CIRCLE")) {//The test to see if strings are equal
			final double PI=3.1415; //constant as final & w/All Caps
			double radius, area, circumference, volume;
			//input the radius from console
			String input1;
			input1 = myWindow.showInputDialog("Enter Radius:");//must convert to double
			radius = Double.parseDouble(input1);
			//use format from java.text.* this way
			DecimalFormat df;
			df = new DecimalFormat("0.00");
			//could also be ==> DecimalFormat df = new DecimalFormat("0.00");
			//do the math below
			circumference = 2.0*PI*radius;
			area = PI*radius*radius;
			volume = (4.0/3.0)*PI*radius*radius*radius;
			//SHow new formatted results with a few newlines too!
			myWindow.showMessageDialog(null, "The computations of a " + circle_square_pyramid_or_cylinder + "\n With a given radius: " + df.format(radius) + "\n" + "Circumference = " + df.format(circumference) + "\n" + "Area = " + df.format(area) + "\n" + "Volume = " + df.format(volume));
		}
		else if (circle_square_pyramid_or_cylinder.equals("SQUARE")) {
			double side, area, surface_area, volume;
			//input the side of the square from console
			String input2;
			input2 = myWindow.showInputDialog("Enter Side length:");//convert to double
			side = Double.parseDouble(input2);
			//enter math for computing area of square & surface area & volume of a cube
			area = side*side;
			surface_area = 6*side*side;
			volume = side*side*side;
			myWindow.showMessageDialog(null, "The computations of a " + circle_square_pyramid_or_cylinder + " with side length '"+side+"'are:" + "\nArea: " + area + "\nSurface Area: " + surface_area + "\nVolume: " + volume);
		}
		else if (circle_square_pyramid_or_cylinder.equals("PYRAMID")) {
			double base, side, height, surface_area, volume;
			String input3;
			input3 = myWindow.showInputDialog("Enter the Base length:");//convert to double
			base = Double.parseDouble(input3);
			String input4;
			input4 = myWindow.showInputDialog("Enter the Base length:");//convert to double
			side = Double.parseDouble(input4);
			height = Math.sqrt(side*side-base*base);
			System.out.print(height);
			surface_area = (2.0*base*side)+(base*base);
			volume = (1.0/3.0)*(base*base)*(height);
			DecimalFormat df;
			df = new DecimalFormat("0.00");
			myWindow.showMessageDialog(null, "The computations of a " + circle_square_pyramid_or_cylinder + " with base length '"+base+" and side length '"+side+"'are:" + "\nSurface Area: " + df.format(surface_area) + "\nVolume: " + df.format(volume));
		}
		else if (circle_square_pyramid_or_cylinder.equals("CYLINDER")) {
			final double PI=3.1415; //constant as final & w/All Caps
			double radius, height, surface_area, volume;
			String input5;
			input5 = myWindow.showInputDialog("Enter the radius length:");//convert to double
			radius = Double.parseDouble(input5);
			String input6;
			input6 = myWindow.showInputDialog("Enter the height:");//convert to double
			height = Double.parseDouble(input6);
			surface_area = (2*PI*(radius*radius))+(2*PI*radius*height);
			volume = PI*(radius*radius)*height;
			DecimalFormat df;
			df = new DecimalFormat("0.00");
			myWindow.showMessageDialog(null, "The computations of a " + circle_square_pyramid_or_cylinder + " with radius '"+radius+"' and height '"+height+"' are:" + "\nSurface Area: " + df.format(surface_area) + "\nVolume: " + df.format(volume));
		}
		else {
			myWindow.showMessageDialog(null, "Not a Valid Shape-ALL CAPS!!");
		}
		System.exit(0);
	}
}
