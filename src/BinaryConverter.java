import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	JFrame frame;
	JPanel p;
	JButton b;
	JTextField input;
	JTextField answer;
	public static void main(String[] args) {
		BinaryConverter bc = new BinaryConverter();
		bc.GUI();
	}
	private void GUI() {
		frame = new JFrame();
		p = new JPanel();
		input = new JTextField(20);
		b = new JButton("convert");
		b.addActionListener(this);
		answer = new JTextField(20);
		p.add(input);
		p.add(b);
		p.add(answer);
		frame.add(p);
		frame.setVisible(true);
frame.pack();

			
		}
	
	


String convertString(String binary) {
  	 int asciiValue = Integer.parseInt(binary, 2);
  	 char theLetter = (char) asciiValue;
  	 return "" + theLetter;
   }
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource()==(b)) {
		String text = input.getText();
		String btext = convertString(text);
		System.out.println(btext);
		answer.setText(btext);
	}
	
}

}