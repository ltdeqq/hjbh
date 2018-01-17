package house.back.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.house.bean.Decorate_manager;
import demo.house.bean.District_manager;
import demo.house.bean.House_information;
import demo.house.bean.Status_manager;
import demo.house.bean.Storey_manager;
import demo.house.bean.Trade_area;
import demo.house.bean.Type_manager;
import house.back.service.Decorate_Service;
import house.back.service.Distr_Service;
import house.back.service.House_ser;
import house.back.service.Status_Service;
import house.back.service.Storey_Service;
import house.back.service.Trade_Service;
import house.back.service.Type_Service;

@Controller
public class House_con {
	@Autowired
	private House_ser house_ser;
	@Autowired
	private Distr_Service distr_ser;
	@Autowired
	private Trade_Service trade_ser;
	@Autowired
	private Status_Service status_Service;
	@Autowired
	private Decorate_Service decorate_Service;
	@Autowired
	private Storey_Service storey_Service;
	@Autowired
	private Type_Service type_Service;
	
	@RequestMapping(value="/house")
	@ResponseBody
	public List<House_information> list(Model model){
		return house_ser.find();
	}
	
	@RequestMapping(value="/house_toadd")//准备添加
	public String toadd(){
		return "back/house_add";
	}
	//添加需要的
	@RequestMapping(value="/house_add", method={RequestMethod.POST})
	public String add(House_information house_information){
		System.out.println("tianjia");
		house_information.setTime(new Date());
		house_information.setStatus("y");
		house_information.setMoney(house_information.getMoney().doubleValue());
		house_information.setCovered_area(house_information.getCovered_area().doubleValue());
		house_information.setFloor_space(house_information.getFloor_space().doubleValue());
		house_information.setGreen_rate(house_information.getGreen_rate().doubleValue());
		house_information.setPlot_ratio(house_information.getPlot_ratio().doubleValue());
		house_information.setProperty_rate(house_information.getProperty_rate().doubleValue());
		
		house_ser.add(house_information);
		return "back/house";
	}
	@RequestMapping(value="/distr")//区域
	@ResponseBody
	public List<District_manager> distr(){
		System.out.println("distr_ser:"+distr_ser.find());
		return distr_ser.find();
	}
	@RequestMapping(value="/trade")//商圈
	@ResponseBody
	public List<Trade_area> trade(@RequestParam(name="districtID", defaultValue="0") int districtID){
		System.out.println("districtID:"+districtID);
		return trade_ser.findbyid(districtID);
	}
	@RequestMapping(value="/status")//状态
	@ResponseBody
	public List<Status_manager> status(){
		return status_Service.find();
	}
	@RequestMapping(value="/type")//类型
	@ResponseBody
	public List<Type_manager> type(){
		return type_Service.find();
	}
	@RequestMapping(value="/storey")//楼型
	@ResponseBody
	public List<Storey_manager> storey(){
		return storey_Service.find();
	}
	@RequestMapping(value="/decorate")//装修度
	@ResponseBody
	public List<Decorate_manager> decorate(){
		return decorate_Service.find();
	}
	//准备修改
	@RequestMapping(value="/house_toupdate")
	@ResponseBody
	public House_information house_toupdate(@RequestParam(name="informationID", defaultValue="0") int informationID){
		System.out.println("information:"+house_ser.findByID(informationID));		
		return house_ser.findByID(informationID);
	}
	//修改
	@RequestMapping(value="/house_update")	
	public String house_update(House_information house_information){
		House_information old_house=house_ser.findByID(house_information.getInformationID());
		old_house.setAddress(house_information.getAddress());
		old_house.setCarport(house_information.getCarport());
		old_house.setCovered_area(house_information.getCovered_area());
		old_house.setDeveloper(house_information.getDeveloper());
		old_house.setFloor_space(house_information.getFloor_space());
		old_house.setGreen_rate(house_information.getGreen_rate());
		old_house.setHouse_area(house_information.getHouse_area());
		old_house.setHouse_name(house_information.getHouse_name());
		old_house.setLaunch_time(house_information.getLaunch_time());
		old_house.setLicence(house_information.getLicence());
		old_house.setMoney(house_information.getMoney());
		old_house.setOpen_picture(house_information.getOpen_picture());
		old_house.setOpen_time(house_information.getOpen_time());
		old_house.setPeripheral_support(house_information.getPeripheral_support());
		old_house.setPlot_ratio(house_information.getPlot_ratio());
		old_house.setPropelID(house_information.getPropelID());
		old_house.setProperty_company(house_information.getProperty_company());
		old_house.setProperty_rate(house_information.getProperty_rate());
		old_house.setSpace(house_information.getSpace());
		old_house.setSpecial_Offers(house_information.getSpecial_Offers());
		old_house.setStatus("y");
		old_house.setTel(house_information.getTel());
		old_house.setTime(new Date());
		house_ser.update(old_house);
		return "back/house";
	}
	
	//删除
	@RequestMapping(value="/house_delete")
	public String house_delete(@RequestParam(name="informationID", defaultValue="0") int informationID){
		System.out.println("house_delete:"+informationID);
		House_information house_information=house_ser.findByID(informationID);
		house_ser.delete(house_information);
		return "back/house";
	}
}
