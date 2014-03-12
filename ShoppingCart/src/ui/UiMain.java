package ui;

import java.util.Date;
import java.util.Scanner;

import logic.LogicUser;

public class UiMain {

	public static void main(String[] args) {

		System.out.println("1���û���¼");
		System.out.println("2���鿴��Ʒ");
		System.out.println("\n�������������ID��");
		
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
		System.out.println("1���ҵĹ��ﳵ");
		System.out.println("2��������Ʒ");
		System.out.println("\n�������������ID��");
		
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
		System.out.println("�������û���");
		String name = sc.next();
		System.out.println("����������");
		String pwd = sc.next();

		if (LogicUser.checkUser(name, pwd)) {
			Date data = new Date();
			System.out.println("��ӭ\t" + LogicUser.getUserName(pwd) + "\t�ķ���");
			System.out.println("���ε�¼ʱ��Ϊ"
					+ new Date(data.getYear(), data.getMonth(), data.getDate(),
							data.getHours(), data.getMinutes()) + "\n\n");
			Branch();

		} else {
			System.out.println("��¼����");
		}

	}
}
