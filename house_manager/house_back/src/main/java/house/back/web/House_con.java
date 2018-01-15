package house.back.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.house.bean.House_information;
import house.back.service.House_ser;

@Controller
public class House_con {
	@Autowired
	private House_ser house_ser;
	
	@RequestMapping(value="/house")
	@ResponseBody
	public List<House_information> list(Model model){
		return house_ser.find();
	}
	
	@RequestMapping(value="/house_toadd")
	public String toadd(){
		return "back/house_add";
	}
	@RequestMapping(value="/house_add")
	public String add(House_information house_information){
		house_information.setTime(new Date());
		house_information.setStatus("y");
		house_ser.add(house_information);
		return "back/house";
	}
}
