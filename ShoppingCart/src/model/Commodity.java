package model;

import java.util.Date;

public class Commodity {

	private String Id;
	private String Comm_name;
	private Date Production_date;
	private String Place_origin;
	private Double Price;
	private Double Weight;
	private String Description;
	private Integer Count;
	private boolean Status = false;
	private String Comment = null;

	public Commodity(String id, String comm_name, Date production_date,
			String place_origin, Double price, Double weight,
			String description, Integer count) {
		Id = id;
		Comm_name = comm_name;
		Production_date = production_date;
		Place_origin = place_origin;
		Price = price;
		Weight = weight;
		Description = description;
		Count = count;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public Integer getCount() {
		return Count;
	}

	public void setCount(Integer count) {
		Count = count;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getComm_name() {
		return Comm_name;
	}

	public void setComm_name(String comm_name) {
		Comm_name = comm_name;
	}

	public Date getProduction_date() {
		return Production_date;
	}

	public void setProduction_date(Date production_date) {
		Production_date = production_date;
	}

	public String getPlace_origin() {
		return Place_origin;
	}

	public void setPlace_origin(String place_origin) {
		Place_origin = place_origin;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Double getWeight() {
		return Weight;
	}

	public void setWeight(Double weight) {
		Weight = weight;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "\nCommodity \n[Id=" + Id + "\n Comm_name=" + Comm_name
				+ "\n Production_date=" + Production_date + "\n Place_origin="
				+ Place_origin + "\n Price=" + Price + "\n Weight=" + Weight
				+ "\n Description=" + Description + "\n Count=" + Count
				+ "\n Comment=" + Comment + "\n]";
	}

}
