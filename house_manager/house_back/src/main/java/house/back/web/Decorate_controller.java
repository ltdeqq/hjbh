package house.back.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import demo.house.bean.Decorate_manager;
import demo.house.bean.Type_manager;
import house.back.service.Decorate_Service;

@Controller
public class Decorate_controller {//装修度
   @Autowired
   private Decorate_Service deco;
   @RequestMapping(value="/find_decorate")
   @ResponseBody
   public List<Decorate_manager> find(){
	  return deco.find();
   }
   @RequestMapping(value="/delete_decorate")
   public ModelAndView delete(@RequestParam(name="decorateID") Integer id){
	   ModelAndView mv=new ModelAndView();
	   deco.delete(id);
	    mv.setViewName("redirect:/back/decorate.html");
	    return mv;
   }
   @RequestMapping(value="/add_decorate")
   public ModelAndView add(@RequestParam(name="decorate") String decorate){
	   System.out.println(decorate);
	   ModelAndView mv=new ModelAndView();
	   Decorate_manager st=new Decorate_manager();
	   st.setDecorate(decorate);
	   st.setDec_time(new Date());
	   System.out.println(new Date());
	   st.setStatus("y");
	   deco.add(st);
	    mv.setViewName("redirect:/back/decorate.html");
	    return mv;
   }
   @RequestMapping(value="/toupdate_decorate")
   @ResponseBody
   public Decorate_manager toupdate_dis(@RequestParam(name="decorateID") Integer decorateID){
	  return deco.load(decorateID);
   }
   @RequestMapping(value="/update_decorate")
   public ModelAndView update_dis(@RequestParam(name="decorateID") Integer decorateID,@RequestParam(name="status") String status,@RequestParam(name="decorate") String decorate){
	   ModelAndView mv=new ModelAndView();
	   deco.update(decorate, status, new Date(), decorateID);
	    mv.setViewName("redirect:/back/decorate.html");
	    return mv;
   }
}
