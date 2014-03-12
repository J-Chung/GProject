package dao;

import java.util.ArrayList;

import model.Commodity;

public class ListCommodity implements InterfaceCommodity {

	@Override
	public ArrayList<Commodity> getAllCommodities() {
		return dao.Dao.commList;
	}

	@Override
	public Integer getCount() {
		return dao.Dao.commList.size();
	}

	@Override
	public boolean InsertComm(Commodity commodity) {
		for (int i = 0; i < dao.Dao.commList.size(); i++) {
			if (dao.Dao.commList.get(i).getId().equals(commodity.getId()) == false) {
				dao.Dao.commList.add(commodity);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteComm(String Id) {
		for (int i = 0; i < dao.Dao.commList.size(); i++) {
			if (dao.Dao.commList.get(i).getId().equals(Id)) {
				dao.Dao.commList.remove(dao.Dao.commList.get(i));
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateComm(Commodity commodity) {
		for (int i = 0; i < dao.Dao.commList.size(); i++) {
			if (dao.Dao.commList.get(i).getId().equals(commodity.getId())) {
				dao.Dao.commList.get(i).setComm_name(commodity.getComm_name());
				dao.Dao.commList.get(i).setCount(commodity.getCount());
				dao.Dao.commList.get(i).setDescription(
						commodity.getDescription());
				dao.Dao.commList.get(i).setId(commodity.getId());
				dao.Dao.commList.get(i).setPlace_origin(
						commodity.getPlace_origin());
				dao.Dao.commList.get(i).setWeight(commodity.getWeight());
				dao.Dao.commList.get(i).setPrice(commodity.getPrice());
				return true;
			}
		}
		return false;
	}

	static Double sum = 0.0;

	public Double getTotal_Price(String Id, Integer Count) {
		for (int i = 0; i < dao.Dao.commList.size(); i++) {
			if (dao.Dao.commList.get(i).getId().equals(Id)) {
				sum += dao.Dao.commList.get(i).getPrice() * Count;
				return sum;
			}
		}
		return 0.0;
	}

	@Override
	public Double getPrice(String Id) {
		for (int i = 0; i < dao.Dao.commList.size(); i++) {
			if (dao.Dao.commList.get(i).getId().equals(Id)) {
				return dao.Dao.commList.get(i).getPrice();
			}
		}
		return null;
	}

	@Override
	public boolean getStatus(String Id) {
		for (int i = 0; i < dao.Dao.commList.size(); i++) {
			if (dao.Dao.commList.get(i).getId().equals(Id)) {
				return dao.Dao.commList.get(i).isStatus();
			}
		}
		return false;
	}

	public boolean setStatus_Ture(String Id) {
		for (int i = 0; i < dao.Dao.commList.size(); i++) {
			if (dao.Dao.commList.get(i).getId().equals(Id)) {
				dao.Dao.commList.get(i).setStatus(true);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean setStatus_False(String Id) {
		for (int i = 0; i < dao.Dao.purchasedList.size(); i++) {
			if (dao.Dao.purchasedList.get(i).getId().equals(Id)) {
				dao.Dao.purchasedList.get(i).setStatus(false);
				return true;
			}
		}
		return false;
	}

	@Override
	public Commodity getCommodityById(String Id) {
		for (int i = 0; i < dao.Dao.commList.size(); i++) {
			if (dao.Dao.commList.get(i).getId().equals(Id)) {
				return dao.Dao.commList.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean addPurComm(String Id) {
		for (int i = 0; i < dao.Dao.commList.size(); i++) {
			if (dao.Dao.commList.get(i).getId().equals(Id)) {
				dao.Dao.purchasedList.add(dao.Dao.commList.get(i));
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Commodity> getAllPurComm() {
		return dao.Dao.purchasedList;
	}

	@Override
	public boolean deletePurComm(String Id) {
		for (int i = 0; i < dao.Dao.purchasedList.size(); i++) {
			if (dao.Dao.purchasedList.get(i).getId().equals(Id)) {
				dao.Dao.purchasedList.remove(dao.Dao.purchasedList.get(i));
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean calculatNumber(String Id) {
		for (int i = 0; i < dao.Dao.commList.size(); i++) {
			if (dao.Dao.commList.get(i).getId().equals(Id)) {
				dao.Dao.commList.get(i).setCount(
						dao.Dao.commList.get(i).getCount() - 1);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean purNumber(String Id, Integer Count) {
		for (int i = 0; i < dao.Dao.purchasedList.size(); i++) {
			if (dao.Dao.purchasedList.get(i).getId().equals(Id)) {
				dao.Dao.purchasedList.get(i).setCount(Count);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean setComment(String Id, String Comment) {
		for (int i = 0; i < dao.Dao.purchasedList.size(); i++) {
			if (dao.Dao.purchasedList.get(i).getId().equals(Id)) {
				dao.Dao.purchasedList.get(i).setComment(Comment);
				return true;
			}
		}
		return false;
	}

	@Override
	public String getComment(String Id) {
		for (int i = 0; i < dao.Dao.purchasedList.size(); i++) {
			if (dao.Dao.purchasedList.get(i).getId().equals(Id)) {
				return dao.Dao.purchasedList.get(i).getComment();
			}
		}
		return null;
	}

}
