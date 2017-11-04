import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener{
	JFrame frame;
	JPanel p;
	JButton buttons[];
	JTextField text1;
	JTextField text2;
	JLabel l;
	String string_num1;
	String string_num2;
	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		sc.GUI();
	}
	private void GUI() {
		frame = new JFrame();
		p = new JPanel();
		l = new JLabel("a");
		frame.add(p);
		text1 = new JTextField(15);
		text2 = new JTextField(15);
		string_num1 = text1.getText();
		string_num2 = text2.getText();
		
		p.add(text1);
		p.add(text2);
		buttons = new JButton[4];
		for(int i=0 ; i < buttons.length ; i++){
			buttons[i]=new JButton();
			p.add(buttons[i]);
			buttons[i].setVisible(true);
			buttons[i].addActionListener(this);
			
		}
	
		frame.setSize(400, 200);
		buttons[0].setText("+");
		buttons[1].setText("-");
		buttons[2].setText("*");
		buttons[3].setText("/");
		p.add(l);

		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==(buttons[0])) {
		int num1 = Integer.parseInt(string_num1);
		int num2 = Integer.parseInt(string_num2);
		int sum = num1+num2;
	}

	}
}
