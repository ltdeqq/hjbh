package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.bean.Decorate_manager;
import demo.house.bean.Type_manager;
import house.back.dao.Decorate_api;

@Service
public class Decorate_Service {
   @Autowired
   private Decorate_api de;
   public List<Decorate_manager> find(){
	   return de.findAll();
   }
   public void add(Decorate_manager d){
	   de.save(d);
   }
   public void delete(Integer id){
	   de.delete(id);
   }
  public void update(String decorate,String status,java.util.Date dec_time,Integer decorateID) {
	  de.update(decorate, status, dec_time, decorateID);
	  
  }
  public Decorate_manager load(Integer id) {
	  return de.findOne(id);
  }
}
