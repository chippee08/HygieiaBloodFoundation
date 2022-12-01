import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class donorPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton backButton = new JButton();
	ImageIcon image = new ImageIcon("company_logo.png");
	ImageIcon logo = new ImageIcon("hygieia_logo.png");
	JTextField firstNameField = new JTextField();
	JTextField lastNameField = new JTextField();
	JTextField middleNameField = new JTextField();
	JTextField age = new JTextField();
	JTextField sex = new JTextField();
	JTextField address = new JTextField();
	JTextField contact_num = new JTextField();
	JTextField height = new JTextField();
	JTextField weight = new JTextField();
	JTextField bmi = new JTextField();
	JTextField blood = new JTextField();
	JLabel firstnameLabel = new JLabel("First name:");
	JLabel lastnameLabel = new JLabel("Surname:");
	JLabel middlenameLabel = new JLabel("Middle Name:");
	JLabel age_text = new JLabel("Age:");
	JLabel sex_text = new JLabel("Sex:");
	JLabel add = new JLabel("Address:");
	JLabel contact = new JLabel("Contact number:");
	JLabel height_text = new JLabel("Height (cm):");
	JLabel weight_text = new JLabel("Weight (kg):");
	JLabel bmi_text = new JLabel("BMI:");
	JLabel blood_text = new JLabel("Blood Type:");
	JLabel ID = new JLabel("Valid ID:");
	JLabel Health = new JLabel("Health Status:");
	JLabel personal_info = new JLabel("Personal Information");
	JLabel medical_info = new JLabel("Medical Information");
	JLabel donorpage = new JLabel("Donor Page");
	JLabel Tattoo = new JLabel("Has Tattoo:");
	
	String[] IDs = {"<Select an option>", "National ID", "Driver's License", "Passport", "Senior Citezen ID", "Student ID"};
	JComboBox vID = new JComboBox(IDs);
	
	
	String[] HealthS = {"<Select an option>", "Medical Certificate" };
	JComboBox HealthStat = new JComboBox(HealthS);
	
	
	String[] HTattoo = {"<Select an option>", "Yes", "No"};
	JComboBox TattooH = new JComboBox(HTattoo);
	
	
	donorPage(){
		
		donorpage.setBounds(580, 50, 300, 35);
		donorpage.setFont(new Font(null, Font.PLAIN, 35));
		
		medical_info.setBounds(150, 400, 260, 35);
		medical_info.setFont(new Font(null, Font.PLAIN, 25));
		
		personal_info.setBounds(150, 90, 250, 35);
		personal_info.setFont(new Font(null, Font.PLAIN, 25));
		
		firstnameLabel.setBounds(100, 145, 250, 35);
		firstnameLabel.setFont(new Font(null, Font.PLAIN, 15));
		firstNameField.setBounds(222, 150, 200, 25);
		
		lastnameLabel.setBounds(100, 175, 250, 35);
		lastnameLabel.setFont(new Font(null, Font.PLAIN, 15));
		lastNameField.setBounds(222, 180, 200, 25);
		
		middlenameLabel.setBounds(100, 205, 250, 35);
		middlenameLabel.setFont(new Font(null, Font.PLAIN, 15));
		middleNameField.setBounds(222, 210, 200, 25);
		
		age_text.setBounds(100, 235, 250, 35);
		age_text.setFont(new Font(null, Font.PLAIN, 15));
		age.setBounds(222, 240, 200, 25);
		
		sex_text.setBounds(100, 265, 250, 35);
		sex_text.setFont(new Font(null, Font.PLAIN, 15));
		sex.setBounds(222, 270, 200, 25);
		
		add.setBounds(100, 295, 250, 35);
		add.setFont(new Font(null, Font.PLAIN, 15));
		address.setBounds(222, 300, 200, 25);
		
		contact.setBounds(100, 325, 250, 35);
		contact.setFont(new Font(null, Font.PLAIN, 15));
		contact_num.setBounds(222, 330, 200, 25);
		
		height_text.setBounds(100, 440, 250, 35);
		height_text.setFont(new Font(null, Font.PLAIN, 15));
		height.setBounds(222, 445, 200, 25);
		
		weight_text.setBounds(100, 470, 250, 35);
		weight_text.setFont(new Font(null, Font.PLAIN, 15));
		weight.setBounds(222, 475, 200, 25);
		
		bmi_text.setBounds(100, 500, 250, 35);
		bmi_text.setFont(new Font(null, Font.PLAIN, 15));
		bmi.setBounds(222, 505, 200, 25);
		
		blood_text.setBounds(100, 530, 250, 35);
		blood_text.setFont(new Font(null, Font.PLAIN, 15));
		blood.setBounds(222, 535, 200, 25);
		
		
		
		ID.setBounds(100, 355, 250, 35);
		ID.setFont(new Font(null, Font.PLAIN, 15));
		vID.setBounds(222, 360, 200, 25);
		vID.addActionListener(this);
		
		

		Health.setBounds(100, 590, 250, 35);
		Health.setFont(new Font(null, Font.PLAIN, 15));
		HealthStat.setBounds(222, 595, 200, 25);
		HealthStat.addActionListener(this);
		
		
		Tattoo.setBounds(100, 560, 250, 35);
		Tattoo.setFont(new Font(null, Font.PLAIN, 15));
		TattooH.setBounds(222, 565, 200, 25);
		TattooH.addActionListener(this);
		
		
		
		frame.add(TattooH);
		frame.add(Tattoo);
		frame.add(donorpage);
		frame.add(Health);
		frame.add(HealthStat);
		frame.add(blood);
		frame.add(blood_text);
		frame.add(bmi);
		frame.add(bmi_text);
		frame.add(weight_text);
		frame.add(weight);
		frame.add(height_text);
		frame.add(height);
		frame.add(medical_info);
		frame.add(personal_info);
		frame.add(ID);
		frame.add(vID);
		frame.add(contact);
		frame.add(contact_num);
		frame.add(address);
		frame.add(add);
		frame.add(sex);
		frame.add(sex_text);
		frame.add(age_text);
		frame.add(age);
		frame.add(middleNameField);
		frame.add(lastNameField);
		frame.add(firstNameField);
		frame.add(firstnameLabel);
		frame.add(lastnameLabel);
		frame.add(middlenameLabel);
		frame.add(backButton);
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(0xE7DECC));
		frame.setTitle("Hygieia Blood Foundation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1370, 749);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backButton) {
			frame.dispose();
			HomePage homepage = new HomePage(null); 
		}
		
	}
	
}

//new
//added height, weight, BMI, Blood Type, Has Tattoo, Health Status

//new updates
//added sex, address, contact number and valid ID options
