package house.back.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.house.bean.Consult;
import house.back.service.Consult_ser;

@Controller
public class Consult_con {
	@Autowired
	private Consult_ser consult_ser;
	
	@RequestMapping(value="/consult")
	@ResponseBody
	public List<Consult> load(){
		return consult_ser.load();
	}
	@RequestMapping(value="/con_toadd")
	public String toadd(){
		return "back/con_add";
	}
	@RequestMapping(value="/con_add")
	public String add(Consult consult){
		System.out.println("consult:"+consult);
		consult.setCon_time(new Date());
		consult.setStatus("y");
		consult_ser.add(consult);
		return "back/jq";
	}
}
