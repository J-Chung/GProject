package dao;

import java.util.ArrayList;

import model.Commodity;

public interface InterfaceCommodity {

	public ArrayList<Commodity> getAllCommodities();

	public Integer getCount();

	public Double getTotal_Price(String Id, Integer Count);

	public Double getPrice(String Id);

	public boolean getStatus(String Id);

	public Commodity getCommodityById(String Id);

	public boolean setStatus_Ture(String Id);

	public boolean setStatus_False(String Id);

	public boolean InsertComm(Commodity commodity);

	public boolean deleteComm(String Id);

	public boolean updateComm(Commodity commodity);

	public boolean addPurComm(String Id);

	public ArrayList<Commodity> getAllPurComm();

	public boolean deletePurComm(String Id);

	public boolean calculatNumber(String Id);

	public boolean purNumber(String Id, Integer Count);

	public boolean setComment(String Id,String Comment);

	public String getComment(String Id);
}
