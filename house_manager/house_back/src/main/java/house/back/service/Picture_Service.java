package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.bean.Picture;
import house.back.dao.Picture_api;

@Service
public class Picture_Service {
   @Autowired
   private Picture_api pi;
   public List<Picture> find(){
	   return pi.findAll();
   }
   public void add(Picture p){
	   pi.save(p);
   }
   public void delete(Integer id){
	   pi.delete(id);
   }
  public void update(String picture,String status,java.util.Date pic_time,Integer pictureID) {
	  pi.update(picture, status, pic_time, pictureID);
	  
  }
  public Picture load(Integer id) {
	  return pi.findOne(id);
  }
}
