package logic;

import java.util.ArrayList;

import model.Student;
import dao.ArrayListStu;
import dao.InterfaceStu;

public class LogicStu {

	public static InterfaceStu list = new ArrayListStu();

	public static Student getStuByID(String Id) {
		return list.getStuByID(Id);
	}

	public static ArrayList<Student> getAllStu() {
		return list.getAllStu();
	}

	public static boolean addStu(String Id, String Name, String Sex) {
		return list.insertStu(new Student(Id, Name, Sex));
	}

	public static boolean deleteStu(String Id) {
		return list.deleteStu(Id);
	}

	public static boolean updateStu(String Id, String Name, String Sex) {
		return list.updateStu(new Student(Id, Name, Sex));
	}
}
