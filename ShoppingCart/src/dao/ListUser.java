package dao;

import java.util.ArrayList;

import model.Commodity;
import model.User;

public class ListUser implements InterfaceUser {

	@Override
	public ArrayList<Commodity> getAllUserPurComm(String Id) {
		return dao.Dao.purchasedList;
	}

	@Override
	public String getUserName(String PWD) {
		for (int i = 0; i < dao.Dao.userList.size(); i++) {
			if (dao.Dao.userList.get(i).getUser_PWD().equals(PWD)) {
				return dao.Dao.userList.get(i).getUser_Name();
			}
		}
		return null;
	}

	@Override
	public ArrayList<User> getAllUers() {
		return dao.Dao.userList;
	}

}
