package house.back.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import demo.house.bean.Storey_manager;
import house.back.service.Storey_Service;

@Controller
public class Storey_controller {
	@Autowired
    private Storey_Service sto;
    @RequestMapping(value="/find_storey")//状态信息
    @ResponseBody
    public List<Storey_manager> find(){
 	  return sto.find();
    }
    @RequestMapping(value="/delete_storey")//删除状态
    public ModelAndView delete(@RequestParam(name="storeyID") Integer id){
 	   ModelAndView mv=new ModelAndView();
 	   sto.delete(id);
 	    mv.setViewName("redirect:/back/storey.html");
 	    return mv;
    }
    @RequestMapping(value="/add_storey")//添加状态
    public ModelAndView add(@RequestParam(name="storey") String storey){
 	   System.out.println(storey);
 	   ModelAndView mv=new ModelAndView();
 	   Storey_manager st=new Storey_manager();
 	   st.setStorey(storey);
 	   st.setSto_time(new Date());
 	   System.out.println(new Date());
 	   st.setStatus("y");
 	   sto.add(st);
 	    mv.setViewName("redirect:/back/storey.html");
 	    return mv;
    }
    @RequestMapping(value="/toupdate_storey")//准备修改状态
    @ResponseBody
    public Storey_manager toupdate_dis(@RequestParam(name="storeyID") Integer storeyID){
 	  return sto.load(storeyID);
    }
    @RequestMapping(value="/update_storey")//修改状态
    public ModelAndView update_dis(@RequestParam(name="storeyID") Integer storeyID,@RequestParam(name="status") String status,@RequestParam(name="storey") String storey){
 	   ModelAndView mv=new ModelAndView();
 	   sto.update(storey, status, new Date(), storeyID);
 	    mv.setViewName("redirect:/back/storey.html");
 	    return mv;
    }
}
