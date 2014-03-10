package dao;

import java.util.ArrayList;

import model.Student;

public interface InterfaceStu {

	public Student getStuByID(String Id);

	public ArrayList<Student> getAllStu();

	public boolean insertStu(Student stu);

	public boolean deleteStu(String Id);

	public boolean updateStu(Student stu);
}
