package logic;

import java.util.ArrayList;

import model.Commodity;
import dao.InterfaceCommodity;
import dao.ListCommodity;

public class LogicCommodity {

	public static InterfaceCommodity list = new ListCommodity();

	public static ArrayList<Commodity> getAllCommodities() {
		return list.getAllCommodities();
	}

	public static Commodity getCommodityById(String Id) {
		return list.getCommodityById(Id);
	}

	public static boolean addComm(Commodity commodity) {
		return list.InsertComm(commodity);
	}

	public static boolean deletecomm(String Id) {
		return list.deleteComm(Id);
	}

	public static boolean updateComm(Commodity commodity) {
		return list.updateComm(commodity);
	}

	public static Double getTotal_Price(String Id, Integer Count) {
		return list.getTotal_Price(Id, Count);
	}

	public static Double getPrice(String Id) {
		return list.getPrice(Id);
	}

	public static boolean checkId(String Id) {
		for (int i = 0; i < getAllCommodities().size(); i++) {
			if (getAllCommodities().get(i).getId().equals(Id)) {
				return true;
			}
		}
		return false;
	}

	public static boolean getStatus(String Id) {
		return list.getStatus(Id);
	}

	public static boolean setStatus_True(String Id) {
		return list.setStatus_Ture(Id);
	}

	public static boolean setStatus_False(String Id) {
		return list.setStatus_False(Id);
	}

	public static boolean addPurComm(String Id) {
		return list.addPurComm(Id);
	}

	public static ArrayList<Commodity> getAllPurComm() {
		return list.getAllPurComm();
	}

	public static boolean deletePruComm(String Id) {
		return list.deletePurComm(Id);
	}

	public static boolean calculatNumber(String Id) {
		return list.calculatNumber(Id);
	}

	public static boolean purNumber(String Id, Integer Count) {
		return list.purNumber(Id, Count);
	}

	public static boolean checkPurCommId(String Id) {
		if (getAllPurComm().size() != 0) {
			for (int i = 0; i < getAllPurComm().size(); i++) {
				if (getAllPurComm().get(i).getId().equals(Id) == false) {
					return true;
				}
			}
		} else if (getAllPurComm().size() == 0)
			return true;
		return false;
	}
	
	public static boolean checkPurId(String Id){
		for (int i = 0; i < getAllPurComm().size(); i++) {
			if (getAllPurComm().get(i).getId().equals(Id)) {
				return true;
			}
		}
		return false;
	}
}
