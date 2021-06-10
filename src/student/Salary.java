package student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Salary extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Salary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Salahead = new JLabel("Salary Calculator for Faculty");
		Salahead.setHorizontalAlignment(SwingConstants.CENTER);
		Salahead.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		Salahead.setBounds(116, 11, 601, 63);
		contentPane.add(Salahead);
		
		JLabel lblNewLabel = new JLabel("Basic Salary  GHS\r\n");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		lblNewLabel.setBounds(82, 121, 134, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bonus    GHS");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(82, 176, 134, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Salary Received  GHS");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(82, 218, 134, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Salary Arrears  GHS");
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(82, 373, 134, 30);
		contentPane.add(lblNewLabel_4);
		
		JTextArea bs = new JTextArea();
		bs.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 14));
		bs.setBounds(216, 116, 149, 30);
		contentPane.add(bs);
		
		JTextArea bon = new JTextArea();
		bon.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 14));
		bon.setBounds(216, 174, 149, 30);
		contentPane.add(bon);
		
		JTextArea sr = new JTextArea();
		sr.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 14));
		sr.setBounds(216, 224, 149, 28);
		contentPane.add(sr);
		
		JTextArea sa = new JTextArea();
		sa.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 14));
		sa.setBounds(216, 373, 149, 30);
		contentPane.add(sa);
		
		JButton calc = new JButton("Calculate");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int basicSalary,bonus,salaryArrears,salaryReceived,netSalary;
				basicSalary = Integer.parseInt(bs.getText());
				bonus = Integer.parseInt(bon.getText());
				salaryReceived = Integer.parseInt(sr.getText());
				
				netSalary = basicSalary+bonus;
				salaryArrears = netSalary-salaryReceived;
				sa.setText(Integer.toString(salaryArrears));
			}
		});
		calc.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 14));
		calc.setBounds(227, 322, 122, 30);
		contentPane.add(calc);
	}
}
