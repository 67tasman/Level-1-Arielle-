import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ListenerPractice implements ActionListener {
public static void main(String[] args) {
	new ListenerPractice();
	
}
public ListenerPractice(){
	JFrame frame = new JFrame();
	JButton button = new JButton("click me");
frame.add(button);
frame.pack();
frame.setVisible(true);
button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("clicked");
}
}
