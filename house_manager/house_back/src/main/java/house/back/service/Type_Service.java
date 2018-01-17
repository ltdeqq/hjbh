package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.bean.Storey_manager;
import demo.house.bean.Type_manager;
import house.back.dao.Storey_api;
import house.back.dao.Type_api;

@Service
public class Type_Service {
	@Autowired
	private Type_api ty;
	public List<Type_manager> find(){
		   return ty.findAll();
	   }
	   public void add(Type_manager t){
		   ty.save(t);
	   }
	   public void delete(Integer id){
		   ty.delete(id);
	   }
	  public void update(String type,String status,java.util.Date type_time,Integer typeID) {
		  ty.update(type, status, type_time, typeID);
		  
	  }
	  public Type_manager load(Integer id) {
		  return ty.findOne(id);
	  }
}
