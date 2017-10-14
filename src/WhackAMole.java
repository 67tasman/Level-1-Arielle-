import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WhackAMole {
	public static void main(String[] args) {
		
	}
	JFrame frame;
	JPanel p;
	private void drawButtons(){
		frame = new JFrame();
		p = new JPanel();
		frame.add(p);
		JButton buttons[] = new JButton[24];
		for(int i=0 ; i < buttons.length ; i++){
			buttons[i]=new JButton();
			p.add(buttons[i]);
			buttons[i].setVisible(true);
		}
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		
		
	}
}
