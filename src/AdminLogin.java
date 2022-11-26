import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdmin;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setTitle("Admin Login - NPAFS");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdmin = new JLabel("Admin - Login");
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 16));
		lblAdmin.setBounds(10, 0, 414, 31);
		contentPane.add(lblAdmin);
		
		txtAdmin = new JTextField();
		txtAdmin.setText("admin");
		txtAdmin.setColumns(10);
		txtAdmin.setBounds(74, 87, 133, 20);
		contentPane.add(txtAdmin);
		
		JLabel lblUser = new JLabel("Username");
		lblUser.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		lblUser.setBounds(75, 72, 132, 14);
		contentPane.add(lblUser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		lblPassword.setBounds(75, 118, 132, 14);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtAdmin.getText();
				String password = txtPassword.getText();
				if(username.equals("admin") && password.equals("plastic123")) {
					AdminControl admin = new AdminControl();
					admin.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Password or Username!");
				}
				
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 11));
		btnLogin.setBackground(Color.BLACK);
		btnLogin.setBounds(75, 163, 132, 23);
		contentPane.add(btnLogin);
		
		JButton btnPassenger = new JButton("Passenger");
		btnPassenger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnPassenger.setForeground(Color.WHITE);
		btnPassenger.setFont(new Font("Arial", Font.PLAIN, 11));
		btnPassenger.setBackground(Color.BLACK);
		btnPassenger.setBounds(267, 109, 132, 23);
		contentPane.add(btnPassenger);
		
		JLabel lblLoginAs = new JLabel("Login as:");
		lblLoginAs.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLoginAs.setFont(new Font("Arial Narrow", Font.BOLD, 11));
		lblLoginAs.setBounds(267, 90, 132, 17);
		contentPane.add(lblLoginAs);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(75, 132, 132, 20);
		contentPane.add(txtPassword);
	}

}
