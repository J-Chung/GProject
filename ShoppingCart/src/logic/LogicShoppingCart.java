package logic;

import java.util.ArrayList;

import model.ShoppingCart;
import dao.InterfaceShoppingCart;
import dao.ListShoppingCart;

public class LogicShoppingCart {

	public static InterfaceShoppingCart cart = new ListShoppingCart();

	public static ArrayList<ShoppingCart> getAllShopCarts() {
		return cart.getAllShopCarts();
	}

}
