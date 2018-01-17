package house.back.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import demo.house.bean.Type_manager;
import house.back.service.Type_Service;

@Controller
public class Type_controller {
	@Autowired
    private Type_Service ty;
    @RequestMapping(value="/find_type")//状态信息
    @ResponseBody
    public List<Type_manager> find(){
 	  return ty.find();
    }
    @RequestMapping(value="/delete_type")//删除状态
    public ModelAndView delete(@RequestParam(name="typeID") Integer id){
 	   ModelAndView mv=new ModelAndView();
 	   ty.delete(id);
 	    mv.setViewName("redirect:/back/type.html");
 	    return mv;
    }
    @RequestMapping(value="/add_type")//添加状态
    public ModelAndView add(@RequestParam(name="type") String type){
 	   System.out.println(type);
 	   ModelAndView mv=new ModelAndView();
 	   Type_manager st=new Type_manager();
 	   st.setType(type);
 	   st.setType_time(new Date());
 	   System.out.println(new Date());
 	   st.setStatus("y");
 	   ty.add(st);
 	    mv.setViewName("redirect:/back/type.html");
 	    return mv;
    }
    @RequestMapping(value="/toupdate_type")//准备修改状态
    @ResponseBody
    public Type_manager toupdate_dis(@RequestParam(name="typeID") Integer typeID){
 	  return ty.load(typeID);
    }
    @RequestMapping(value="/update_type")//修改状态
    public ModelAndView update_dis(@RequestParam(name="typeID") Integer typeID,@RequestParam(name="status") String status,@RequestParam(name="type") String type){
 	   ModelAndView mv=new ModelAndView();
 	   ty.update(type, status, new Date(), typeID);
 	    mv.setViewName("redirect:/back/type.html");
 	    return mv;
    }
}
