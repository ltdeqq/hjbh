package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.bean.Storey_manager;
import house.back.dao.Storey_api;

@Service
public class Storey_Service {
	@Autowired
	private Storey_api storey_api;
	public List<Storey_manager> find(){
		return storey_api.findAll();
	}
}
