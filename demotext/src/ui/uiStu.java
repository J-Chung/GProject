package ui;

import java.util.Scanner;

import logic.LogicStu;

public class uiStu {

	public static void main(String arg[]) {

		System.out.println("1/ID��ѯ");
		System.out.println("2/All��ѯ");
		System.out.println("3/����");
		System.out.println("4/ɾ��");
		System.out.println("5/����");
		System.out.println("������:");

		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		switch (id) {
		case 1:
			getStuById();
			break;
		case 2:
			getAllStu();
			break;
		case 3:
			addStu();
			break;

		case 4:
			deleteStu();
			break;

		case 5:
			updateStu();
			break;
		default:
			break;
		}
	}

	private static void updateStu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID:");
		String Id = sc.next();
		System.out.println("Name:");
		String Name = sc.next();
		System.out.println("Sex:");
		String Sex = sc.next();

		if (LogicStu.updateStu(Id, Name, Sex)) {
			System.out.println("YES");
			System.out.println(LogicStu.getStuByID(Id).toString());
		} else {
			System.out.println("NOT");
		}
	}

	private static void deleteStu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID:");
		String Id = sc.next();

		if (LogicStu.deleteStu(Id)) {
			System.out.println("YES");
			System.out.println(LogicStu.getAllStu().toString());
		} else {
			System.out.println("NOT");
		}
	}

	private static void addStu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID:");
		String Id = sc.next();
		System.out.println("Name:");
		String Name = sc.next();
		System.out.println("Sex:");
		String Sex = sc.next();

		if (LogicStu.addStu(Id, Name, Sex)) {
			System.out.println("YES");
			System.out.println(LogicStu.getAllStu().toString());
		} else {
			System.out.println("NOT");
		}

	}

	private static void getAllStu() {
		System.out.println(LogicStu.getAllStu().toString());
	}

	private static void getStuById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID:");
		String Id = sc.next();

		if (LogicStu.getStuByID(Id) != null) {
			System.out.println(LogicStu.getStuByID(Id).toString());
		} else {
			System.out.println("NOT");
		}
	}

}
