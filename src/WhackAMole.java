import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class WhackAMole implements ActionListener {
	static Random r = new Random();
	public static void main(String[] args) {
		WhackAMole whack = new WhackAMole();
		int rand = r.nextInt(25); 
		whack.drawButtons(rand);
	
	}
	int j;
	JFrame frame;
	JPanel p;
	JButton buttons[];
	int count = 0;
	private void drawButtons(int rand) {
		frame = new JFrame();
		p = new JPanel();
		frame.add(p);
		buttons = new JButton[25];
		for(int i=0 ; i < buttons.length ; i++){
			buttons[i]=new JButton();
			p.add(buttons[i]);
			buttons[i].setVisible(true);
			buttons[i].addActionListener(this);
		}
		buttons[rand].setText("mole!");
		j = rand;
		//System.out.println(j);
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==(buttons[j])) {
			speak("ow");
			frame.dispose();
		 count = count+1;
		 System.out.println(count);
		 drawButtons(r.nextInt(25));
		 if(count>9) {
			 System.exit(0);
			}
		
	}
		else {
			System.out.println("idiot");
		}
	
}
}
