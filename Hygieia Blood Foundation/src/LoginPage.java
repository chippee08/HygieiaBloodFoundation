import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HomePage extends UserAndPass implements ActionListener{

	JFrame frame = new JFrame();
	JLabel homelabel = new JLabel();
	JLabel picturelabel = new JLabel();
	JLabel questionlabel = new JLabel();
	JLabel donorlabel = new JLabel("A Blood Donor");
	JLabel patientlabel = new JLabel("A Patient");
	JLabel signoutlabel = new JLabel("Sign Out");
	ImageIcon image = new ImageIcon("company_logo.png");
	ImageIcon logo = new ImageIcon("hygieia_logo.png");
	ImageIcon donor = new ImageIcon("donor.png");
	ImageIcon patient = new ImageIcon("patient.png");
	ImageIcon signOut = new ImageIcon("signoutButton.png");
	JButton donorButton = new JButton();
	JButton patientButton = new JButton();
	JButton signOutButton = new JButton();
	
	
	HomePage(String username){
		
		Image new_signout = signOut.getImage();
		Image modifiedsignout = new_signout.getScaledInstance(75, 50, Image.SCALE_SMOOTH);
		signOut = new ImageIcon(modifiedsignout);
		signOutButton.setBounds(655, 600, 75, 50);
		signOutButton.setIcon(signOut);
		signOutButton.setBackground(new Color(0xE7DECC));
		signOutButton.setFocusable(false);
		signOutButton.addActionListener(this);
		
		Image new_patient = patient.getImage();
		Image modifiedPatient = new_patient.getScaledInstance(150, 50, Image.SCALE_SMOOTH);
		patient = new ImageIcon(modifiedPatient);
		patientButton.setBounds(700, 500, 150, 50);
		patientButton.setIcon(patient);
		patientButton.setBackground(new Color(0xE7DECC));
		patientButton.setFocusable(false);
		patientButton.addActionListener(this);
		
		Image new_donor = donor.getImage();
		Image modifiedDonor = new_donor.getScaledInstance(150, 50, Image.SCALE_SMOOTH);
		donor = new ImageIcon(modifiedDonor);
		donorButton.setBounds(540, 500, 150, 50);
		donorButton.setIcon(donor);
		donorButton.setBackground(new Color(0xE7DECC));
		donorButton.setFocusable(false);
		donorButton.addActionListener(this);
		
		
		Image new_logo = logo.getImage();
		Image modifiedLogo = new_logo.getScaledInstance(750, 300, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(modifiedLogo);
		picturelabel.setBounds(300, 75, 750, 300);
		picturelabel.setIcon(logo);
		
		patientlabel.setBounds(750, 550, 150, 50);
		donorlabel.setBounds(570, 550, 150, 50);
		signoutlabel.setBounds(670, 650, 150, 50);
		
		homelabel.setBounds(590, 350, 250, 35);
		homelabel.setFont(new Font(null, Font.PLAIN, 25));
		homelabel.setText("Welcome, " + username);
		
		questionlabel.setBounds(650, 450, 250, 35);
		questionlabel.setFont(new Font(null, Font.PLAIN, 25));
		questionlabel.setText("You are:");
		
		
		frame.add(signoutlabel);
		frame.add(signOutButton);
		frame.add(patientButton);
		frame.add(donorButton);
		frame.getContentPane().setBackground(new Color(0xE7DECC));
		frame.setTitle("Hygieia Blood Foundation");
		frame.setIconImage(image.getImage());
		frame.add(donorlabel);
		frame.add(patientlabel);
		frame.add(questionlabel);
		frame.add(homelabel);
		frame.add(picturelabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1370, 749);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == donorButton) {
			frame.dispose();
			donorPage DonorPage = new donorPage();
		}
		if(e.getSource() == signOutButton) {
			frame.dispose();
			LoginPage loginpage = new LoginPage(logininfo);
		}
		if(e.getSource() == patientButton) {
			frame.dispose();
			patientPage PatientPage = new patientPage();
		}
	}
	
}
