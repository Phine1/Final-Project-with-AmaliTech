package student;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class StudentLogin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentLogin window = new StudentLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection con = null;
	private JTextField username;
	private JPasswordField pass;
	/**
	 * Create the application.
	 */
	public StudentLogin() {
		initialize();
		con = SqliteConnection.dbConnect();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAutoRequestFocus(false);
		frame.setBounds(100, 100, 740, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pearl International School Login Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 22));
		lblNewLabel.setBounds(134, 35, 449, 54);
		frame.getContentPane().add(lblNewLabel);
		
		username = new JTextField();
		username.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		username.setBounds(292, 114, 160, 35);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JLabel user = new JLabel("Username");
		user.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		user.setBounds(196, 117, 72, 26);
		frame.getContentPane().add(user);
		
		JLabel id = new JLabel("School ID");
		id.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		id.setBounds(196, 173, 72, 26);
		frame.getContentPane().add(id);
		
		JButton Slogin = new JButton("LOGIN");
		Slogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query ="select * from  Student where name =? and id=?";
					PreparedStatement pst = con.prepareStatement(query);
					pst.setString (1,username.getText());
					pst.setString (2,pass.getText());
					
				    ResultSet rs = pst.executeQuery();
				    int count = 0;
				    while (rs.next()) {
				    	count ++;
				    }
				    if(count ==1) {
				    	JOptionPane.showMessageDialog(null, "Username and password is correct");
				    	frame.dispose();
				    	FeesPage fee = new FeesPage();
				    	         fee.setVisible(true);
				    }
				    else if (count>1) {
				    	JOptionPane.showMessageDialog(null, "Duplicate Username and password");
				    }
				    else {JOptionPane.showMessageDialog(null, "Username or password is incorrect");
				    }
				    rs.close();
				    pst.close();
				    
				}catch	(Exception ea)
				{
					JOptionPane.showMessageDialog(null, ea);
					
				}
			}
		});
		Slogin.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		Slogin.setBounds(292, 231, 160, 26);
		frame.getContentPane().add(Slogin);
		
		pass = new JPasswordField();
		pass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pass.setBounds(291, 173, 161, 29);
		frame.getContentPane().add(pass);
		
		JButton Flogin = new JButton("LOGIN");
		Flogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query ="select * from  Faculty where name =? and id=?";
					PreparedStatement pst = con.prepareStatement(query);
					pst.setString (1,username.getText());
					pst.setString (2,pass.getText());
					
				    ResultSet rs = pst.executeQuery();
				    int count = 0;
				    while (rs.next()) {
				    	count ++;
				    }
				    if(count ==1) {
				    	JOptionPane.showMessageDialog(null, "Username and password is correct");
				    	frame.dispose();
				    	Salary sala = new Salary();
				    	         sala.setVisible(true);
				    }
				    else if (count>1) {
				    	JOptionPane.showMessageDialog(null, "Duplicate Username and password");
				    }
				    else {JOptionPane.showMessageDialog(null, "Username or password is incorrect");
				    }
				    rs.close();
				    pst.close();
				    
				}catch	(Exception ea)
				{
					JOptionPane.showMessageDialog(null, ea);
					
				}
			}
			
		});
		Flogin.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		Flogin.setBounds(292, 293, 160, 26);
		frame.getContentPane().add(Flogin);
		
		JLabel studentlabel = new JLabel("Student");
		studentlabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		studentlabel.setBounds(196, 236, 72, 17);
		frame.getContentPane().add(studentlabel);
		
		JLabel facultylabel = new JLabel("Faculty ");
		facultylabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		facultylabel.setBounds(196, 298, 59, 17);
		frame.getContentPane().add(facultylabel);
	}
}
