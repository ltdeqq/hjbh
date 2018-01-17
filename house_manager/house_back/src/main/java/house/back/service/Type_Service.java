package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.bean.Type_manager;
import house.back.dao.Type_api;

@Service
public class Type_Service {
	@Autowired
	private Type_api type_api;
	public List<Type_manager> find(){
		return type_api.findAll();
	}
}
