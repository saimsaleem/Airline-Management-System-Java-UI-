import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Bookings extends JFrame {

	private JPanel contentPane;
	private JTable table;
	int state =1;
	
public int getState() {
	return state;
}
	public void setState(int states) {
		this.state = states;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bookings frame = new Bookings();
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
	public Bookings() {
		Passenger flights = new Passenger();
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(919,530);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 11, 872, 48);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("My Bookings");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 97, 872, 383);
		DefaultTableModel model = new DefaultTableModel();
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(0, 250, 154));
		Object[] column = {
			"Date", "Departure", "Arrival", "Flight Time", "Arr.Time", "Duration", "Type","Cost", "Seats", "State"
		};
		Object[] row = new Object[10];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		scrollPane.setViewportView(table);
		
		JButton btnMenu = new JButton("Main Menu");
		btnMenu.setForeground(new Color(255, 255, 255));
		btnMenu.setBackground(new Color(0, 0, 0));
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu main = new MainMenu();
				main.setVisible(true);
				dispose();
			}
		});
		btnMenu.setBounds(31, 63, 103, 23);
		getContentPane().add(btnMenu);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.setForeground(new Color(255, 255, 255));
		btnBuy.setBackground(new Color(0, 0, 0));
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
					String CardNo;
					CardNo = JOptionPane.showInputDialog(null,"Enter Card Number");
					String OTP;
					OTP = JOptionPane.showInputDialog(null,"Enter OTP");
					JOptionPane.showMessageDialog(null, "Ticket Owned!");
					setState(2);
					model.setValueAt("Owned", i, 9);
			}
				else
					JOptionPane.showMessageDialog(null, "Please Select a Flight!");
			}
		});
		btnBuy.setBounds(203, 63, 103, 23);
		getContentPane().add(btnBuy);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
					flights.getFlight().remove(i);
				}
				else
					JOptionPane.showMessageDialog(null, "Select a Row!");
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(Color.BLACK);
		btnCancel.setBounds(372, 63, 103, 23);
		getContentPane().add(btnCancel);
		for(Flights flight :flights.getFlight()) {
			row[0] = flight.getDate();
			row[1] = flight.getCity();
			row[2] = flight.getArrCity();
			row[3] = flight.getDepTime();
			row[4] = flight.getArrTime();
			row[5] = flight.getDuration();
			row[6] = flight.getType();
			row[7] = flight.getCost();
			row[8] = flight.getSeats();
			if(getState()==2) {
			row[9] = "Owned";}
			else {
			row[9] = "Booked";
			}
			model.addRow(row);
		}	
		
	}
}
