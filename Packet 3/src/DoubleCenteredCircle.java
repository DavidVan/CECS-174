// Draw a circle centered in the Applet frame 1/2 the width in diameter
// This took me forever to figure out the math. The draw oval uses rectangles at corner
// (x,y) and grows off this...*/
import java.awt.*;
import javax.swing.*;
public class DoubleCenteredCircle extends JApplet {
	public void init() {
		int stuff = 0;
		int customHeight = 0;
		int radius = 0;
		for (int i=20; i < getSize().height; i=i+20) {
			radius=radius+20;
		}
		customHeight = radius*2+1;
		setSize(customHeight,getSize().width);
	}
	public void paint(Graphics g) {
		// if you want to change color use g.setColor(Color.red);
		int h = getSize().height;//get the default height of the applet frame size
		int w = getSize().width;//get the default width of the applet frame size
		System.out.println(getSize().height);
		System.out.println(getSize().width);
		int shift = (h/2)+70;
		System.out.println(shift);
		int FirstCircleHeight=(h/2)-10;
		int FirstCircleWidth=(w/4)-10;
		int SecondCircleHeight=(h/2)-10;
		int SecondCircleWidth=(w/4)+shift;
		g.setColor(Color.red);
		for (int radius=20; radius < h; radius=radius+20) {
			g.drawOval(FirstCircleWidth, FirstCircleHeight, radius, radius);
			FirstCircleWidth=FirstCircleWidth-10;
			FirstCircleHeight=FirstCircleHeight-10;
			g.drawOval(SecondCircleWidth, SecondCircleHeight, radius, radius);
			SecondCircleWidth=SecondCircleWidth-10;
			SecondCircleHeight=SecondCircleHeight-10;
		}
	}
}
