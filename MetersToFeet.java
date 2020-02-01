import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MetersToFeet extends JFrame {

	private JLabel lblMeters;
	private JLabel lblFeet;
	private JTextField txtMeters;
	private JTextField txtFeet;
	private JButton btnMeters;
	private JButton btnFeet;
	private JPanel pnlMain;

	public MetersToFeet() {

		super("Meters To Feet Converter");
		setLayout(new BorderLayout());
		
		// Instantiating variables
		lblMeters = new JLabel("Meters");
		lblFeet = new JLabel("Feet");

		txtMeters = new JTextField("");
		txtMeters.setColumns(10);
		txtFeet = new JTextField("");
		txtFeet.setColumns(10);

		btnMeters = new JButton("Convert to Meters");
		btnFeet = new JButton("Convert to Feet");

		pnlMain = new JPanel(new GridLayout(3, 2, 5, 5));

		// Add onto main panel
		pnlMain.add(lblMeters);
		lblMeters.setHorizontalAlignment(JLabel.CENTER);
		pnlMain.add(lblFeet);
		lblFeet.setHorizontalAlignment(JLabel.CENTER);

		pnlMain.add(txtMeters);
		pnlMain.add(txtFeet);

		pnlMain.add(btnFeet);
		pnlMain.add(btnMeters);

		// Add onto Frame and set Frame behaviour
		add(pnlMain, BorderLayout.NORTH);

		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 125);
		setLocation(800, 500);
		setResizable(false);
		
		// Functionality

		btnFeet.addActionListener((ActionEvent e) -> {

			try {

				double meters = Double.parseDouble(txtMeters.getText());
				
				if(meters < 0) {
					txtMeters.setText("Invalid input!");
					txtFeet.setText("Invalid input!");
					return;
				}
				
				txtFeet.setText("" + meters*3.281);
				
			} catch (Exception error) {
				txtMeters.setText("Invalid input!");
				txtFeet.setText("Invalid input!");
			}

		});

		btnMeters.addActionListener((ActionEvent e) -> {

			try {

				double feet = Double.parseDouble(txtFeet.getText());
				
				if(feet < 0) {
					txtMeters.setText("Invalid input!");
					txtFeet.setText("Invalid input!");
					return;
				}
				
				txtMeters.setText("" + feet/3.281);
				
			} catch (Exception error) {
				txtMeters.setText("Invalid input!");
				txtFeet.setText("Invalid input!");
			}

		});

	}

}
