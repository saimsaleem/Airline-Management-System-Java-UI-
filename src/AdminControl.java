import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminControl extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminControl frame = new AdminControl();
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
	public AdminControl() {
		setTitle("Admin - NPAFS");
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
		
		JLabel lblNewLabel = new JLabel("Admin Control");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		lblNewLabel.setBounds(0, 11, 414, 40);
		panel.add(lblNewLabel);
		
		JButton btnCancelFlight = new JButton("Cancel Flight");
		btnCancelFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Schedule schedule = new Schedule();
				schedule.setVisible(true);
				dispose();
			}
		});
		btnCancelFlight.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCancelFlight.setForeground(UIManager.getColor("Button.highlight"));
		btnCancelFlight.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnCancelFlight.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnCancelFlight.setBounds(242, 105, 138, 38);
		contentPane.add(btnCancelFlight);
		
		JButton btnSchedule = new JButton("Edit Schedule");
		btnSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Schedule schedule = new Schedule();
				schedule.setVisible(true);
				dispose();
			}
		});
		btnSchedule.setForeground(UIManager.getColor("Button.highlight"));
		btnSchedule.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSchedule.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnSchedule.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnSchedule.setBounds(50, 105, 138, 38);
		contentPane.add(btnSchedule);
		
		JButton btnResume = new JButton("Add Flight");
		btnResume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Schedule schedule = new Schedule();
				schedule.setVisible(true);
				dispose();
			}
		});
		btnResume.setForeground(UIManager.getColor("Button.highlight"));
		btnResume.setVerticalAlignment(SwingConstants.BOTTOM);
		btnResume.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnResume.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnResume.setBounds(50, 165, 138, 38);
		contentPane.add(btnResume);
		
		JButton btnLogout_1 = new JButton("Log-out");
		btnLogout_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start start = new Start();
				start.setVisible(true);
				dispose();
			}
		});
		btnLogout_1.setForeground(UIManager.getColor("Button.highlight"));
		btnLogout_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnLogout_1.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnLogout_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnLogout_1.setBounds(242, 165, 138, 38);
		contentPane.add(btnLogout_1);
	}

}
