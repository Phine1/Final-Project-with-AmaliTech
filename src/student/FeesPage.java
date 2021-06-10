package student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class FeesPage extends JFrame {

	private JPanel contentPane;
	private JTextField feeamount;
	private JTextField feebalance;


	
	/**
	 * Create the frame.
	 */
	public FeesPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcome = new JLabel("Dear Students, kindly use this portal to Pay and Check your tuition balance");
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		welcome.setBounds(62, 35, 618, 45);
		contentPane.add(welcome);
		
		JLabel fees = new JLabel("NB: Regardless of your grade, every student must pay GHS 25000 only");
		fees.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		fees.setBounds(96, 111, 492, 37);
		contentPane.add(fees);
		
		JLabel EnAmount = new JLabel("Enter Amount   GHS");
		EnAmount.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 14));
		EnAmount.setBounds(84, 172, 108, 37);
		contentPane.add(EnAmount);
		
		feeamount = new JTextField();
		feeamount.setHorizontalAlignment(SwingConstants.CENTER);
		feeamount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					}
		});
		feeamount.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 14));
		feeamount.setBounds(198, 176, 167, 28);
		contentPane.add(feeamount);
		feeamount.setColumns(10);
		
		JButton confirmfees = new JButton("Confirm");
		confirmfees.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			double fee,confirm,balance,tuitionFee;
			tuitionFee = 25000.00;
			fee = Double.parseDouble(feeamount.getText());
			balance = tuitionFee-fee;
			feebalance.setText(Double.toString(balance));
			JOptionPane.showMessageDialog(confirmfees, "Confirm fee payment");
			} 
		});
		confirmfees.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 14));
		confirmfees.setBounds(238, 227, 95, 23);
		contentPane.add(confirmfees);
		
		JLabel fb = new JLabel("Fee Balance  GHS");
		fb.setHorizontalAlignment(SwingConstants.CENTER);
		fb.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 14));
		fb.setBounds(84, 317, 103, 23);
		contentPane.add(fb);
		
		feebalance = new JTextField();
		feebalance.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 14));
		feebalance.setBounds(198, 312, 167, 28);
		contentPane.add(feebalance);
		feebalance.setColumns(10);
	
	}
}
