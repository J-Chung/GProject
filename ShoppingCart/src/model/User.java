package model;

public class User {

	private String User_Name;
	private String User_PWD;

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public String getUser_PWD() {
		return User_PWD;
	}

	public void setUser_PWD(String user_PWD) {
		User_PWD = user_PWD;
	}

	public User(String user_Name, String user_PWD) {
		User_Name = user_Name;
		User_PWD = user_PWD;
	}
	
}
