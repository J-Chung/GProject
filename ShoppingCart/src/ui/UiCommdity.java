package ui;

import java.util.Date;
import java.util.Scanner;

import logic.LogicCommodity;
import logic.LogicShoppingCart;
import logic.LogicUser;
import model.ShoppingCart;

public class UiCommdity {

	public static void getAllCommodity() {
		System.out.println("购物");
		System.out.println(LogicCommodity.getAllCommodities());
		shopping();
	}

	private static Double sum = 0.0;

	public static void shopping() {
		System.out.println("请输入所需购买的商品编号");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();

		while (true) {
			System.out.println("执行到此");
			switch (id) {
			case "EOF":
				System.out.println("执行到此EOF");
				System.out.println(sum);
				System.out.println("=================我的购物车===============");
				addShopCart(id);
				System.out.println(LogicCommodity.getAllPurComm());
				System.out.println("总计：" + sum);
				System.out
						.println("==========================================");
				System.out.println("\n\n\n");
				System.out.println("=================我的订单==================");
				System.out.println(LogicShoppingCart.getAllShopCarts());
				System.out
						.println("==========================================");
				System.out.println("\n\n\n");
				System.out.println("是否更改购物车");
				System.out.println("1、YES\t2、NO");
				Scanner sca = new Scanner(System.in);
				String Id = sca.next();
				switch (Id) {
				case "1":
					updateShoppingCart();
					break;

				default:
					setComment();
					break;
				}
				break;

			default:

				if (LogicCommodity.checkId(id)) {
					if (LogicCommodity.checkPurCommId(id)) {
						System.out.println("执行到此累计");
						System.out.println("数量：");
						Scanner scan = new Scanner(System.in);
						Integer count = scan.nextInt();
						sum = LogicCommodity.getTotal_Price(id, count);
						LogicCommodity.setStatus_True(id);
						LogicCommodity.addPurComm(id);
						LogicCommodity.calculatNumber(id);
						LogicCommodity.purNumber(id, count);
					} else if (LogicCommodity.checkPurCommId(id) == false) {
						System.out.println("不可重复购买");
					}
				} else if (LogicCommodity.checkId(id) == false) {
					System.out.println("无此商品");
				}

				break;
			}
			id = sc.next();
		}

	}

	private static void setComment() {
		System.out.println("是否对已购商品进行评论");
		System.out.println("1、YES\t2、NO");
		Scanner sca = new Scanner(System.in);
		String Id = sca.next();
		switch (Id) {
		case "1":
			System.out.println("=================我的购物车===============");
			System.out.println(LogicCommodity.getAllPurComm());
			System.out.println("总计：" + sum);
			System.out.println("==========================================");
			System.out.println("评论商品ID");
			Scanner sc= new Scanner(System.in);
			String id = sc.next();
			if(LogicCommodity.checkPurId(id)){
				System.out.println("评论：");
				String com = sc.next();
				LogicUser.setComment(id, com);
				System.out.println("=================我的购物车===============");
				System.out.println(LogicCommodity.getAllPurComm().toString());
				System.out.println("总计：" + sum);
				System.out.println("==========================================");
			}else{
				System.out.println("无此商品");
			}
			break;

		default:
			break;
		}
	}

	private static void updateShoppingCart() {
		System.out.println("1、输入删除商品ID");
		System.out.println("2、更改商品数量");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		while (true) {
			switch (id) {
			case "EOF":
				System.out.println("是否查看订单");
				System.out.println("1、YES\t2、NO");
				Scanner sca = new Scanner(System.in);
				String Id = sca.next();
				switch (Id) {
				case "1":
					System.out
							.println("=================我的订单==================");
					System.out.println(LogicShoppingCart.getAllShopCarts());
					System.out
							.println("==========================================");
					break;

				default:

					break;
				}
				break;

			case "2":

				updateCommCount();

				break;

			default:
				if (LogicCommodity.checkId(id)) {
					if (LogicCommodity.deletePruComm(id)) {
						System.out
								.println("=================我的购物车===============");
						System.out.println(LogicCommodity.getAllPurComm());
						System.out
								.println("==========================================");
					} else {
						System.out.println("Not");
					}

				} else if (LogicCommodity.checkId(id) == false) {
					System.out.println("无此商品");
				}
				break;
			}
			id = sc.next();
		}
	}

	private static void updateCommCount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入商品ID");
		String id = sc.next();
		if (LogicCommodity.checkId(id)) {
			System.out.println("输入数量");
			Integer count = sc.nextInt();
			LogicCommodity.purNumber(id, count);
			sum = LogicCommodity.getTotal_Price(id, count);
			System.out.println("=================我的购物车===============");
			System.out.println(LogicShoppingCart.getAllShopCarts());
			System.out.println("==========================================");
		} else if (LogicCommodity.checkId(id) == false) {
			System.out.println("购物车无此商品");
		}

	}

	@SuppressWarnings("deprecation")
	public static void addShopCart(String Id) {
		Date data = new Date();
		dao.Dao.cartList.add(new ShoppingCart(Math.random() % 1000000 + "",
				LogicCommodity.getAllPurComm(), new Date(data.getYear(), data
						.getMonth(), data.getDate()), new Date(data.getYear(),
						data.getMonth(), data.getDate() + 3), new Date(data
						.getYear(), data.getMonth(), data.getDate(), data
						.getHours(), data.getMinutes()), "韵达", sum));
	}
}
