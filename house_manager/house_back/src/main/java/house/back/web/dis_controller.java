package house.back.web;

import java.io.UnsupportedEncodingException;
import java.nio.channels.NonWritableChannelException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import demo.house.bean.District_manager;
import house.back.service.Distr_Service;
import house.back.service.Trade_Service;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

@Controller
public class dis_controller {
   @Autowired 
   Distr_Service dis_service;
   @Autowired
   Trade_Service tra_service;
   @RequestMapping(value="/find")//区域信息
   @ResponseBody
   public List<District_manager> find(){
	  return dis_service.find();
   }
   @RequestMapping(value="/delete_dis")//删除区域
   public ModelAndView delete(@RequestParam(name="districtID") Integer id){
	   ModelAndView mv=new ModelAndView();
	   tra_service.delete(id);
	   dis_service.delete(id);
	    mv.setViewName("redirect:/back/tables.html");
	    return mv;
   }
   @RequestMapping(value="/add")//添加区域
   public ModelAndView add(@RequestParam(name="district") String district){
	   System.out.println(district);
	   ModelAndView mv=new ModelAndView();
	   District_manager dis=new District_manager();
	   dis.setDistrict(district);
	   dis.setDis_time(new Date());
	   System.out.println(new Date());
	   dis.setStatus("y");
	   dis_service.add(dis);
	    mv.setViewName("redirect:/back/tables.html");
	    return mv;
   }
   @RequestMapping(value="/toupdate_dis")//准备修改区域
   @ResponseBody
   public District_manager toupdate_dis(@RequestParam(name="districtID") Integer districtID){
	  return dis_service.load(districtID);
   }
  
}
