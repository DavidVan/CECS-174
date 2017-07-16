/*Converts the price the user enters in the text field to a double and adds it to the sum when the user hits the
Enter key or presses the Enter button. Displays the average in a label when the user presses the Ave. button.*/
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.text.*;//for money 2 space to the right of the decimal points, cents
public class CopyOfButtonCanvasPress extends Applet implements ActionListener {
	private Button Jamie = new Button("Jamie");
	private Button Joey = new Button("Joey");
	private Button Jered = new Button("Jered");
	private Button Jody = new Button("Jody");
	private Button Total = new Button("Total");
	private TextField text = new TextField(5);
	private Label answer = new Label("");
	private Label Jamieanswer = new Label("");
	private Label Joeyanswer = new Label("");
	private Label Jeredanswer = new Label("");
	private Label Jodyanswer = new Label("");
	private double Jamiesum = 0.0;
	private double Joeysum = 0.0;
	private double Jeredsum = 0.0;
	private double Jodysum = 0.0;
	private double TotalForAll = 0.0;
	private DecimalFormat df;
	public void init() {
		add(Jamie);
		add(Joey);
		add(Jered);
		add(Jody);
		add(Total);
		add(text);
		add(answer);
		add(Jamieanswer);
		add(Joeyanswer);
		add(Jeredanswer);
		add(Jodyanswer);
		Jamie.addActionListener(this);//this ==> panel
		Joey.addActionListener(this);
		Jered.addActionListener(this);//this ==> panel
		Jody.addActionListener(this);
		Total.addActionListener(this);
		text.addActionListener(this);
		df = new DecimalFormat("0.00");//This I changed from the text book
	}
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		if (source == Jamie) {
			double money1 = new Double(text.getText()).doubleValue();
			TotalForAll = TotalForAll + money1;
			Jamiesum = Jamiesum + money1;
			text.setText("");
		}
		else if (source == Joey) {
			double money2 = new Double(text.getText()).doubleValue();
			TotalForAll = TotalForAll + money2;
			Joeysum = Joeysum + money2;
			text.setText("");
		}
		else if (source == Jered) {
			double money3 = new Double(text.getText()).doubleValue();
			TotalForAll = TotalForAll + money3;
			Jeredsum = Jeredsum + money3;
			text.setText("");
		}
		else if (source == Jody) {
			double money4 = new Double(text.getText()).doubleValue();
			TotalForAll = TotalForAll + money4;
			Jodysum = Jodysum + money4;
			text.setText("");
		}
		else if (source == Total) {
			answer.setText("Total = " + df.format(TotalForAll));
			Jamieanswer.setText("Jamie = " + df.format(Jamiesum));
			Joeyanswer.setText("Joey = " + df.format(Joeysum));
			Jeredanswer.setText("Jered = " + df.format(Jeredsum));
			Jodyanswer.setText("Jody = " + df.format(Jodysum));
		}
	}
}//end of everything