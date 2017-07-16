import java.awt.*; /*Use Canvas to display graphics*/
import java.awt.event.*;
import java.applet.Applet;
public class GraphingCalc extends Applet{
	private Button sine = new Button("Sine");
	private Button cosine = new Button("Cosine");
	private Button tangent = new Button("Tangent");
	private Button clear = new Button("Clear");
	private Draw canvas = new Draw();
	private Label amp = new Label("Enter the amplitude: ");
	private Label period = new Label("Enter the period: ");
	private TextField ampUser = new TextField(5);
	private TextField periodUser = new TextField(5);
	public void init() {
		setSize(600,250);
		add(canvas);
		canvas.setBackground(Color.BLACK);
		canvas.setSize(360,180);
		add(sine);
		add(cosine);
		add(tangent);
		add(clear);
		add(amp);
		add(ampUser);
		add(period);
		add(periodUser);
		sine.addActionListener(canvas);
		cosine.addActionListener(canvas);
		tangent.addActionListener(canvas);
		clear.addActionListener(canvas);
		ampUser.addActionListener(canvas);
		periodUser.addActionListener(canvas);
	}// end init
	public class Draw extends Canvas implements ActionListener {
		Object source;//make global to event and paint
		Object sourceBackup;
		double ampUserNum, periodUserNum;
		public void actionPerformed(ActionEvent event) {
			source = event.getSource();
			ampUserNum = Double.parseDouble(ampUser.getText());
			periodUserNum = Double.parseDouble(periodUser.getText());
			repaint();
		}
		public void paint(Graphics g) {
			if (source == sine) {
				sourceBackup = sine;
				setUpGraph(g);
				drawSineWave(g,ampUserNum,periodUserNum);//0.75 is amplitude and 2.0 is period
			}
			else if (source == cosine) {
				sourceBackup = cosine;
				setUpGraph(g);
				drawCosineWave(g,ampUserNum,periodUserNum);//1.5 is amplitude and 4.0 is period
			}
			else if (source == tangent) {
				sourceBackup = tangent;
				setUpGraph(g);
				drawTangentWave(g,ampUserNum,periodUserNum);//1.5 is amplitude and 4.0 is period
			}
			else if (source == ampUser) {
				setUpGraph(g);
				if (sourceBackup == sine) {
					drawSineWave(g,ampUserNum,periodUserNum);
				}
				else if (sourceBackup == cosine) {
					drawCosineWave(g,ampUserNum,periodUserNum);
				}
				else if (sourceBackup == tangent) {
					drawTangentWave(g,ampUserNum,periodUserNum);
				}
				else if (sourceBackup == clear) {
					setUpGraph(g);
					ampUser.setText("");
					periodUser.setText("");
				}
			}
			else if (source == periodUser) {
				setUpGraph(g);
				if (sourceBackup == sine) {
					drawSineWave(g,ampUserNum,periodUserNum);
				}
				else if (sourceBackup == cosine) {
					drawCosineWave(g,ampUserNum,periodUserNum);
				}
				else if (sourceBackup == tangent) {
					drawTangentWave(g,ampUserNum,periodUserNum);
				}
				else if (sourceBackup == clear) {
					setUpGraph(g);
					ampUser.setText("");
					periodUser.setText("");
				}
			}
			else if (source == clear) {
				setUpGraph(g);
				ampUser.setText("");
				periodUser.setText("");
			}
		}//end paint
		public void setUpGraph(Graphics g) {
			g.setColor(Color.WHITE);
			g.drawLine(0,90,360,90);
			g.drawLine(180,0,180,180);
			g.drawLine(90,80,90,100);
			g.drawLine(270,80,270,100);
		}
		public void drawSineWave (Graphics g, double amplitude, double period) {
			g.setColor(Color.GREEN);
			double amp = amplitude, per = period;//Period and amplitude
			g.drawString(amp+"sin("+per+"(x))",20,20);
			for (int x = 1; x<360; x++) {//making the inequality strict won't erase border
				int y = (int)(amp*(-1*180/4)*Math.sin(per*x*4.0*Math.PI/360));
				g.drawLine(x,180/2+y,x,180/2+y);//this will draw a single pixel
			}
		}
		public void drawCosineWave (Graphics g, double amplitude, double period) {
			g.setColor(Color.GREEN);
			double amp = amplitude, per = period;//Period and amplitude
			g.drawString(amp+"cos("+per+"(x))",20,20);
			for (int x = 1; x<360; x++) {//making the inequality strict won't erase border
				int y = (int)(amp*(-1*180/4)*Math.cos(per*x*4.0*Math.PI/360));
				g.drawLine(x,180/2+y,x,180/2+y);//this will draw a single pixel
			}
		}
		public void drawTangentWave (Graphics g, double amplitude, double period) {
			g.setColor(Color.GREEN);
			double amp = amplitude, per = period;//Period and amplitude
			g.drawString(amp+"tan("+per+"(x))",20,20);
			for (int x = 1; x<360; x++) {//making the inequality strict won't erase border
				int y = (int)(amp*(-1*180/4)*Math.tan(per*x*4.0*Math.PI/360));
				g.drawLine(x,180/2+y,x,180/2+y);//this will draw a single pixel
			}
		}
	}//end Draw
}//end ButtonCanvasPress
