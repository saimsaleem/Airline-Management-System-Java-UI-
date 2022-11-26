import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		
		setTitle("Home - NPAFS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(10, 11, 156, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewpak = new JLabel("<html> New-Pak AirLine Flight System</html>");
		lblNewpak.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewpak.setForeground(Color.DARK_GRAY);
		lblNewpak.setFont(new Font("Yu Gothic Light", Font.BOLD, 25));
		lblNewpak.setBackground(Color.BLACK);
		lblNewpak.setBounds(10, 58, 414, 98);
		contentPane.add(lblNewpak);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(0, 58, 434, 98);
		contentPane.add(panel);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuestSchedule schedule = new GuestSchedule();
				schedule.setVisible(true);
				dispose();
			}
		});
		btnSchedule.setBackground(SystemColor.controlHighlight);
		btnSchedule.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSchedule.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		btnSchedule.setBounds(247, 200, 124, 29);
		contentPane.add(btnSchedule);
		
		JButton btnLogin = new JButton("Log-in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnLogin.setVerticalAlignment(SwingConstants.BOTTOM);
		btnLogin.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		btnLogin.setBackground(SystemColor.controlHighlight);
		btnLogin.setBounds(69, 201, 124, 29);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("Come Fly with Us");
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.ITALIC, 11));
		lblNewLabel_1.setForeground(SystemColor.controlHighlight);
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setBounds(344, 46, 90, 14);
		contentPane.add(lblNewLabel_1);
	}
}
