package house.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.bean.Trade_area;
import house.back.dao.Trade_api;

@Service
public class Trade_Service {
  @Autowired
  private Trade_api trade;
  public List<Trade_area> findall(){
	  return trade.findAll();
  }
  public List<Trade_area> findbyid(Integer districtID){
	  return trade.findByDistrictID(districtID);
  }
  public void delete(Integer districtID) {
	  trade.delete(districtID);
  }
}
