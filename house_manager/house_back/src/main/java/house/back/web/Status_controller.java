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
import demo.house.bean.Status_manager;
import house.back.service.Status_Service;

@Controller
public class Status_controller {
    @Autowired
    private Status_Service sta;
    @RequestMapping(value="/find_status")//状态信息
    @ResponseBody
    public List<Status_manager> find(){
 	  return sta.find();
    }
    @RequestMapping(value="/delete_status")//删除状态
    public ModelAndView delete(@RequestParam(name="statusID") Integer id){
 	   ModelAndView mv=new ModelAndView();
 	   sta.delete(id);
 	    mv.setViewName("redirect:/back/status.html");
 	    return mv;
    }
    @RequestMapping(value="/add_status")//添加状态
    public ModelAndView add(@RequestParam(name="sta_name") String sta_name){
 	   System.out.println(sta_name);
 	   ModelAndView mv=new ModelAndView();
 	   Status_manager st=new Status_manager();
 	   st.setSta_name(sta_name);
 	   st.setSta_time(new Date());
 	   System.out.println(new Date());
 	   st.setStatus("y");
 	   sta.add(st);
 	    mv.setViewName("redirect:/back/status.html");
 	    return mv;
    }
    @RequestMapping(value="/toupdate_status")//准备修改状态
    @ResponseBody
    public Status_manager toupdate_dis(@RequestParam(name="statusID") Integer statusID){
 	  return sta.load(statusID);
    }
    @RequestMapping(value="/update_status")//修改状态
    public ModelAndView update_dis(@RequestParam(name="statusID") Integer statusID,@RequestParam(name="status") String status,@RequestParam(name="sta_name") String sta_name){
 	   ModelAndView mv=new ModelAndView();
 	   sta.update(sta_name, status, new Date(), statusID);
 	    mv.setViewName("redirect:/back/status.html");
 	    return mv;
    }
}
