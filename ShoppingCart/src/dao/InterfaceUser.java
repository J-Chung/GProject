package dao;

import java.util.ArrayList;

import model.Commodity;
import model.User;

public interface InterfaceUser {

	public String getUserName(String PWD);

	public ArrayList<Commodity> getAllUserPurComm(String Id);
	
	public ArrayList<User> getAllUers();

}
