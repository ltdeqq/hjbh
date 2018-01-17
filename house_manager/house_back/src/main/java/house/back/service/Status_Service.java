package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.bean.Status_manager;
import house.back.dao.Status_api;

@Service
public class Status_Service {
	@Autowired
	private Status_api status_api;
	public List<Status_manager> find(){
		return status_api.findAll();
	}
}
