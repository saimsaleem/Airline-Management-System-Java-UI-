import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField textField_1;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		Passenger passenger = new Passenger();
		setTitle("Login - NPAFS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 255, 255));
		panel1.setBounds(38, 62, 174, 159);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblUser = new JLabel("Username");
		lblUser.setBounds(12, 0, 132, 14);
		lblUser.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		panel1.add(lblUser);
		
		txtUser = new JTextField();
		txtUser.setBounds(12, 15, 133, 20);
		panel1.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(12, 36, 132, 14);
		lblPassword.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		panel1.add(lblPassword);
		
		JLabel lblInvalid = new JLabel("");
		lblInvalid.setForeground(new Color(255, 0, 0));
		lblInvalid.setVerticalAlignment(SwingConstants.BOTTOM);
		lblInvalid.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 9));
		lblInvalid.setBounds(10, 66, 134, 21);
		panel1.add(lblInvalid);
		
		
		
		JLabel lblForgot = new JLabel("Forgot Password?");
		lblForgot.setBounds(12, 110, 85, 14);
		lblForgot.setForeground(new Color(138, 43, 226));
		lblForgot.setFont(new Font("Arial Narrow", Font.ITALIC, 11));
		panel1.add(lblForgot);
		
		textField_1 = new JTextField();
		textField_1.setBounds(58, 112, 132, 20);
		textField_1.setColumns(10);
		lblUser.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnAdmin = new JButton("Login as Admin");
		btnAdmin.setBounds(259, 78, 132, 28);
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin admin = new AdminLogin();
				admin.setVisible(true);
				dispose();
			}
		});
		btnAdmin.setForeground(Color.WHITE);
		btnAdmin.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAdmin.setBackground(Color.BLACK);
		contentPane.add(btnAdmin);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setBounds(259, 121, 132, 28);
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateAccount create = new CreateAccount();
				create.setVisible(true);
				dispose();
			}
		});
		btnCreateAccount.setForeground(Color.WHITE);
		btnCreateAccount.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCreateAccount.setBackground(Color.BLACK);
		contentPane.add(btnCreateAccount);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(12, 49, 132, 20);
		panel1.add(txtPassword);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 51);
		panel.setBackground(SystemColor.controlHighlight);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NPAFS");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(0, 11, 434, 34);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 19));
		
		JButton btnNewButton = new JButton("Guest Use");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuestSchedule schedule = new GuestSchedule();
				schedule.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(11, 127, 77, 20);
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Yu Gothic UI", Font.BOLD, 9));
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setForeground(Color.BLACK);
		panel1.add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(12, 84, 132, 23);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUser.getText();
				String password = txtPassword.getText();
				
				if(txtUser.getText().isBlank() || txtPassword.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Fields cannot be empty!");
				}
				else if(!txtUser.getText().isBlank() || !txtPassword.getText().isBlank()) {
				
				for(int i=0 ; i<passenger.getPassengers().size(); i++) {
					if(username.equals(passenger.getPassengers().get(i).getUsername())  &&  password.equals(passenger.getPassengers().get(i).getPassword())){
						lblInvalid.setText("");
						MainMenu main = new MainMenu();
						main.setVisible(true);
						dispose();
						}
				
					}
				lblInvalid.setText("Invalid Username or Password!");
				}
					
			}
		});
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 11));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.BLACK);
		panel1.add(btnLogin);
		
		lblForgot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Contact Department");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblForgot.setFont(new Font("Arial Narrow", Font.ITALIC, 10));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblForgot.setFont(new Font("Arial Narrow", Font.ITALIC, 11));
			}
		});
		
	}
}
