import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CreateAccount extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtCNIC;
	private JTextField txtAge;
	private JPasswordField txtPassword;
	private JPasswordField txtConfirm;
	private JTextField txtUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount frame = new CreateAccount();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreateAccount() {
		Passenger pass = new Passenger();
		setTitle("Register - NPAFS");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Account");
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
		lblName.setBounds(55, 56, 46, 14);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(106, 53, 126, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblCNIC = new JLabel("CNIC#");
		lblCNIC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCNIC.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
		lblCNIC.setBounds(55, 88, 46, 14);
		contentPane.add(lblCNIC);
		
		txtCNIC = new JTextField();
		txtCNIC.setColumns(10);
		txtCNIC.setBounds(106, 85, 126, 20);
		contentPane.add(txtCNIC);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
		lblAge.setBounds(55, 116, 46, 14);
		contentPane.add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(106, 113, 126, 20);
		contentPane.add(txtAge);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
		lblPassword.setBounds(44, 174, 57, 14);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
		lblConfirmPassword.setBounds(10, 202, 96, 14);
		contentPane.add(lblConfirmPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(106, 171, 126, 20);
		contentPane.add(txtPassword);
		
		txtConfirm = new JPasswordField();
		txtConfirm.setBounds(106, 199, 126, 20);
		contentPane.add(txtConfirm);
		
		JLabel lblMismatch = new JLabel("");
		lblMismatch.setForeground(Color.RED);
		lblMismatch.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblMismatch.setBackground(Color.RED);
		lblMismatch.setBounds(106, 217, 126, 14);
		contentPane.add(lblMismatch);
		
		JLabel lblInvalidPassword = new JLabel("");
		lblInvalidPassword.setForeground(Color.RED);

		lblInvalidPassword.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblInvalidPassword.setBackground(Color.RED);
		lblInvalidPassword.setBounds(106, 190, 168, 10);
		contentPane.add(lblInvalidPassword);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			String name,cnic,age,username,password,password2;
			public void actionPerformed(ActionEvent e) {
				 name = txtName.getText();
				 cnic = txtCNIC.getText();
				 age = txtAge.getText();
				 username = txtUsername.getText();
				 password = txtPassword.getText();
				 password2 = txtConfirm.getText();
				 
				boolean hasUppercase = !password.equals(password.toLowerCase());
				boolean hasLowercase = !password.equals(password.toUpperCase());
					
				boolean passMatch=false,passValid=false,cnicValid=false;
				
				if(password.length()<8) {
					 lblInvalidPassword.setText("Must be 8 char long");
				 }
				else if(!hasUppercase) {
					lblInvalidPassword.setText("Must have an Uppercase");
				}
				else if(!hasLowercase) {
					lblInvalidPassword.setText("Must have a Lowercase");
				}
				else if(!password.contains("1") && !password.contains("2") && !password.contains("3") && !password.contains("4") && !password.contains("5") && !password.contains("6") && !password.contains("7") && !password.contains("8") && !password.contains("9") && !password.contains("0")) {
					 lblInvalidPassword.setText("Must Include a digit!");
				}
				else if(!password.contains("!") && !password.contains("@") && !password.contains("#") && !password.contains("$") && !password.contains("%")) {
					lblInvalidPassword.setText("Must Include a special character");
				}
				else {
					passValid=true;
					 lblInvalidPassword.setText("");
				}
				 if(password.equals(password2) && !password.isBlank()) {
					 lblMismatch.setForeground(Color.GREEN);
					 lblMismatch.setBackground(Color.GREEN);
					 lblMismatch.setText("Passwords matched!");
					 passMatch=true;
						
					}
				 else {
					 lblMismatch.setForeground(Color.RED);
					 lblMismatch.setBackground(Color.RED);
					 lblMismatch.setText("Passwords don't match!");
					 passMatch=false;
				 }
				 
				if((name.isBlank()) || (cnic.isBlank()) || (age.isBlank()) || (username.isBlank()) || (password.isBlank()) || (password2.isBlank())) {
					JOptionPane.showMessageDialog(null, "All Fields should be filled!");
				}
				
				if(cnic.length()==13) {
					cnicValid=true;
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid CNIC!");
				}
				
				if(passMatch && passValid && cnicValid) {
					Passenger passenger = new Passenger(name,age,cnic,password,username);
					pass.getPassengers().add(passenger);
					JOptionPane.showMessageDialog(null, "Account Added Succesfully");
					Login login = new Login();
					login.setVisible(true);
					dispose();
				}
				
			}
		});
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setBackground(Color.BLACK);
		btnCreate.setBounds(106, 236, 126, 23);
		contentPane.add(btnCreate);
		
		JButton btnAlreadyRegistered = new JButton("Already a User?");
		btnAlreadyRegistered.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnAlreadyRegistered.setForeground(Color.WHITE);
		btnAlreadyRegistered.setBackground(Color.BLACK);
		btnAlreadyRegistered.setBounds(284, 99, 126, 23);
		contentPane.add(btnAlreadyRegistered);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin admin = new AdminLogin();
				admin.setVisible(true);
				dispose();
			}
		});
		btnAdmin.setForeground(Color.WHITE);
		btnAdmin.setBackground(Color.BLACK);
		btnAdmin.setBounds(284, 137, 126, 23);
		contentPane.add(btnAdmin);
		
		JLabel lblCharacters = new JLabel("<html>8 characters, one special character, uppercase, lowercase, and numeric digit</html>");
		lblCharacters.setForeground(Color.RED);
		lblCharacters.setBackground(Color.RED);
		lblCharacters.setHorizontalAlignment(SwingConstants.LEFT);
		lblCharacters.setFont(new Font("Franklin Gothic Book", Font.ITALIC, 10));
		lblCharacters.setBounds(284, 191, 119, 53);
		contentPane.add(lblCharacters);
		
		JLabel lblNotePasswordMust = new JLabel("NOTE: Password must include;");
		lblNotePasswordMust.setHorizontalAlignment(SwingConstants.LEFT);
		lblNotePasswordMust.setForeground(Color.BLACK);
		lblNotePasswordMust.setFont(new Font("Franklin Gothic Book", Font.ITALIC, 10));
		lblNotePasswordMust.setBackground(Color.RED);
		lblNotePasswordMust.setBounds(284, 178, 140, 20);
		contentPane.add(lblNotePasswordMust);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(106, 141, 126, 20);
		contentPane.add(txtUsername);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
		lblUsername.setBounds(37, 143, 64, 14);
		contentPane.add(lblUsername);
		
		
		
		
	}
}
