package house.back.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import demo.house.bean.Consult;
import demo.house.bean.House_information;
import house.back.api.houseImpl;
import house.back.dao.Consult_api;

@Service("consult_ser")
public class Consult_ser{
	@Autowired
	private Consult_api consult_api;
	
	public void add(Consult consult){
		consult_api.save(consult);
	}
	
	public List<Consult> load(){
		return consult_api.findAll();
	}
	
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("/app-core.xml");
		Consult_ser ser=(Consult_ser)app.getBean("consult_ser");
		
		Consult consult=new Consult();
		consult.setCon_time(new Date());
		consult.setConsult("汉水华城100层");
		consult.setStatus("y");
		consult.setSubstance("无天窗，享受自然，110");
		//ser.add(consult);
		
		for (Consult con : ser.load()) {
			System.out.println("咨询："+con);
		}
	}

}
