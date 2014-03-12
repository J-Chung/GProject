package dao;

import java.util.ArrayList;
import java.util.Date;

import model.Commodity;
import model.ShoppingCart;

public class ListShoppingCart implements InterfaceShoppingCart {

	@Override
	public ArrayList<ShoppingCart> getAllShopCarts() {
		for (int i = 0; i < dao.Dao.cartList.size(); i++) {
			return dao.Dao.cartList;
		}
		return null;
	}

	@Override
	public boolean insertPurComm(String Id) {
		for (int i = 0; i < dao.Dao.commList.size(); i++) {
			if (dao.Dao.commList.get(i).getId().equals(Id)
					&& dao.Dao.commList.get(i).isStatus() == true)
				dao.Dao.purchasedList.add(dao.Dao.commList.get(i));
			return true;
		}
		return false;
	}

	@Override
	public boolean deletePurComm(String Id) {
		for (int i = 0; i < dao.Dao.commList.size(); i++) {
			if (dao.Dao.purchasedList.get(i).getId().equals(Id)
					&& dao.Dao.purchasedList.get(i).isStatus() == false)
				dao.Dao.purchasedList.add(dao.Dao.commList.get(i));
			return true;
		}
		return false;
	}

	@Override
	public boolean updatePurCommCount(String Id, Integer Count) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
