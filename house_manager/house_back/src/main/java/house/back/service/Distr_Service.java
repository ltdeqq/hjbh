package house.back.service;

import java.sql.Date;
import java.util.List;

import javax.sound.midi.VoiceStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.bean.District_manager;
import house.back.dao.Distr_api;
@Service
public class Distr_Service{
   @Autowired
   private Distr_api dis;
   public List<District_manager> find(){
	   return dis.findAll();
   }
   public void add(District_manager di){
	   dis.save(di);
   }
   public void delete(Integer id){
	   dis.delete(id);
   }
  public void update(String district,String status,java.util.Date dis_time,Integer districtID) {
	  dis.update(district, status, dis_time, districtID);
	  
  }
  public District_manager load(Integer districtID) {
	  return dis.findOne(districtID);
  }
}
