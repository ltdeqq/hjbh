package house.back.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import demo.house.bean.Picture;
import house.back.service.Picture_Service;

@Controller
public class Picture_controller {//新图库
   @Autowired
   private Picture_Service ps;
   @RequestMapping(value="/find_picture")
   @ResponseBody
   public List<Picture> find(){
	  return ps.find();
   }
   @RequestMapping(value="/delete_picture")
   public ModelAndView delete(@RequestParam(name="pictureID") Integer id){
	   ModelAndView mv=new ModelAndView();
	   ps.delete(id);
	    mv.setViewName("redirect:/back/picture.html");
	    return mv;
   }
   @RequestMapping(value="/add_picture")
   public ModelAndView add(@RequestParam(name="picture") String picture){
	   System.out.println(picture);
	   ModelAndView mv=new ModelAndView();
	   Picture st=new Picture();
	   st.setPicture(picture);
	   st.setPic_time(new Date());
	   System.out.println(new Date());
	   st.setStatus("y");
	   ps.add(st);
	    mv.setViewName("redirect:/back/picture.html");
	    return mv;
   }
   @RequestMapping(value="/toupdate_picture")
   @ResponseBody
   public Picture toupdate_dis(@RequestParam(name="pictureID") Integer pictureID){
	  return ps.load(pictureID);
   }
   @RequestMapping(value="/update_picture")
   public ModelAndView update_dis(@RequestParam(name="pictureID") Integer pictureID,@RequestParam(name="status") String status,@RequestParam(name="picture") String picture){
	   ModelAndView mv=new ModelAndView();
	   ps.update(picture, status, new Date(), pictureID);
	    mv.setViewName("redirect:/back/picture.html");
	    return mv;
   }
}
