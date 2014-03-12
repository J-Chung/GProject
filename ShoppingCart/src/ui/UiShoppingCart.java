package ui;

import logic.LogicShoppingCart;

public class UiShoppingCart {

	public static void getAllShopCarts() {
		System.out.println("我的购物车：\n");
		System.out.println("我的订单：\n");
		System.out.println(LogicShoppingCart.getAllShopCarts());
	}
}
