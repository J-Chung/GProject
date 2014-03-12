package logic;

import java.util.ArrayList;

import model.Commodity;
import dao.InterfaceCommodity;
import dao.InterfaceUser;
import dao.ListCommodity;
import dao.ListUser;

public class LogicUser {

	public static InterfaceUser user = new ListUser();
	public static InterfaceCommodity commodity = new ListCommodity();

	public static ArrayList<Commodity> getAllUserPurComm(String Id) {
		return user.getAllUserPurComm(Id);
	}

	public static String getUserName(String PWD) {
		return user.getUserName(PWD);
	}

	public static String getComment(String Id) {
		return commodity.getComment(Id);
	}

	public static boolean setComment(String Id, String Comment) {
		return commodity.setComment(Id, Comment);
	}

	public static boolean checkUser(String Name, String Pwd) {
		for (int i = 0; i < user.getAllUers().size(); i++) {
			if (user.getAllUers().get(i).getUser_Name().equals(Name)
					&& user.getAllUers().get(i).getUser_PWD().equals(Pwd)) {
				return true;
			}
		}
		return false;
	}
}