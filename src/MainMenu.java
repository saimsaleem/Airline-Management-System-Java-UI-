import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setTitle("Main Menu - NPAFS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 314);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(10, 11, 414, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Main Menu");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		lblNewLabel.setBounds(0, 11, 414, 40);
		panel.add(lblNewLabel);
		
		JButton btnBook = new JButton("Book Flight");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassengerSchedule schedule = new PassengerSchedule();
				schedule.setVisible(true);
				dispose();
			}
		});
		btnBook.setForeground(UIManager.getColor("Button.highlight"));
		btnBook.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBook.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnBook.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnBook.setBounds(54, 101, 138, 31);
		contentPane.add(btnBook);
		
		JButton btnCancelFlight = new JButton("Cancel Flight");
		btnCancelFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bookings bookings = new Bookings();
				bookings.setVisible(true);
				dispose();
			}
		});
		btnCancelFlight.setForeground(UIManager.getColor("Button.highlight"));
		btnCancelFlight.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCancelFlight.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnCancelFlight.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnCancelFlight.setBounds(242, 101, 138, 31);
		contentPane.add(btnCancelFlight);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassengerSchedule schedule = new PassengerSchedule();
				schedule.setVisible(true);
				dispose();
			}
		});
		btnSchedule.setForeground(UIManager.getColor("Button.highlight"));
		btnSchedule.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSchedule.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnSchedule.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnSchedule.setBounds(54, 143, 138, 31);
		contentPane.add(btnSchedule);
		
		JButton btnBookings = new JButton("Bookings");
		btnBookings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bookings bookings = new Bookings();
				bookings.setVisible(true);
				dispose();
			}
		});
		btnBookings.setForeground(UIManager.getColor("Button.highlight"));
		btnBookings.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBookings.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnBookings.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnBookings.setBounds(242, 143, 138, 31);
		contentPane.add(btnBookings);
		
		JButton btnContactUs = new JButton("Contact Us");
		btnContactUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Email us at: \"npafs@gmail.com\"" );
			}
		});
		btnContactUs.setForeground(UIManager.getColor("Button.highlight"));
		btnContactUs.setVerticalAlignment(SwingConstants.BOTTOM);
		btnContactUs.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnContactUs.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnContactUs.setBounds(54, 185, 138, 31);
		contentPane.add(btnContactUs);
		
		JButton btnAccount = new JButton("Account");
		btnAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAccount.setForeground(UIManager.getColor("Button.highlight"));
		btnAccount.setVerticalAlignment(SwingConstants.BOTTOM);
		btnAccount.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnAccount.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnAccount.setBounds(242, 185, 138, 31);
		contentPane.add(btnAccount);
		
		JButton btnLogout = new JButton("Log-out");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start start = new Start();
				start.setVisible(true);
				dispose();
			}
		});
		btnLogout.setForeground(UIManager.getColor("Button.highlight"));
		btnLogout.setVerticalAlignment(SwingConstants.BOTTOM);
		btnLogout.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnLogout.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnLogout.setBounds(148, 227, 138, 31);
		contentPane.add(btnLogout);
	}

}
