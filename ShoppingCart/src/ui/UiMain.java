package ui;

import java.util.Date;
import java.util.Scanner;

import logic.LogicUser;

public class UiMain {

	public static void main(String[] args) {

		System.out.println("1、用户登录");
		System.out.println("2、查看商品");
		System.out.println("\n请输入所需操作ID：");
		
		Scanner sc = new Scanner(System.in);
		String id = sc.next();

		switch (id) {
		case "EOF":
			break;
		case "2":
			Branch();
			break;
		default:
			Login();
			break;
		}
	}

	private static void Branch() {
		System.out.println("1、我的购物车");
		System.out.println("2、购买商品");
		System.out.println("\n请输入所需操作ID：");
		
		Scanner sc = new Scanner(System.in);
		Integer id = sc.nextInt();

		switch (id) {
		case 1:
			UiShoppingCart.getAllShopCarts();
			break;
		case 2:
			UiCommdity.getAllCommodity();
			break;
		default:
			break;
		}
	}

	@SuppressWarnings("deprecation")
	private static void Login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String name = sc.next();
		System.out.println("请输入密码");
		String pwd = sc.next();

		if (LogicUser.checkUser(name, pwd)) {
			Date data = new Date();
			System.out.println("欢迎\t" + LogicUser.getUserName(pwd) + "\t的访问");
			System.out.println("本次登录时间为"
					+ new Date(data.getYear(), data.getMonth(), data.getDate(),
							data.getHours(), data.getMinutes()) + "\n\n");
			Branch();

		} else {
			System.out.println("登录有误");
		}

	}
}
