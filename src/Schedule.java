import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Schedule extends JFrame {

	private JTable table;
	private JTextField textDate;
	private JTextField textDeparture;
	private JTextField textArrival;
	private JTextField textTime;
	private JTextField textArriveTime;
	private JTextField textDuration;
	private JTextField textCost;
	private JTextField textTotalSeats;
	private JTextField textAvbSeats;
	private JTextField textType;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Schedule frame = new Schedule();
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
	

	public Schedule() {
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
		scrollPane.setBounds(10, 86, 665, 394);
		DefaultTableModel model = new DefaultTableModel();
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(0, 250, 154));
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				textDate.setText(model.getValueAt(i, 0).toString());
				textDeparture.setText(model.getValueAt(i, 1).toString());
				textArrival.setText(model.getValueAt(i, 2).toString());
				textTime.setText(model.getValueAt(i, 3).toString());
				textArriveTime.setText(model.getValueAt(i, 4).toString());
				textDuration.setText(model.getValueAt(i, 5).toString());
				textType.setText(model.getValueAt(i, 6).toString());
				textCost.setText(model.getValueAt(i, 7).toString());
				textAvbSeats.setText(model.getValueAt(i, 8).toString());
			}
		});
		Object[] column = {
			"Date", "Departure", "Arrival", "Flight Time", "Arr.Time", "Duration", "Type","Cost", "Avail Seats"
		};
		Object[] row = new Object[9];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		scrollPane.setViewportView(table);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(685, 86, 208, 394);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(10, 292, 89, 23);
		panel_1.add(btnAdd);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setBackground(Color.BLACK);
		
		textDuration = new JTextField();
		textDuration.setBounds(79, 166, 110, 20);
		panel_1.add(textDuration);
		textDuration.setColumns(10);
		
		textCost = new JTextField();
		textCost.setBounds(79, 197, 110, 20);
		panel_1.add(textCost);
		textCost.setColumns(10);
		
		textArriveTime = new JTextField();
		textArriveTime.setBounds(79, 135, 110, 20);
		panel_1.add(textArriveTime);
		textArriveTime.setColumns(10);
		
		textTime = new JTextField();
		textTime.setBounds(79, 104, 110, 20);
		panel_1.add(textTime);
		textTime.setColumns(10);
		
		textArrival = new JTextField();
		textArrival.setBounds(79, 73, 110, 20);
		panel_1.add(textArrival);
		textArrival.setColumns(10);
		
		textDeparture = new JTextField();
		textDeparture.setBounds(79, 42, 110, 20);
		panel_1.add(textDeparture);
		textDeparture.setColumns(10);
		
		textDate = new JTextField();
		textDate.setBounds(79, 11, 110, 20);
		panel_1.add(textDate);
		textDate.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(10, 13, 46, 14);
		panel_1.add(lblDate);
		lblDate.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		
		JLabel lblDeparture = new JLabel("Departure");
		lblDeparture.setBounds(10, 45, 67, 14);
		panel_1.add(lblDeparture);
		lblDeparture.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		
		JLabel lblArrival = new JLabel("Arrival");
		lblArrival.setBounds(10, 76, 46, 14);
		panel_1.add(lblArrival);
		lblArrival.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		
		JLabel lblFlightTime = new JLabel("Flight Time");
		lblFlightTime.setBounds(13, 107, 67, 14);
		panel_1.add(lblFlightTime);
		lblFlightTime.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		
		JLabel lblD = new JLabel("Arrival Time");
		lblD.setBounds(13, 138, 67, 14);
		panel_1.add(lblD);
		lblD.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		
		JLabel lblDuartion = new JLabel("Duration");
		lblDuartion.setBounds(13, 169, 46, 14);
		panel_1.add(lblDuartion);
		lblDuartion.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		
		JLabel lblCost = new JLabel("Cost");
		lblCost.setBounds(13, 200, 46, 14);
		panel_1.add(lblCost);
		lblCost.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		
		JLabel lblNewLabel_1 = new JLabel("Seats");
		lblNewLabel_1.setBounds(89, 219, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total");
		lblNewLabel_1_1.setBounds(10, 235, 46, 20);
		panel_1.add(lblNewLabel_1_1);
		
		textTotalSeats = new JTextField();
		textTotalSeats.setBounds(39, 235, 59, 20);
		panel_1.add(textTotalSeats);
		textTotalSeats.setColumns(10);
		
		textAvbSeats = new JTextField();
		textAvbSeats.setColumns(10);
		textAvbSeats.setBounds(139, 235, 59, 20);
		panel_1.add(textAvbSeats);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Avbl");
		lblNewLabel_1_1_1.setBounds(110, 235, 46, 20);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblFlightType = new JLabel("Flight Type");
		lblFlightType.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		lblFlightType.setBounds(10, 266, 59, 14);
		panel_1.add(lblFlightType);
		
		textType = new JTextField();
		textType.setColumns(10);
		textType.setBounds(79, 264, 110, 20);
		panel_1.add(textType);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( textDate.getText().isBlank() || textDeparture.getText().isBlank() || textArrival.getText().isBlank() || textTime.getText().isBlank() || textArriveTime.getText().isBlank() || textDuration.getText().isBlank() || textCost.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Fill all Feilds");
				}
				else {	
				row[0] = textDate.getText();
				row[1] = textDeparture.getText();
				row[2] = textArrival.getText();
				row[3] = textTime.getText();
				row[4] = textArriveTime.getText();
				row[5] = textDuration.getText();
				row[6] = textType.getText();
				row[7] = textCost.getText();
				row[8] = textAvbSeats.getText();
				
				Flights flight = new Flights(textDeparture.getText(),textArrival.getText(),textTime.getText(),textArriveTime.getText(), textDate.getText(),textDuration.getText(),textType.getText(),textCost.getText(),textTotalSeats.getText(),textAvbSeats.getText(),"0");
				flights.getFlights().add(flight);
				
				model.addRow(row);
				
				textDate.setText("");
				textDeparture.setText("");
				textArrival.setText("");
				textTime.setText("");
				textArriveTime.setText("");
				textDuration.setText("");
				textCost.setText("");
				textType.setText("");
				textAvbSeats.setText("");
				}
			}
		});
		setVisible(true);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminControl admin = new AdminControl();
				admin.setVisible(true);
				dispose();
			}
		});
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setBackground(Color.BLACK);
		btnMenu.setBounds(63, 360, 89, 23);
		panel_1.add(btnMenu);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(109, 292, 89, 23);
		panel_1.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
					flights.getFlights().remove(i);
				}
				else
					JOptionPane.showMessageDialog(null, "Select a Row!");
			
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(Color.BLACK);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(10, 326, 89, 23);
		panel_1.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				try{model.setValueAt(textDate.getText(), i, 0);
				model.setValueAt(textDeparture.getText(), i, 1);
				model.setValueAt(textArrival.getText(), i, 2);
				model.setValueAt(textTime.getText(), i, 3);
				model.setValueAt(textArriveTime.getText(), i, 4);
				model.setValueAt(textDuration.getText(), i, 5);
				model.setValueAt(textType.getText(), i, 6);
				model.setValueAt(textCost.getText(), i, 7);
				model.setValueAt(textAvbSeats.getText(), i, 8);
				
				Flights upflight = new Flights(textDeparture.getText(),textArrival.getText(),textTime.getText(),textArriveTime.getText(), textDate.getText(),textDuration.getText(),textType.getText(),textCost.getText(),textTotalSeats.getText(),textAvbSeats.getText(),"0");
				flights.getFlights().set(i, upflight);
				
				}
				catch(Exception e1) {
					
				}
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setBackground(Color.BLACK);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(109, 326, 89, 23);
		panel_1.add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDate.setText("");
				textDeparture.setText("");
				textArrival.setText("");
				textTime.setText("");
				textArriveTime.setText("");
				textDuration.setText("");
				textType.setText("");
				textAvbSeats.setText("");
				textCost.setText("");
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setBackground(Color.BLACK);
	}
}
