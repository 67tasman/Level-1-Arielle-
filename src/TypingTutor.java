import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		TypingTutor tt = new TypingTutor();
		tt.makeGUI();
	
		
	}
	private void makeGUI(){
		JFrame frame = new JFrame();
		frame.setTitle("Super fun game");
		char currentLetter;
		JLabel l = new JLabel();
		frame.add(l);
		frame.addKeyListener(this);
		currentLetter = generateRandomLetter();
		l.setText(Character.toString(currentLetter));
		l.setFont(l.getFont().deriveFont(28.0f));
		l.setHorizontalAlignment(JLabel.CENTER);	
		frame.setVisible(true);
		l.setVisible(true);
		frame.pack();
		currentLetter = generateRandomLetter();
		l.setText(Character.toString(currentLetter));
		}
	static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	
	
}
