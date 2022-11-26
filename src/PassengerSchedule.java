import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PassengerSchedule extends JFrame {

	private JTable table;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerSchedule frame = new PassengerSchedule();
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
	public PassengerSchedule() {
		Flights flights = new Flights();
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(919,530);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 11, 773, 48);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("NPAFS - Flights");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 97, 773, 383);
		DefaultTableModel model = new DefaultTableModel();
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(0, 250, 154));
		Object[] column = {
			"Date", "Departure", "Arrival", "Flight Time", "Arr.Time", "Duration", "Type","Cost", "Avail Seats","Total Seats"
		};
		Object[] row = new Object[10];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		scrollPane.setViewportView(table);
		
		
		
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
					
					String seats[] = {"Seats", "1", "2", "3", "4", "5", "6", "7"};
					JComboBox comboBox = new JComboBox(seats);
					int input;
					Passenger passenger = new Passenger();
					String str=null;
					input = JOptionPane.showConfirmDialog(null, comboBox,"Select number of seats:",JOptionPane.DEFAULT_OPTION);
					if(input == JOptionPane.OK_OPTION) {
						str = (String)comboBox.getSelectedItem();
						passenger.setSeats(str);
					}
					Flights flight = new Flights(model.getValueAt(i, 1).toString(),model.getValueAt(i, 2).toString(),model.getValueAt(i, 3).toString(),model.getValueAt(i, 4).toString(),model.getValueAt(i, 0).toString(),model.getValueAt(i, 5).toString(),model.getValueAt(i, 6).toString(),model.getValueAt(i, 7).toString(),"50",model.getValueAt(i, 8).toString(),str);
					
					passenger.getFlight().add(flight);
					JOptionPane.showMessageDialog(null, "Flight booked Successfully!");
				}
				else
					JOptionPane.showMessageDialog(null, "Please Select a Flight!");
			}
		});
		btnBook.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBook.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		btnBook.setBackground(new Color(0, 0, 0));
		btnBook.setForeground(new Color(255, 255, 255));
		btnBook.setBounds(793, 135, 89, 38);
		getContentPane().add(btnBook);
		
		JLabel lblNewLabel_1 = new JLabel("Click on the Flight and press the \"Book\" button to reserve your ticket");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(10, 72, 412, 24);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnBookings = new JButton("Bookings");
		btnBookings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bookings bookings = new Bookings();
				bookings.setVisible(true);
				dispose();
			}
		});
		btnBookings.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBookings.setForeground(Color.WHITE);
		btnBookings.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		btnBookings.setBackground(Color.BLACK);
		btnBookings.setBounds(793, 203, 89, 38);
		getContentPane().add(btnBookings);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu main = new MainMenu();
				main.setVisible(true);
				dispose();
			}
		});
		btnMenu.setVerticalAlignment(SwingConstants.BOTTOM);
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		btnMenu.setBackground(Color.BLACK);
		btnMenu.setBounds(793, 269, 89, 38);
		getContentPane().add(btnMenu);
		for(Flights flight :flights.getFlights()) {
			row[0] = flight.getDate();
			row[1] = flight.getCity();
			row[2] = flight.getArrCity();
			row[3] = flight.getDepTime();
			row[4] = flight.getArrTime();
			row[5] = flight.getDuration();
			row[6] = flight.getType();
			row[7] = flight.getCost();
			row[8] = flight.getAvailableSeats();
			row[9] = flight.getTotalSeats();
			model.addRow(row);
		}	
		
	}
}
