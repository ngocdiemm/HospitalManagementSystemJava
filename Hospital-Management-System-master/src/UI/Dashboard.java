package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 232, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JTextArea txtrHospitalManagementSystem = new JTextArea();
		txtrHospitalManagementSystem.setForeground(new Color(204, 51, 51));
		txtrHospitalManagementSystem.setBackground(new Color(255, 232, 243));
		txtrHospitalManagementSystem.setFont(new Font("Monospaced", Font.BOLD, 45));
		txtrHospitalManagementSystem.setText("Hospital Management System");
		contentPane.add(txtrHospitalManagementSystem);
	}

}
