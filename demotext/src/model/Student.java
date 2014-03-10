package model;

public class Student {
	private String Id;
	private String Name;
	private String Sex;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public Student(String id, String name, String sex) {
		Id = id;
		Name = name;
		Sex = sex;
	}

	public String toString() {
		return "ID:" + getId() + "Name:" + getName() + "Sex:" + getSex();
	}
}
