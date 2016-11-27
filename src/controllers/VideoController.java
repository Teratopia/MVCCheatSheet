package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import data.VideoDao;
import entities.Customer;

@Controller
public class VideoController {

	@Autowired
	private VideoDao videoDao;
	
	@RequestMapping(path="GetCustomer.do")
	private ModelAndView getCustomer(int id) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("customer.jsp");
		Customer customer = videoDao.getCustomer(id);
		mv.addObject("cust", customer);
		
		return mv;
	}
	
}
