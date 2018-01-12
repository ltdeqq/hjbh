package house.back.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import demo.house.bean.Trade_area;
import house.back.service.Trade_Service;

@Controller
public class Trade_controller {
       @Autowired
       private Trade_Service ts;
       @RequestMapping(value="/findall")//区域信息
       @ResponseBody
       public List<Trade_area> find(){
    	  return ts.findall();
       }
       @RequestMapping(value="/trade_find")//根据区域查商圈
       @ResponseBody
       public List<Trade_area> trade_find(@RequestParam(name="districtID") Integer districtID){
    	   return ts.findbyid(districtID);
       }
}
