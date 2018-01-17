package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.bean.District_manager;
import demo.house.bean.Status_manager;
import house.back.dao.Distr_api;
import house.back.dao.Status_api;

@Service
public class Status_Service {
	@Autowired
	private Status_api st;
	public List<Status_manager> find(){
		   return st.findAll();
	   }
	   public void add(Status_manager sta){
		   st.save(sta);
	   }
	   public void delete(Integer id){
		   st.delete(id);
	   }
	  public void update(String sta_name,String status,java.util.Date sta_time,Integer statusID) {
		  st.update(sta_name, status, sta_time, statusID);
		  
	  }
	  public Status_manager load(Integer id) {
		  return st.findOne(id);
	  }
}
