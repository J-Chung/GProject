package dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Commodity;
import model.ShoppingCart;
import model.User;

public class Dao {

	public static ArrayList<Commodity> commList = new ArrayList<Commodity>();
	public static ArrayList<ShoppingCart> cartList = new ArrayList<ShoppingCart>();
	public static ArrayList<Commodity> purchasedList = new ArrayList<Commodity>();
	public static ArrayList<User> userList = new ArrayList<User>();
	
	static {
		commList.add(new Commodity("001", "�ѽ�ʿ", new Date(2000 - 1 - 1), "�Ϸ�",
				12.0, 15.0, "���ŷ��ģ��õ�����", 10));
		commList.add(new Commodity("002", "�л����ݰ�", new Date(2000 - 1 - 1),
				"�Ϸ�", 12.0, 15.0, "���ŷ���", 10));
		commList.add(new Commodity("003", "���ϰ�ҩ", new Date(2000 - 1 - 1), "�Ϸ�",
				12.0, 15.0, "���ŷ���", 10));
		userList.add(new User("admin", "admin"));
		
		/*try {
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc.mysql://localhost_3306/shoppingcart","root","123");
			
			Statement stmt = con.createStatement();
			
			String query = "select * from user";
			ResultSet rs = stmt.executeQuery(query);
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
	}
}
