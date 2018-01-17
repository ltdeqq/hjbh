package house.back.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import demo.house.bean.District_manager;
import demo.house.bean.Trade_area;
import house.back.service.Trade_Service;

@Controller
public class Trade_controller {
       @Autowired
       private Trade_Service ts;
       @RequestMapping(value="/findall")//查询商圈信息
       @ResponseBody
       public List<Trade_area> find(){
    	  return ts.findall();
       }
       @RequestMapping(value="/trade_find")//根据区域查商圈
       @ResponseBody
       public List<Trade_area> trade_find(@RequestParam(name="districtID") Integer districtID){
    	   return ts.findbyid(districtID);
       }
       @RequestMapping(value="/delete_tra")//删除商圈
       public ModelAndView delete(@RequestParam(name="tradeID") Integer id){
    	   ModelAndView mv=new ModelAndView();
    	   ts.del(id);
    	    mv.setViewName("redirect:/back/district.html");
    	    return mv;
       }
       @RequestMapping(value="/add_trade")//添加商圈
       public ModelAndView add(@RequestParam(name="trade") String trade,@RequestParam(name="districtID") Integer districtID){
    	   System.out.println(trade);
    	   ModelAndView mv=new ModelAndView();
    	   Trade_area tr=new Trade_area();
    	   tr.setTrade(trade);
    	   tr.setDistrictID(districtID);
    	   tr.setTra_time(new Date());
    	   System.out.println(new Date());
    	   tr.setStatus("y");
    	   ts.add_tra(tr);;
    	    mv.setViewName("redirect:/back/district.html");
    	    return mv;
       }
       @RequestMapping(value="/toupdate_trade")//准备修改商圈
       @ResponseBody
       public Trade_area toupdate_tra(@RequestParam(name="tradeID") Integer tradeID){
    	  return ts.load(tradeID);
       }
       @RequestMapping(value="/update_trade")//修改商圈
       public ModelAndView update_tra(@RequestParam(name="tradeID") Integer tradeID,@RequestParam(name="tra_status") String tra_status,@RequestParam(name="tradename") String tradename){
    	   ModelAndView mv=new ModelAndView();
    	   ts.update(tradename, tra_status, new Date(), tradeID);
    	    mv.setViewName("redirect:/back/district.html");
    	    return mv;
       }
}
