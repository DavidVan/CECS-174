// Step 6 Final Demonstration Illustrates creating a Complete Form using Gridbag layout
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;// add this
public class Form extends Applet implements ActionListener{
	private TextField first = new TextField("first name", 12);
	private TextField middle = new TextField("I", 1);
	private TextField last = new TextField("last name", 15);
	private TextField address = new TextField("address", 25);
	private TextField city = new TextField("city", 20);
	private TextField state = new TextField("state", 2);
	private TextField zip = new TextField("zip", 5);
	private Button submit = new Button("Submit");
	private Button reset = new Button("Reset");
	private Button save = new Button("Save Message"); // this is to be centered under submit.
	private Button enlarge = new Button("Enlarge Message"); // center this under reset.
	private TextArea message = new TextArea();
	
	public void init() {
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(5, 5, 5, 5);
		gbl.setConstraints(first, c);
		add(first);
		c.fill = GridBagConstraints.NONE;
		gbl.setConstraints(middle, c);
		add(middle);
		c.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(last, c);
		add(last);
		c.gridy = 1;
		gbl.setConstraints(address,  c);
		add(address);
		c.gridy = 2;
		gbl.setConstraints(city, c);
		add(city);
		c.fill = GridBagConstraints.NONE;
		gbl.setConstraints(state, c);
		add(state);
		c.gridy = 3;
		gbl.setConstraints(zip, c);
		add(zip);
		c.gridy = 4;
		c.anchor = GridBagConstraints.CENTER;
		gbl.setConstraints(submit, c);
		add(submit);
		gbl.setConstraints(reset, c);
		add(reset);
		c.gridy = 5;
		c.anchor = GridBagConstraints.CENTER;
		gbl.setConstraints(save, c);
		add(save);
		gbl.setConstraints(enlarge, c);
		add(enlarge);
		c.gridy = 6;
		c.gridwidth = 3;
		c.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(message, c);
		add(message);
		submit.addActionListener(this);
		reset.addActionListener(this);
		save.addActionListener(this);
		enlarge.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		if (source == submit) {
			String initial = middle.getText();
			if (initial != null) {
				initial += ". ";
			}
			message.setFont(new Font("SansSerif", Font.PLAIN, 12)); // keep current
			message.setText(message.getText());
			message.append('\n' + first.getText() + ' ' + initial + last.getText());
			message.append('\n' + address.getText());
			message.append('\n' + city.getText() + ", " + state.getText());
			message.append(' ' + zip.getText() + "\n");
		}
		if (source == enlarge) {
			String initial = middle.getText();
			if (initial != null) {
				initial += ". ";
			}
			message.setFont(new Font("SansSerif", Font.BOLD, 14));
			message.setForeground(Color.BLUE);
			message.setText(message.getText());
			message.append('\n' + first.getText() + ' ' + initial + last.getText());
			message.append('\n' + address.getText());
			message.append('\n' + city.getText() + ", " + state.getText());
			message.append(' ' + zip.getText() + "\n");
		}
		if (source == save) {
			String initial = middle.getText();
			if (initial != null) {
				initial += ". ";
			}
			message.setFont(new Font("SansSerif", Font.PLAIN, 12)); // reset to original
			message.setText(message.getText());
			message.append('\n' + first.getText() + ' ' + initial + last.getText());
			message.append('\n' + address.getText());
			message.append('\n' + city.getText() + ", " + state.getText());
			message.append(' ' + zip.getText() + "\n");
			message.append("\n" + "Message and Name has been saved to external file.");
			// remember to add import java.io.*//for opening text File
			if (source == save) {
				try {
					PrintWriter pw = new PrintWriter(new File("savedMessage.txt"));
					pw.println(message.getText());
					pw.close();
				} // end try
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		if (source == reset) {
			message.setText("");
			first.setText("");
			middle.setText("");
			last.setText("");
			address.setText("");
			city.setText("");
			state.setText("");
			zip.setText("");
		}
	}
}
