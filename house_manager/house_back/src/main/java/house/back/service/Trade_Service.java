package house.back.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import demo.house.bean.Consult;
import demo.house.bean.Trade_area;
import house.back.dao.Trade_api;

@Service("trade_ser")
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
  public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("/app-core.xml");
		Trade_Service ser=(Trade_Service)app.getBean("trade_ser");
		
			System.out.println("×ÉÑ¯£º"+ser.findbyid(1));
}
}
