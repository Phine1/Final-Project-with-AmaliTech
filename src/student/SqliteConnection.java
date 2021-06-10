package student;
import java.sql.*;
import javax.swing.*;

public class SqliteConnection {
	Connection con = null;
	public static Connection dbConnect() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Phynxz\\git\\repository\\Final Java Project\\Final Project.sqlite");
			JOptionPane.showMessageDialog(null, "Connected Successfully");
			return con;
		}catch	(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	
	}
}
