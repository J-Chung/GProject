package dao;

import java.util.ArrayList;

import model.Student;

public class ArrayListStu implements InterfaceStu {

	@Override
	public Student getStuByID(String Id) {
		for (int i = 0; i < Dao.list.size(); i++) {
			if (Dao.list.get(i).getId().equals(Id)) {
				return Dao.list.get(i);
			}
		}
		return null;
	}

	@Override
	public ArrayList<Student> getAllStu() {
		return Dao.list;
	}

	@Override
	public boolean insertStu(Student stu) {
		for (int i = 0; i < Dao.list.size(); i++) {
			if (Dao.list.get(i).getId().equals(stu.getId()) == false) {
				Dao.list.add(stu);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteStu(String Id) {
		for (int i = 0; i < Dao.list.size(); i++) {
			if (Dao.list.get(i).getId().equals(Id)) {
				Dao.list.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateStu(Student stu) {
		for (int i = 0; i < Dao.list.size(); i++) {
			if (Dao.list.get(i).getId().equals(stu.getId())) {
				Dao.list.get(i).setId(stu.getId());
				Dao.list.get(i).setName(stu.getName());
				Dao.list.get(i).setSex(stu.getSex());
				return true;
			}
		}
		return false;
	}

}
