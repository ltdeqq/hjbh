package house.back.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import demo.house.bean.Interest_rate;
import house.back.service.Interest_rate_Service;

@Controller
public class Interest_rate_controller {
    @Autowired
    private Interest_rate_Service ins;
    @RequestMapping(value="/find_interest_rate")//利率信息
    @ResponseBody
    public List<Interest_rate> find(){
 	  return ins.find();
    }
    @RequestMapping(value="/delete_interest_rate")//删除利率
    public ModelAndView delete(@RequestParam(name="rateID") Integer id){
 	   ModelAndView mv=new ModelAndView();
 	   ins.delete(id);
 	    mv.setViewName("redirect:/back/interest_rate.html");
 	    return mv;
    }
    @RequestMapping(value="/add_interest_rate")//添加利率
    public ModelAndView add(Interest_rate in){
 	   System.out.println(in);
 	   ModelAndView mv=new ModelAndView();
 	   in.setRate_time(new Date());
 	  in.setStatus("y");
 	   ins.add(in);
 	    mv.setViewName("redirect:/back/interest_rate.html");
 	    return mv;
    }
    @RequestMapping(value="/toupdate_interest_rate")//准备修改利率
    @ResponseBody
    public Interest_rate toupdate_dis(@RequestParam(name="rateID") Integer rateID){
 	  return ins.load(rateID);
    }
    @RequestMapping(value="/update_interest_rate")//修改lilv
    public ModelAndView update_dis(Interest_rate in){
 	   ModelAndView mv=new ModelAndView();
 	   ins.update(in.getRate_type(), in.getRate_name(),in.getStatus(),in.getRate_five(),in.getRate_many(), new Date(), in.getRateID());
 	    mv.setViewName("redirect:/back/interest_rate.html");
 	    return mv;
    }
}
