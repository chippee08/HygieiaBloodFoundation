import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JButton signupButton = new JButton("Sign Up");
	JTextField usernameField = new JTextField();
	JPasswordField userpasswordField = new JPasswordField();
	JLabel usernameLabel = new JLabel("Username:");
	JLabel userpasswordLabel = new JLabel("Password:");
	JLabel messageLabel = new JLabel();
	JLabel pictureLabel = new JLabel();
	ImageIcon image = new ImageIcon("company_logo.png");
	ImageIcon logo = new ImageIcon("hygieia_logo.png");	
	
	
	HashMap<String, String> logininfo = new HashMap<String, String>();

	
	LoginPage(HashMap<String, String> loginInfoOriginal){
		
		
		//image settings
		Image new_logo = logo.getImage();
		Image modifiedLogo = new_logo.getScaledInstance(760, 330, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(modifiedLogo);
		pictureLabel.setBounds(280, 60, 760, 330);
		pictureLabel.setIcon(logo);
		
		logininfo = loginInfoOriginal;
		
		//label settings		x axis, y axis, width, height
		usernameLabel.setBounds(500, 400, 75, 25);
		userpasswordLabel.setBounds(500, 450, 75, 25);
		
		messageLabel.setBounds(570, 600, 250, 35);
		messageLabel.setFont(new Font(null, Font.PLAIN, 25));
		
		//field settings
		usernameField.setBounds(570, 400, 200, 25);
		userpasswordField.setBounds(570, 450, 200, 25);
		
		//button settings
		loginButton.setBounds(565, 500, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(670, 500, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		signupButton.setBounds(620, 550, 100, 25);
		signupButton.setFocusable(false);
		signupButton.addActionListener(this);
		
		//frame settings
		frame.add(signupButton);
		frame.add(usernameLabel);
		frame.add(userpasswordLabel);
		frame.add(messageLabel);
		frame.add(usernameField);
		frame.add(userpasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(pictureLabel);
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(0xE7DECC));
		frame.setTitle("Hygieia Blood Foundation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1370, 749);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == signupButton) {
			frame.dispose();
			SignupPage signupPage = new SignupPage();
		}
		
		if(e.getSource() == resetButton) {
			usernameField.setText("");
			userpasswordField.setText("");
		}
		
		if(e.getSource() == loginButton) {
			
			String username = usernameField.getText();
			String password = String.valueOf(userpasswordField.getPassword());
			
			if(logininfo.containsKey(username)) {
				if(logininfo.get(username).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login Successful");
					frame.dispose();
					HomePage homepage = new HomePage(username);
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Password Incorrect!");
				}
				
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Username not found!");
			}
			
		}
		
	}
}
