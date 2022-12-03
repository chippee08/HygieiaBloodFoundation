import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class patientPage extends UserAndPass implements ActionListener{

	JFrame frame = new JFrame();
	JButton backButton = new JButton();
	JButton submitButton = new JButton("Submit");
	JButton resetButton = new JButton("Reset");
	JButton calculateButton = new JButton("Calculate");
	ImageIcon image = new ImageIcon("company_logo.png");
	ImageIcon logo = new ImageIcon("hygieia_logo.png");
	ImageIcon GoBack = new ImageIcon("backButton.png");
	JTextField firstNameField = new JTextField();
	JTextField lastNameField = new JTextField();
	JTextField middleNameField = new JTextField();
	JTextField age = new JTextField();
	JTextField sex = new JTextField();
	JTextField address = new JTextField();
	JTextField contact_num = new JTextField();
	JLabel firstnameLabel = new JLabel("First name:");
	JLabel lastnameLabel = new JLabel("Surname:");
	JLabel middlenameLabel = new JLabel("Middle Name:");
	JLabel age_text = new JLabel("Age:");
	JLabel sex_text = new JLabel("Sex");
	JLabel add = new JLabel("Address:");
	JLabel contact = new JLabel("Contact number:");
	JLabel ID = new JLabel("Valid ID:");
	JLabel personal_info = new JLabel("Personal Information");
	JLabel patientText = new JLabel("PATIENT PAGE");
	JLabel medical_info = new JLabel("Medical Information");
	JLabel height_text = new JLabel("Height (m):");
	JLabel weight_text = new JLabel("Weight (kg):");
	JLabel bmi_text = new JLabel("BMI:");
	JLabel bmi_class = new JLabel("BMI Classification:");
	JLabel blood_text = new JLabel("Blood Type:");
	JLabel compatibleType = new JLabel("Compatible Type:");
	JLabel disease_text = new JLabel("Disease type:");
	JTextField height = new JTextField();
	JTextField weight = new JTextField();
	JTextField bmi = new JTextField();
	JTextField bmi_classField = new JTextField();
	JTextField bloodType_comp = new JTextField();
	
	
	String[] bloodType = {"<Select an option>", "AB+", "AB-", "A+", "A-", "B+", "B-", "O+", "O-"};
	JComboBox blood = new JComboBox(bloodType);
	
	String[] sickness = {"<Select an option>", "Anemia", "Hemophila", "Kidney Disease", "Liver Disease", "Others"};
	JComboBox disease = new JComboBox(sickness);
	
	String[] IDs = {"<Select an option>", "National ID", "Driver's License", "Passport", "Senior Citezen ID", "Student ID"};
	JComboBox vID = new JComboBox(IDs);
	
	patientPage(){
		
		
		Image new_back = GoBack.getImage();
		Image modifiedBack = new_back.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		GoBack = new ImageIcon(modifiedBack);
		backButton.setBounds(10, 10, 25, 25);
		backButton.setIcon(GoBack);
		backButton.setBackground(new Color(0xE7DECC));
		backButton.setFocusable(false);
		backButton.addActionListener(this);
		
		submitButton.setBounds(444, 380, 100, 25);
		submitButton.setFocusable(false);
		submitButton.addActionListener(this);
		
		resetButton.setBounds(444, 420, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		calculateButton.setBounds(444, 505, 100, 25);
		calculateButton.setFocusable(false);
		calculateButton.addActionListener(this);
		
		medical_info.setBounds(150, 400, 260, 35);
		medical_info.setFont(new Font(null, Font.PLAIN, 25));
		
		height_text.setBounds(100, 440, 250, 35);
		height_text.setFont(new Font(null, Font.PLAIN, 15));
		height.setBounds(222, 445, 200, 25);
		
		weight_text.setBounds(100, 470, 250, 35);
		weight_text.setFont(new Font(null, Font.PLAIN, 15));
		weight.setBounds(222, 475, 200, 25);
		
		bmi_text.setBounds(100, 500, 250, 35);
		bmi_text.setFont(new Font(null, Font.PLAIN, 15));
		bmi.setBounds(222, 505, 200, 25);
		bmi.setEditable(false);
		
		bmi_class.setBounds(100, 530, 250, 35);
		bmi_class.setFont(new Font(null, Font.PLAIN, 15));
		bmi_classField.setBounds(222, 535, 200, 25);
		bmi_classField.setEditable(false);
		
		blood_text.setBounds(100, 560, 250, 35);
		blood_text.setFont(new Font(null, Font.PLAIN, 15));
		blood.setBounds(222, 565, 200, 25);
		blood.addActionListener(this);
		
		compatibleType.setBounds(100, 590, 250, 35);
		compatibleType.setFont(new Font(null, Font.PLAIN, 15));
		bloodType_comp.setBounds(222, 595, 200, 25);
		bloodType_comp.setEditable(false);
		
		disease_text.setBounds(100, 620, 250, 35);
		disease_text.setFont(new Font(null, Font.PLAIN, 15));
		disease.setBounds(222, 625, 200, 25);
		disease.addActionListener(this);
		
		patientText.setBounds(580, 50, 300, 35);
		patientText.setFont(new Font(null, Font.PLAIN, 35));
		
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
		
		ID.setBounds(100, 355, 250, 35);
		ID.setFont(new Font(null, Font.PLAIN, 15));
		vID.setBounds(222, 360, 200, 25);
		vID.addActionListener(this);
		
		frame.add(bmi_class);
		frame.add(bmi_classField);
		frame.add(compatibleType);
		frame.add(bloodType_comp);
		frame.add(calculateButton);
		frame.add(resetButton);
		frame.add(submitButton);
		frame.add(disease_text);
		frame.add(disease);
		frame.add(blood);
		frame.add(blood_text);
		frame.add(bmi);
		frame.add(bmi_text);
		frame.add(weight_text);
		frame.add(weight);
		frame.add(height_text);
		frame.add(height);
		frame.add(medical_info);
		frame.add(patientText);
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
			frame.hide();
			HomePage homepage = new HomePage(null); 
		}
		if(e.getSource() == resetButton) {
			firstNameField.setText("");
			lastNameField.setText("");
			middleNameField.setText("");
			age.setText("");
			sex.setText("");
			address.setText("");
			contact_num.setText("");
			vID.setSelectedItem(IDs[0]);
			height.setText("");
			weight.setText("");
			bmi.setText("");
			blood.setSelectedItem(bloodType[0]);
			disease.setSelectedItem(sickness[0]);
		}
		if(e.getSource() == calculateButton) {
			double hght, wght, total_bmi;
			
			hght = Double.valueOf(height.getText());
			wght = Double.valueOf(weight.getText());
			
			total_bmi = wght / (hght * hght);
			if(total_bmi < 18.5) {
				bmi.setText("" + total_bmi);
				bmi.setEditable(false);
				bmi_classField.setText("Underweight");
				bmi_classField.setEditable(false);
			}
			else if(total_bmi >= 18.5 && total_bmi < 25) {
				bmi.setText("" + total_bmi);
				bmi.setEditable(false);
				bmi_classField.setText("Normal");
				bmi_classField.setEditable(false);
			}
			else if(total_bmi >= 25.0 && total_bmi < 30) {
				bmi.setText("" + total_bmi);
				bmi.setEditable(false);
				bmi_classField.setText("Overweight");
				bmi_classField.setEditable(false);
			}
			else {
				bmi.setText("" + total_bmi);
				bmi.setEditable(false);
				bmi_classField.setText("Obese");
				bmi_classField.setEditable(false);
			}
		}
		if(e.getSource() == blood) {
			if(blood.getSelectedItem() == bloodType[1]) {
				bloodType_comp.setText("AB+");
				bloodType_comp.setEditable(false);
			}
			else if(blood.getSelectedItem() == bloodType[2]) {
				bloodType_comp.setText("AB+, AB-");
				bloodType_comp.setEditable(false);
			}
			else if(blood.getSelectedItem() == bloodType[3]) {
				bloodType_comp.setText("AB+, A+");
				bloodType_comp.setEditable(false);
			}
			else if(blood.getSelectedItem() == bloodType[4]) {
				bloodType_comp.setText("AB+, AB-, A+, A-" );
				bloodType_comp.setEditable(false);
			}
			else if(blood.getSelectedItem() == bloodType[5]) {
				bloodType_comp.setText("AB+, B+");
				bloodType_comp.setEditable(false);
			}
			else if(blood.getSelectedItem() == bloodType[6]) {
				bloodType_comp.setText("AB+, AB-, B+, B-");
				bloodType_comp.setEditable(false);
			}
			else if(blood.getSelectedItem() == bloodType[7]) {
				bloodType_comp.setText("AB+, A+, B+, O+");
				bloodType_comp.setEditable(false);
			}
			else if(blood.getSelectedItem() == bloodType[8]) {
				bloodType_comp.setText("AB+, AB-, A+, A-, B+, B-, O+, O-");
				bloodType_comp.setEditable(false);
			}
			else {
				bloodType_comp.setText("Please select an option.");
				bloodType_comp.setEditable(false);
			}
		}
		
	}
	
}
