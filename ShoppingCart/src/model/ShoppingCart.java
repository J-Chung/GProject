package model;

import java.util.ArrayList;
import java.util.Date;

public class ShoppingCart {

	private String Id;
	private ArrayList<Commodity> CommodityList;
	private Date Order_date;
	private Date Arrival;
	private Date Today_date;
	private String Express;
	private Double Total_price;

	public ShoppingCart(String id, ArrayList<Commodity> commodityList, Date order_date,
			Date arrival, Date today_date, String express, Double total_price) {
		Id = id;
		CommodityList = commodityList;
		Order_date = order_date;
		Arrival = arrival;
		Today_date = today_date;
		Express = express;
		Total_price = total_price;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public ArrayList<Commodity> getCommodity() {
		return CommodityList;
	}

	public void setCommodity(ArrayList<Commodity> commodity) {
		CommodityList = commodity;
	}

	public Date getOrder_date() {
		return Order_date;
	}

	public void setOrder_date(Date order_date) {
		Order_date = order_date;
	}

	public Date getArrival() {
		return Arrival;
	}

	public void setArrival(Date arrival) {
		Arrival = arrival;
	}

	public Date getToday_date() {
		return Today_date;
	}

	public void setToday_date(Date today_date) {
		Today_date = today_date;
	}

	public String getExpress() {
		return Express;
	}

	public void setExpress(String express) {
		Express = express;
	}

	public Double getTotal_price() {
		return Total_price;
	}

	public void setTotal_price(Double total_price) {
		Total_price = total_price;
	}

	@Override
	public String toString() {
		return "ShoppingCart [Id=" + Id + "\n Commodity=" + CommodityList
				+ "\n Order_date=" + Order_date + "\n Arrival=" + Arrival
				+ "\n Today_date=" + Today_date + "\n Express=" + Express
				+ "\n Total_price=" + Total_price + "\n]";
	}

}
