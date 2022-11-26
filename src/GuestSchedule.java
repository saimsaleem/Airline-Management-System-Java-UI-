import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;

public class GuestSchedule extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuestSchedule frame = new GuestSchedule();
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
	public GuestSchedule() {
		setTitle("Guest Schedule");
Flights flights = new Flights();
		
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(919,530);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(10, 11, 883, 48);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("NPAFS - Flights");
		lblNewLabel.setForeground(SystemColor.desktop);
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 117, 883, 363);
		DefaultTableModel model = new DefaultTableModel();
		getContentPane().add(scrollPane);
		
		JTable table = new JTable();
		table.setEnabled(false);
		table.setBackground(new Color(0, 250, 154));
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		Object[] column = {
			"Date", "Departure", "Arrival", "Flight Time", "Arr.Time", "Duration", "Type","Cost", "Avail Seats"
		};
		Object[] row = new Object[9];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		scrollPane.setViewportView(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(SystemColor.text);
		btnBack.setBackground(SystemColor.desktop);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start start = new Start();
				start.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(51, 70, 89, 36);
		getContentPane().add(btnBack);
		for(Flights flight : flights.getFlights()) {
			row[0] = flight.getDate();
			row[1] = flight.getCity();
			row[2] = flight.getArrCity();
			row[3] = flight.getDepTime();
			row[4] = flight.getArrTime();
			row[5] = flight.getDuration();
			row[6] = flight.getType();
			row[7] = flight.getCost();
			row[8] = flight.getAvailableSeats();
			model.addRow(row);
		}
		setVisible(true);
	}
}
