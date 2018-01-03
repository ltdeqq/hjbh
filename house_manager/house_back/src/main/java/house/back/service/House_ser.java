package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		return null;
	}

	public void add(Object obj) {
		// TODO Auto-generated method stub
		
	}

}
