import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignupPage implements ActionListener{

	JFrame frame = new JFrame();
	JLabel usernameLabel = new JLabel("Create Username:");
	JLabel userpasswordLabel = new JLabel("Create Password:");
	JLabel pictureLabel = new JLabel();
	JLabel messageLabel = new JLabel();
	ImageIcon image = new ImageIcon("company_logo.png");
	ImageIcon logo = new ImageIcon("hygieia_logo.png");
	ImageIcon GoBack = new ImageIcon("backButton.png");
	JTextField usernameField = new JTextField();
	JPasswordField userpasswordField = new JPasswordField();
	JButton backButton = new JButton();
	JButton createButton = new JButton("Create Account!");
	
	SignupPage(){
		
		Image new_back = GoBack.getImage();
		Image modifiedBack = new_back.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		GoBack = new ImageIcon(modifiedBack);
		backButton.setBounds(10, 10, 25, 25);
		backButton.setIcon(GoBack);
		backButton.setBackground(new Color(0xE7DECC));
		backButton.setFocusable(false);
		backButton.addActionListener(this);
		
		messageLabel.setBounds(570, 600, 450, 35);
		messageLabel.setFont(new Font(null, Font.PLAIN, 25));
		
		createButton.setBounds(620, 550, 200, 25);
		createButton.setFocusable(false);
		createButton.addActionListener(this);
		
		usernameLabel.setBounds(620, 400, 200, 25);
		userpasswordLabel.setBounds(620, 470, 200, 25);
		
		usernameField.setBounds(620, 430, 200, 25);
		userpasswordField.setBounds(620, 500, 200, 25);
		
		Image new_logo = logo.getImage();
		Image modifiedLogo = new_logo.getScaledInstance(760, 330, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(modifiedLogo);
		pictureLabel.setBounds(280, 60, 760, 330);
		pictureLabel.setIcon(logo);
		
		frame.add(messageLabel);
		frame.add(createButton);
		frame.add(pictureLabel);
		frame.add(usernameLabel);
		frame.add(usernameField);
		frame.add(userpasswordLabel);
		frame.add(userpasswordField);
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
		if(e.getSource() == backButton) {
			frame.dispose();
			HomePage homepage = new HomePage(null); 
		}
		if(e.getSource() == createButton) {
			messageLabel.setForeground(Color.green);
			messageLabel.setText("Account successfully created!");
		}
	}
}
