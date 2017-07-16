// Arrays as presented with the combination of arrays.
/* Searches an array for the first occurence of a value input by the user */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class TryArray extends Applet implements ActionListener {
	int[] score = new int[100];
	private TextField text = new TextField(5);
	private Label label = new Label("Enter Score To Find: ");
	private TextArea result = new TextArea(3,30);
	public void init() {
		for(int i = 0; i < score.length; i++) {
			score[i] = (int)(1000*Math.random());
		}
		add(label);
		add(text);
		add(result);
		text.addActionListener(this);
		result.setText("Score not found yet");
	}
	public void actionPerformed(ActionEvent e) {
		int testValue = Integer.parseInt(text.getText());
		result.setText("Score not found");
		for(int i = 0; i < score.length; i++) {
			if(testValue == score[i]) {
				result.setText("Found score " + testValue + " at index " + i);
				break;
			}
		}
	}
}
