import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener{
	char currentLetter;
	JFrame frame;
	JLabel l;
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		TypingTutor tt = new TypingTutor();
		tt.makeGUI();
	}
	private void makeGUI(){
		frame = new JFrame();
		frame.setTitle("Super fun game");
		l = new JLabel();
		frame.add(l);
		frame.addKeyListener(this);
		currentLetter = generateRandomLetter();
		l.setText(Character.toString(currentLetter));
		l.setFont(l.getFont().deriveFont(88.0f));
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
	 System.out.println(e.getKeyChar());
	 
	 if(currentLetter == e.getKeyChar()){
		System.out.println("correct");
		frame.getContentPane().setBackground(Color.GREEN);
		}
	 else{
		 frame.getContentPane().setBackground(Color.RED);
	 }
	 currentLetter = generateRandomLetter();
		l.setText(Character.toString(currentLetter));
	}
 

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

		
	}


	
	
}
