package dao;

import java.util.ArrayList;

import model.Student;

public class Dao {

	public static ArrayList<Student> list = new ArrayList<Student>();
	
	static{
		list.add(new Student("001", "С��", " ��"));
		list.add(new Student("001", "С��", " Ů"));
	}
}
