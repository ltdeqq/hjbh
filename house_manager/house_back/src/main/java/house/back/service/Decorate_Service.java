package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.bean.Decorate_manager;
import house.back.dao.Decorate_api;

@Service
public class Decorate_Service {
	@Autowired
	private Decorate_api decorate_api;
	public List<Decorate_manager> find(){
		return decorate_api.findAll();
	}
}
