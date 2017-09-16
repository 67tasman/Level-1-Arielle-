import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LotteryNumbers implements ActionListener {

	public static void main(String[] args) {

		// System.out.println( random+ " " +random2 );
		LotteryNumbers lottery = new LotteryNumbers();
		lottery.UI();
	}
	JFrame frame = new JFrame();

	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton("Lottery Number Generator");
	public void UI() {
		frame.setVisible(true);
		button.addActionListener(this);
		frame.add(panel);
		panel.add(button);
		panel.add(label);
		frame.pack();
		// JLabel label = new JLabel(random+ " " +random2 );
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		int random = (int) (Math.random() * 59 + 1);
		int random5 = (int) (Math.random() * 59 + 1);
		int random2 = (int) (Math.random() * 59 + 1);
		int random3 = (int) (Math.random() * 59 + 1);
		int random4 = (int) (Math.random() * 59 + 1);

		
label.setText( random + " " + random2 + " " + random3 + " " + random4 + " " + random5);
frame.pack();
	}

}
