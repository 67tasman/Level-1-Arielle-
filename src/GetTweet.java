import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetTweet implements ActionListener {
	JTextPane textpane = new JTextPane();
	JScrollPane scrollpane = new JScrollPane(textpane);
	JPanel panel2 = new JPanel();
	JTextField textfield = new JTextField(30);
	public static void main(String []args){
	new GetTweet();
	
	
	
	
	}
	GetTweet(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Get tweet");
		frame.add(panel,BorderLayout.CENTER);
		panel.add(textfield);
		panel.add(button);
		frame.setVisible(true);
		button.addActionListener(this);
		frame.add(panel2, BorderLayout.SOUTH);
		panel2.add(scrollpane);
		textpane.setPreferredSize(new Dimension(500,500));
		textpane.setEditable(false);
		textpane.setBackground(new Color(240,243,255));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
	
	private String getTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);
		String s = "";
		Query query = new Query(searchingFor);
		try {
			
		     
			QueryResult result = twitter.search(query);
for(int i=0 ; i<= 14 ; i++){
s += result.getTweets().get(i).getText()+ "\n\n";}
return s;
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return s;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
	textpane.setText(getTweet(textfield.getText()));
		
		
	}

	}





