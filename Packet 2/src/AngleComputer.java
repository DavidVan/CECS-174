import java.util.StringTokenizer;
import javax.swing.JOptionPane;
class AngleComputer {
	public static void main(String[] args) {
		// Get user input (USE EXAMPLE: '(1,1); (1,4); (5,1)' - 3, 4, 5 Triangle)
		String enteredPoints = JOptionPane.showInputDialog("Enter your three sets of points in the format: (x1,y1); (x2,y2); (x3,y3)");
		// String Tokenizer to remove extraneous characters 
		StringTokenizer st = new StringTokenizer(enteredPoints, "(,); ");
		// Save points as type int with extraneous characters removed
		int pointZero = Integer.parseInt(st.nextToken());
		int pointOne = Integer.parseInt(st.nextToken());
		int pointTwo = Integer.parseInt(st.nextToken());
		int pointThree = Integer.parseInt(st.nextToken());
		int pointFour = Integer.parseInt(st.nextToken());
		int pointFive = Integer.parseInt(st.nextToken());
		// Output points to console
		System.out.println("x1: " + pointZero);
		System.out.println("y1: " + pointOne);
		System.out.println("x2: " + pointTwo);
		System.out.println("y2: " + pointThree);
		System.out.println("x3: " + pointFour);
		System.out.println("y3: " + pointFive);
		// Calculate point distance using distance formula
		double distanceA = Math.sqrt(Math.pow(pointTwo-pointZero, 2)+Math.pow(pointThree-pointOne, 2));
		double distanceB = Math.sqrt(Math.pow(pointFour-pointTwo, 2)+Math.pow(pointFive-pointThree, 2));
		double distanceC = Math.sqrt(Math.pow(pointZero-pointFour, 2)+Math.pow(pointOne-pointFive, 2));
		 // Output distances to console
		System.out.println("Distance of A: " + distanceA);
		System.out.println("Distance of B: " + distanceB);
		System.out.println("Distance of C: " + distanceC);
		// Calculate cosines using given distances
		double cosineA = (Math.pow(distanceB, 2)+Math.pow(distanceC, 2)-Math.pow(distanceA, 2))/(2*distanceB*distanceC);
		double cosineB = (Math.pow(distanceC, 2)+Math.pow(distanceA, 2)-Math.pow(distanceB, 2))/(2*distanceC*distanceA);
		double cosineC = (Math.pow(distanceA, 2)+Math.pow(distanceB, 2)-Math.pow(distanceC, 2))/(2*distanceA*distanceB);
		// Output cosines to console
		System.out.println("Cosine of A: " + cosineA);
		System.out.println("Cosine of B: " + cosineB);
		System.out.println("Cosine of C: " + cosineC);
		// Use arccosine to get angle values in radians
		double angleA = Math.acos(cosineA);
		double angleB = Math.acos(cosineB);
		double angleC = Math.acos(cosineC);
		// Output the angle measurements, in radians, to console
		System.out.println("Degree of Angle A in Radians: " + angleA);
		System.out.println("Degree of Angle B in Radians: " + angleB);
		System.out.println("Degree of Angle C in Radians: " + angleC);
		// Convert radians to degrees
		double convertedAngleA = (angleA*180)/Math.PI;
		double convertedAngleB = (angleB*180)/Math.PI;
		double convertedAngleC = (angleC*180)/Math.PI;
		// Output converted angle measurements to console
		System.out.println("Degree of Angle A: " + convertedAngleA);
		System.out.println("Degree of Angle B: " + convertedAngleB);
		System.out.println("Degree of Angle C: " + convertedAngleC);
		// Add up angles to verify it totals 180 degrees
		double totalAngleMeasure = convertedAngleA+convertedAngleB+convertedAngleC;
		// Prints out total to console
		System.out.println("Total Angle Measurement: " + totalAngleMeasure);
		// Begin GUI Interface setup and output
		JOptionPane.showMessageDialog(null, "Angle A = " + convertedAngleA + " degrees\nAngle B = " + convertedAngleB + " degrees\nAngle C = " + convertedAngleC + " degrees");
	}// end main
}// end AngleComputer
