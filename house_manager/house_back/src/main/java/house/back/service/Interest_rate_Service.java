package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.bean.Interest_rate;
import house.back.dao.Interest_rate_api;

@Service
public class Interest_rate_Service {
   @Autowired
   private Interest_rate_api in;
   public List<Interest_rate> find(){
	   return in.findAll();
   }
   public void add(Interest_rate i){
	   in.save(i);
   }
   public void delete(Integer id){
	   in.delete(id);
   }
  public void update(String rate_type,String rate_name,String status,Double rate_five,Double rate_many,java.util.Date rate_time,Integer rateID) {
	  in.update(rate_type,rate_name, status,rate_five,rate_many, rate_time, rateID);
	  
  }
  public Interest_rate load(Integer id) {
	  return in.findOne(id);
  }
}
