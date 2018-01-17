package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import demo.house.bean.House_information;
import house.back.api.houseImpl;
import house.back.dao.House_api;

@Service
public class House_ser implements houseImpl{
	@Autowired
	private House_api house_api;
	
	public List<House_information> find() {
		// TODO Auto-generated method stub
		return house_api.findAll();
	}
	
	public House_information findByID(int informationID){
		return house_api.findByID(informationID);
	}
	
	public void add(House_information house) {
		// TODO Auto-generated method stub
		house_api.save(house);
	}
	
	public void delete(House_information house_information){
		house_api.delete(house_information);
	}
	
	public void update(House_information house_information){
		house_api.save(house_information);
	}

	public void add(Object obj) {
		// TODO Auto-generated method stub
	}

}
