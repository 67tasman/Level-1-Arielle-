import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {
	JFrame frame;
	JPanel p;
	public static void main(String[] args) {
		BinaryConverter bc = new BinaryConverter();
		bc.GUI();
	}
	private void GUI() {
		frame = new JFrame();
		p = new JPanel();
		JTextField answer = new JTextField(20);
		JButton b = new JButton("convert");
		JTextField answer2 = new JTextField(20);
		p.add(answer);
		p.add(b);
		p.add(answer2);
		frame.add(p);
		frame.setVisible(true);
frame.pack();

			
		}
	
	
String convert(String binary) {
  	 int asciiValue = Integer.parseInt(binary, 2);
  	 char theLetter = (char) asciiValue;
  	 return "" + theLetter;
   }

}