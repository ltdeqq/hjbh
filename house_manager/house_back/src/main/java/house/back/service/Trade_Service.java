package house.back.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.bean.Trade_area;
import house.back.dao.Trade_api;

@Service
public class Trade_Service {
  @Autowired
  private Trade_api tra;
  public List<Trade_area> findall(){
	  return tra.findAll();
  }
  public List<Trade_area> findbyid(Integer districtID){
	  return tra.findByDistrictID(districtID);
  }
  public void delete(Integer districtID) {
	  tra.deleteByDistrictID(districtID);
  }
  public void del(Integer tradeId) {
	  tra.delete(tradeId);
  }
  public void add_tra(Trade_area tr) {
	  tra.save(tr);
  }
  public Trade_area load(Integer id) {
	  return tra.findOne(id);
  }
  public void update(String trade,String status,Date tra_time,Integer tradeID) {
	  tra.update(trade, status, tra_time, tradeID);
  }
}
