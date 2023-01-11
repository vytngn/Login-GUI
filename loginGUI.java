import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(440,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel); //add panel to frame 
		
		panel.setLayout(null);
		
		//user label
		userLabel = new JLabel("Username");
		userLabel.setBounds(10,20,80,25); // x,y,width,height
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		//password label
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100,50,165,25);
		panel.add(passwordText);
		
		
		button = new JButton("Login");
		button.setBounds(10,80,80,25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
		
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + "," + password);

		if(user.equals("Amy") && password.equals("GUIisCool@2023")){
			success.setText("Login successful!");
		}else {
			success.setText("Wrong username or password.");
		}
		
	}

}
