import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tootMachine implements ActionListener{
	JFrame frame;
	JPanel p;
	JButton buttons[];
	public static void main(String[] args) {
		tootMachine tm = new tootMachine();
		tm.GUI();

	}
	private void GUI() {
		frame = new JFrame();
		p = new JPanel();
		frame.add(p);
		buttons = new JButton[3];
		for(int i=0 ; i < buttons.length ; i++){
			buttons[i]=new JButton();
			p.add(buttons[i]);
			buttons[i].setVisible(true);
			buttons[i].addActionListener(this);
			
		}
		frame.setSize(400, 200);
		frame.setVisible(true);
		buttons[0].setText("1");
		buttons[1].setText("2");
		buttons[2].setText("3");
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==(buttons[0])) {
			System.out.println("*sound*");
			playSound("fart.wav");
		}
		}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}


	}
