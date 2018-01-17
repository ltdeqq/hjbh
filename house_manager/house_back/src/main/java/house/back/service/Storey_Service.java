package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import demo.house.bean.Storey_manager;

import house.back.dao.Storey_api;
@Service
public class Storey_Service {
	@Autowired
	private Storey_api sto;
	public List<Storey_manager> find(){
		   return sto.findAll();
	   }
	   public void add(Storey_manager st){
		   sto.save(st);
	   }
	   public void delete(Integer id){
		   sto.delete(id);
	   }
	  public void update(String storey,String status,java.util.Date sto_time,Integer storeyID) {
		  sto.update(storey, status, sto_time, storeyID);
		  
	  }
	  public Storey_manager load(Integer id) {
		  return sto.findOne(id);
	  }
}

