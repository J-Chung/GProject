package dao;

import java.util.ArrayList;

import model.Commodity;
import model.ShoppingCart;

public interface InterfaceShoppingCart {

	public ArrayList<ShoppingCart> getAllShopCarts();

//	public boolean addPurComm(String Id);
//
//	public ArrayList<Commodity> getAllPurComm();

	public boolean insertPurComm(String Id);

	public boolean deletePurComm(String Id);

	public boolean updatePurCommCount(String Id, Integer Count);
}
