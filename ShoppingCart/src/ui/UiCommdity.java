package ui;

import java.util.Date;
import java.util.Scanner;

import logic.LogicCommodity;
import logic.LogicShoppingCart;
import logic.LogicUser;
import model.ShoppingCart;

public class UiCommdity {

	public static void getAllCommodity() {
		System.out.println("����");
		System.out.println(LogicCommodity.getAllCommodities());
		shopping();
	}

	private static Double sum = 0.0;

	public static void shopping() {
		System.out.println("���������蹺�����Ʒ���");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();

		while (true) {
			System.out.println("ִ�е���");
			switch (id) {
			case "EOF":
				System.out.println("ִ�е���EOF");
				System.out.println(sum);
				System.out.println("=================�ҵĹ��ﳵ===============");
				addShopCart(id);
				System.out.println(LogicCommodity.getAllPurComm());
				System.out.println("�ܼƣ�" + sum);
				System.out
						.println("==========================================");
				System.out.println("\n\n\n");
				System.out.println("=================�ҵĶ���==================");
				System.out.println(LogicShoppingCart.getAllShopCarts());
				System.out
						.println("==========================================");
				System.out.println("\n\n\n");
				System.out.println("�Ƿ���Ĺ��ﳵ");
				System.out.println("1��YES\t2��NO");
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
						System.out.println("ִ�е����ۼ�");
						System.out.println("������");
						Scanner scan = new Scanner(System.in);
						Integer count = scan.nextInt();
						sum = LogicCommodity.getTotal_Price(id, count);
						LogicCommodity.setStatus_True(id);
						LogicCommodity.addPurComm(id);
						LogicCommodity.calculatNumber(id);
						LogicCommodity.purNumber(id, count);
					} else if (LogicCommodity.checkPurCommId(id) == false) {
						System.out.println("�����ظ�����");
					}
				} else if (LogicCommodity.checkId(id) == false) {
					System.out.println("�޴���Ʒ");
				}

				break;
			}
			id = sc.next();
		}

	}

	private static void setComment() {
		System.out.println("�Ƿ���ѹ���Ʒ��������");
		System.out.println("1��YES\t2��NO");
		Scanner sca = new Scanner(System.in);
		String Id = sca.next();
		switch (Id) {
		case "1":
			System.out.println("=================�ҵĹ��ﳵ===============");
			System.out.println(LogicCommodity.getAllPurComm());
			System.out.println("�ܼƣ�" + sum);
			System.out.println("==========================================");
			System.out.println("������ƷID");
			Scanner sc= new Scanner(System.in);
			String id = sc.next();
			if(LogicCommodity.checkPurId(id)){
				System.out.println("���ۣ�");
				String com = sc.next();
				LogicUser.setComment(id, com);
				System.out.println("=================�ҵĹ��ﳵ===============");
				System.out.println(LogicCommodity.getAllPurComm().toString());
				System.out.println("�ܼƣ�" + sum);
				System.out.println("==========================================");
			}else{
				System.out.println("�޴���Ʒ");
			}
			break;

		default:
			break;
		}
	}

	private static void updateShoppingCart() {
		System.out.println("1������ɾ����ƷID");
		System.out.println("2��������Ʒ����");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		while (true) {
			switch (id) {
			case "EOF":
				System.out.println("�Ƿ�鿴����");
				System.out.println("1��YES\t2��NO");
				Scanner sca = new Scanner(System.in);
				String Id = sca.next();
				switch (Id) {
				case "1":
					System.out
							.println("=================�ҵĶ���==================");
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
								.println("=================�ҵĹ��ﳵ===============");
						System.out.println(LogicCommodity.getAllPurComm());
						System.out
								.println("==========================================");
					} else {
						System.out.println("Not");
					}

				} else if (LogicCommodity.checkId(id) == false) {
					System.out.println("�޴���Ʒ");
				}
				break;
			}
			id = sc.next();
		}
	}

	private static void updateCommCount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ƷID");
		String id = sc.next();
		if (LogicCommodity.checkId(id)) {
			System.out.println("��������");
			Integer count = sc.nextInt();
			LogicCommodity.purNumber(id, count);
			sum = LogicCommodity.getTotal_Price(id, count);
			System.out.println("=================�ҵĹ��ﳵ===============");
			System.out.println(LogicShoppingCart.getAllShopCarts());
			System.out.println("==========================================");
		} else if (LogicCommodity.checkId(id) == false) {
			System.out.println("���ﳵ�޴���Ʒ");
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
						.getHours(), data.getMinutes()), "�ϴ�", sum));
	}
}
